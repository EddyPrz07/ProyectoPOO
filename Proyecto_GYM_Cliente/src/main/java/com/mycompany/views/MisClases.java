/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.interfaces.DAOClasesCL;
import com.mycompany.interfaces.DAOInscripciones;
import com.mycompany.proyecto_gym_admin.DAOClasesCLImpl;
import com.mycompany.proyecto_gym_admin.DAOInscripcionesImpl;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class MisClases extends javax.swing.JPanel {

    /**
     * Creates new form MisClases
     */
    public MisClases() {
        initComponents();
        initStyles();
        cargarMisClases();
    }

    private void initStyles(){
        jLabel1.setForeground(Color.black);
        buttonCancelar.setForeground(Color.black);
    }
    
    
    private void cargarMisClases(){
         try{
            DAOInscripciones dao = new DAOInscripcionesImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getID(),u.getDia(),u.getHorario(),u.getArea(),u.getInstructor()}));
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Dia", "Horario", "Area", "Instructor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GYM SAN CARLOS");

        buttonCancelar.setBackground(new java.awt.Color(241, 178, 7));
        buttonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setBorderPainted(false);
        buttonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(271, 271, 271)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        DAOClasesCL dao = new DAOClasesCLImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRows().length < 1){
            javax.swing.JOptionPane.showMessageDialog(this,"Debes seleccionar uno o mas miembros a eliminar\n", "AVISO",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else{
            int claseID = (int) jTable1.getValueAt(jTable1.getSelectedRow(),0);
            for (int i : jTable1.getSelectedRows()){
                try{
                dao.cancelar((int) jTable1.getValueAt(i,0),dao.obtenerClasePorID(claseID));
                model.removeRow(i);
                javax.swing.JOptionPane.showMessageDialog(this,"Cancelacion registrada exitosamente \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        }
    }//GEN-LAST:event_buttonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
