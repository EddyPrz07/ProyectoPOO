/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_gym_admin;

import com.mycompany.db.DataBaseCL;
import com.mycompany.interfaces.DAOClasesCL;
import com.mycompany.models.ClasesCL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DAOClasesCLImpl extends DataBaseCL implements DAOClasesCL{

    @Override
    public ClasesCL obtenerClasePorID(int claseID) throws Exception {
        ClasesCL clase = new ClasesCL();
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
    public List<ClasesCL> listar() throws Exception {
        List<ClasesCL> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `clasesadmins`");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                ClasesCL clase = new ClasesCL();
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
            st.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
        this.Cerrar();}
        return lista;
    }
    
    @Override
    public void cancelar(int claseID,ClasesCL clase) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE clasesadmins SET Cupos = ? WHERE ID = ?");
            st.setInt(1, clase.getCupos() + 1);
            st.setInt(2, clase.getID());
            st.executeUpdate();
            st.close();
            PreparedStatement st2 = this.conexion.prepareStatement("DELETE FROM inscripciones WHERE id = ?;");
            st2.setInt(1,claseID);
            st2.executeUpdate();
            st2.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
    }
    
}
