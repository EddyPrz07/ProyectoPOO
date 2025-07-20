/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_gym_instructor;

import com.mycompany.db.DataBaseINS;
import com.mycompany.interfaces.DAOClasesINS;
import com.mycompany.models.ClasesINS;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DAOClasesINSImpl extends DataBaseINS implements DAOClasesINS{
    
    @Override
    public List<ClasesINS> listar() throws Exception {
        List<ClasesINS> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `clasesadmins`");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                ClasesINS clase = new ClasesINS();
                clase.setID(rs.getInt("ID"));
                clase.setDia(rs.getString("Dia"));
                clase.setHorario(rs.getString("Horario"));
                clase.setInstructor(rs.getString("Instructor"));
                clase.setArea(rs.getString("Area"));
                clase.setEstado(rs.getBoolean("Estado"));
                clase.setCupos(rs.getInt("Cupos"));
                lista.add(clase);
            }
            rs.close();
            st.close();}
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
        return lista;
    }

    @Override
    public ClasesINS obtenerClasePorID(int claseID) throws Exception {
        ClasesINS clase = new ClasesINS();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM clasesadmins WHERE id = ? LIMIT 1");
            st.setInt(1,claseID);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                clase.setID(rs.getInt("ID"));
                clase.setDia(rs.getString("Dia"));
                clase.setHorario(rs.getString("Horario"));
                clase.setInstructor(rs.getString("Instructor"));
                clase.setEstado(rs.getBoolean("Estado"));
                clase.setCupos(rs.getInt("Cupos"));
            }
            rs.close();
            st.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
        return clase;
    }
    

    @Override
    public void cancelacion(int claseID) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM clasesadmins WHERE id = ?;");
            st.setInt(1,claseID);
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
