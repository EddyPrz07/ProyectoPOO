/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto_gym_instructor;

import com.mycompany.db.DataBaseINS;
import com.mycompany.interfaces.DAOAsistencia;
import com.mycompany.models.Asistencias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DAOAsistenciasImpl extends DataBaseINS implements DAOAsistencia {
    
    
    @Override
    public Asistencias obtenerAsistenciaPorID(int asisID) throws Exception {
        Asistencias asistencia = new Asistencias();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM asistencias WHERE id = ? LIMIT 1");
            st.setInt(1,asisID);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                asistencia.setID(rs.getInt("ID"));
                asistencia.setArea(rs.getString("Area"));
                asistencia.setFecha(rs.getString("Fecha"));
                asistencia.setHorario(rs.getString("Horario"));
                asistencia.setNombre(rs.getString("Nombre"));
                asistencia.setApellido(rs.getString("Apellido"));
            }
            rs.close();
            st.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
        return asistencia;
    }

    @Override
    public void modificar(Asistencias asistencia) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE asistencias SET Area = ?,Fecha = ?,Horario = ?,Nombre = ?,Apellido = ? WHERE id = ?");
            st.setString(1, asistencia.getArea());
            st.setString(2, asistencia.getFecha());
            st.setString(3, asistencia.getHorario());
            st.setString(4, asistencia.getNombre());
            st.setString(5, asistencia.getApellido());
            st.setInt(6, asistencia.getID());
            st.executeUpdate();
            st.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
    }

    @Override
    public void agregar(Asistencias asistencia) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO asistencias(ID,Area, Fecha, Horario, Nombre, Apellido) VALUES(?,?,?,?,?,?);");
            st.setInt(1, asistencia.getID());
            st.setString(2, asistencia.getArea());
            st.setString(3, asistencia.getFecha());
            st.setString(4, asistencia.getHorario());
            st.setString(5, asistencia.getNombre());
            st.setString(6, asistencia.getApellido());
            st.executeUpdate();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
    }

    @Override
    public List<Asistencias> listar(String asistente) throws Exception {
        List<Asistencias> lista = null;
        try{
            this.Conectar();
            String Query = asistente.isEmpty() ? "SELECT * FROM `asistencias`" : "SELECT * FROM `asistencias` WHERE Nombre LIKE '%" + asistente + "%'";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Asistencias asistencia = new Asistencias();
                asistencia.setID(rs.getInt("ID"));
                asistencia.setArea(rs.getString("Area"));
                asistencia.setFecha(rs.getString("Fecha"));
                asistencia.setHorario(rs.getString("Horario"));
                asistencia.setNombre(rs.getString("Nombre"));
                asistencia.setApellido(rs.getString("Apellido"));
                lista.add(asistencia);
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
