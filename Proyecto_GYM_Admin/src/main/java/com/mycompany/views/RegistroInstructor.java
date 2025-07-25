/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.interfaces.DAOMiembros;
import com.mycompany.proyecto_gym_poo.DAOMiembrosImpl;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class RegistroInstructor extends javax.swing.JPanel {

    /**
     * Creates new form RegistroInstructor
     */
    boolean isEdition = false;
    com.mycompany.models.Miembros edicionMiembro;
    
    public RegistroInstructor() {
        initComponents();
        initStyles();
    }
    public RegistroInstructor(com.mycompany.models.Miembros usuario) {
        initComponents();
        isEdition = true;
        edicionMiembro = usuario;
        initStyles();
    }
    
    
    private void initStyles(){
        jButton1.setForeground(Color.black);
        botonesArea.add(botonYoga);
        botonesArea.add(botonZumba);
        botonesArea.add(botonTrain);
        botonesHorario.add(seis_nueveAM);
        botonesHorario.add(nueve_doce);
        botonesHorario.add(doce_tres);
        botonesHorario.add(tres_seis);
        botonesHorario.add(seis_nuevePM);
        botonesHorario.add(nueve_once);
        botonesDias.add(botonLunes);
        botonesDias.add(botonMartes);
        botonesDias.add(botonMiercoles);
        botonesDias.add(botonJueves);
        botonesDias.add(botonSabado);
        botonesDias.add(botonViernes);
        
        if (isEdition && edicionMiembro != null){
            jButton1.setText("Modificar");
            jTextField1.setText(edicionMiembro.getNombre());
            jTextField3.setText(edicionMiembro.getApellido());
            jTextField2.setText(edicionMiembro.getDocumento());
            jTextField4.setText(edicionMiembro.getTelefono());
            jTextField5.setText(edicionMiembro.getCorreo());
            if (edicionMiembro.getMemb_area().equals("Yoga")){
                botonYoga.setSelected(true);}
            else if (edicionMiembro.getMemb_area().equals("Zumba")){
                botonZumba.setSelected(true);}
            else {
                botonTrain.setSelected(true);}
            
            if (edicionMiembro.getDias().equals("Lunes")){
                botonLunes.setSelected(true);}
            else if (edicionMiembro.getDias().equals("Martes")){
                botonMartes.setSelected(true);}
            else if (edicionMiembro.getDias().equals("Miércoles")){
                botonMiercoles.setSelected(true);}
            else if (edicionMiembro.getDias().equals("Jueves")){
                botonJueves.setSelected(true);}
            else if (edicionMiembro.getDias().equals("Viernes")) {
                botonSabado.setSelected(true);
            }
            else {
                botonViernes.setSelected(true);
            }
            
            if (edicionMiembro.getHorario().equals(seis_nueveAM.getText())){
                seis_nueveAM.setSelected(true);}
            else if (edicionMiembro.getHorario().equals(nueve_doce.getText())){
                nueve_doce.setSelected(true);}
            else if (edicionMiembro.getHorario().equals(doce_tres.getText())){
                doce_tres.setSelected(true);}
            else if (edicionMiembro.getHorario().equals(tres_seis.getText())){
                tres_seis.setSelected(true);}
            else if (edicionMiembro.getHorario().equals(seis_nuevePM.getText())){
                seis_nuevePM.setSelected(true);}
            else {
                nueve_once.setSelected(true);
            }
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

        botonesArea = new javax.swing.ButtonGroup();
        botonesDias = new javax.swing.ButtonGroup();
        botonesHorario = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonYoga = new javax.swing.JRadioButton();
        botonZumba = new javax.swing.JRadioButton();
        botonTrain = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        seis_nueveAM = new javax.swing.JRadioButton();
        nueve_doce = new javax.swing.JRadioButton();
        doce_tres = new javax.swing.JRadioButton();
        tres_seis = new javax.swing.JRadioButton();
        nueve_once = new javax.swing.JRadioButton();
        seis_nuevePM = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        botonLunes = new javax.swing.JRadioButton();
        botonMartes = new javax.swing.JRadioButton();
        botonMiercoles = new javax.swing.JRadioButton();
        botonJueves = new javax.swing.JRadioButton();
        botonSabado = new javax.swing.JRadioButton();
        botonViernes = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(750, 455));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Correo electrónico");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(241, 178, 7));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Documento");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Área");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Número telefónico");

        botonYoga.setText("Yoga");
        botonYoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonYogaActionPerformed(evt);
            }
        });

        botonZumba.setText("Zumba");

        botonTrain.setText("Entrenamiento");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Horario");

        seis_nueveAM.setText("6:00 AM - 9:00 AM ");
        seis_nueveAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis_nueveAMActionPerformed(evt);
            }
        });

        nueve_doce.setText("9:00 AM - 12:00 PM ");
        nueve_doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve_doceActionPerformed(evt);
            }
        });

        doce_tres.setText("12:00 PM - 3:00 PM ");
        doce_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doce_tresActionPerformed(evt);
            }
        });

        tres_seis.setText("3:00 PM - 6:00 AM ");
        tres_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres_seisActionPerformed(evt);
            }
        });

        nueve_once.setText("9:00 PM - 11:00 PM ");
        nueve_once.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve_onceActionPerformed(evt);
            }
        });

        seis_nuevePM.setText("6:00 PM - 9:00 PM ");
        seis_nuevePM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis_nuevePMActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Días");

        botonLunes.setText("Lunes");
        botonLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLunesActionPerformed(evt);
            }
        });

        botonMartes.setText("Martes");
        botonMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMartesActionPerformed(evt);
            }
        });

        botonMiercoles.setText("Miércoles");
        botonMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMiercolesActionPerformed(evt);
            }
        });

        botonJueves.setText("Jueves");
        botonJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJuevesActionPerformed(evt);
            }
        });

        botonSabado.setText("Sábado");
        botonSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSabadoActionPerformed(evt);
            }
        });

        botonViernes.setText("Viernes");
        botonViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonViernesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(184, 184, 184))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(257, 257, 257)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonMartes)))
                        .addGap(18, 18, 18)
                        .addComponent(botonMiercoles)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tres_seis)
                                .addGap(18, 18, 18)
                                .addComponent(seis_nuevePM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nueve_once))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(seis_nueveAM, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nueve_doce)
                                .addGap(6, 6, 6)
                                .addComponent(doce_tres)
                                .addGap(8, 8, 8)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonJueves)
                                .addGap(37, 37, 37)
                                .addComponent(botonViernes))
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addComponent(botonSabado)
                        .addGap(73, 73, 73))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonYoga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19)
                        .addComponent(botonZumba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTrain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(391, 391, 391))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonLunes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMartes)
                            .addComponent(botonMiercoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonSabado)
                            .addComponent(botonJueves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonViernes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextField3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seis_nueveAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nueve_doce)
                            .addComponent(doce_tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tres_seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seis_nuevePM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nueve_once))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonYoga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonZumba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonTrain)))
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField4)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonYogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonYogaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonYogaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = jTextField1.getText();
        String apellido = jTextField3.getText();
        String documento = jTextField2.getText();
        String area = "";
        if (botonYoga.isSelected())
            area = botonYoga.getText();
        if (botonZumba.isSelected())
            area = botonZumba.getText();
        if (botonTrain.isSelected())
            area = botonTrain.getText();
        String telefono = jTextField4.getText();
        String correo = jTextField5.getText();
        String dias = "";
        if (botonLunes.isSelected())
            dias = botonLunes.getText();
        if (botonMartes.isSelected())
            dias = botonMartes.getText();
        if (botonMiercoles.isSelected())
            dias = botonMiercoles.getText();
        if (botonJueves.isSelected())
            dias = botonJueves.getText();
        if (botonSabado.isSelected())
            dias = botonSabado.getText();
        if (botonViernes.isSelected())
            dias = botonViernes.getText();
        String horario = "";
        if (seis_nueveAM.isSelected())
            horario = seis_nueveAM.getText();
        if (nueve_doce.isSelected())
            horario = nueve_doce.getText();
        if (doce_tres.isSelected())
            horario = doce_tres.getText();
        if (tres_seis.isSelected())
            horario = tres_seis.getText();
        if (seis_nuevePM.isSelected())
            horario = seis_nuevePM.getText();
        if (nueve_once.isSelected())
            horario = nueve_once.getText();
        
        
        if (nombre.isEmpty() || apellido.isEmpty() || documento.isEmpty() || area.isEmpty() || telefono.isEmpty() || correo.isEmpty() || dias.isEmpty() || horario.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
            return;
        }
        
        
        com.mycompany.models.Miembros user = isEdition ? edicionMiembro : new com.mycompany.models.Miembros();
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setDocumento(documento);
        user.setMemb_area(area);
        user.setTelefono(telefono);
        user.setCorreo(correo);
        user.setDias(dias);
        user.setHorario(horario);
        user.setPago(true);
        
        try{
            DAOMiembros dao = new DAOMiembrosImpl();
            if (!isEdition)
                dao.registrar(user);
            else
                dao.modificar(user);
            String mensajeExi = isEdition ? "modificado" : "registrado";
            javax.swing.JOptionPane.showMessageDialog(this,"Usuario " +  mensajeExi + " exitosamente \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            if (!isEdition){
                jTextField1.setText("");
                jTextField3.setText("");
                jTextField2.setText("");
                botonesArea.clearSelection();
                jTextField4.setText("");
                jTextField5.setText("");
                botonesDias.clearSelection();
                botonesHorario.clearSelection();
            }
        } catch (Exception e){
            String mensajeErr = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this,"Ocurrio un error al " + mensajeErr + " el usuario \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void seis_nueveAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis_nueveAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seis_nueveAMActionPerformed

    private void nueve_doceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve_doceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nueve_doceActionPerformed

    private void doce_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doce_tresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doce_tresActionPerformed

    private void tres_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_seisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tres_seisActionPerformed

    private void nueve_onceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve_onceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nueve_onceActionPerformed

    private void seis_nuevePMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis_nuevePMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seis_nuevePMActionPerformed

    private void botonLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLunesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLunesActionPerformed

    private void botonMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMartesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMartesActionPerformed

    private void botonMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMiercolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMiercolesActionPerformed

    private void botonJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJuevesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJuevesActionPerformed

    private void botonSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSabadoActionPerformed

    private void botonViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonViernesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonViernesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonJueves;
    private javax.swing.JRadioButton botonLunes;
    private javax.swing.JRadioButton botonMartes;
    private javax.swing.JRadioButton botonMiercoles;
    private javax.swing.JRadioButton botonSabado;
    private javax.swing.JRadioButton botonTrain;
    private javax.swing.JRadioButton botonViernes;
    private javax.swing.JRadioButton botonYoga;
    private javax.swing.JRadioButton botonZumba;
    private javax.swing.ButtonGroup botonesArea;
    private javax.swing.ButtonGroup botonesDias;
    private javax.swing.ButtonGroup botonesHorario;
    private javax.swing.JRadioButton doce_tres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton nueve_doce;
    private javax.swing.JRadioButton nueve_once;
    private javax.swing.JRadioButton seis_nueveAM;
    private javax.swing.JRadioButton seis_nuevePM;
    private javax.swing.JRadioButton tres_seis;
    // End of variables declaration//GEN-END:variables
}
