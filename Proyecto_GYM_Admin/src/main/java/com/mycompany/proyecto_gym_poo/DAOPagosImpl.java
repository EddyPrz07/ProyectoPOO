/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_gym_poo;

import com.mycompany.db.DataBase;
import com.mycompany.interfaces.DAOPagos;
import com.mycompany.models.Pagos;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class DAOPagosImpl extends DataBase implements DAOPagos{

    @Override
    public void registrar(Pagos pago) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO pagos(Fecha, Membresia, Valor) VALUES(?,?,?);");
            st.setString(1, pago.getFecha());
            st.setString(2, pago.getMembresia());
            st.setInt(3, pago.getValor());
            st.executeUpdate();
            st.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
    }
    
    
    
}
