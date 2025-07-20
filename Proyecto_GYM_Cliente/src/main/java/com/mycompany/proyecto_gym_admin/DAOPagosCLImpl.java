/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_gym_admin;

import com.mycompany.db.DataBaseCL;
import com.mycompany.models.Pagos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.interfaces.DAOPagosCL;

/**
 *
 * @author Usuario
 */
public class DAOPagosCLImpl extends DataBaseCL implements DAOPagosCL{
    
    @Override
    public List<Pagos> listar() throws Exception{
        List<Pagos> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `pagos`");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Pagos pago = new Pagos();
                pago.setFecha(rs.getString("Fecha"));
                pago.setMembresia(rs.getString("Membresia"));
                pago.setValor(rs.getInt("Valor"));
                lista.add(pago);
            }
            rs.close();
            st.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
        this.Cerrar();}
        return lista;
    }
    
    
}
