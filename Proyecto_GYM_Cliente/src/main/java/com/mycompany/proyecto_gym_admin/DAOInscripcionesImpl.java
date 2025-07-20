/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_gym_admin;

import com.mycompany.db.DataBaseCL;
import com.mycompany.interfaces.DAOInscripciones;
import com.mycompany.models.ClasesCL;
import com.mycompany.models.Inscripciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DAOInscripcionesImpl extends DataBaseCL implements DAOInscripciones{

    @Override
    public void inscripcion(ClasesCL clase,Inscripciones inscripcion) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO inscripciones(ID, Dia, Horario, Area, Instructor) VALUES(?,?,?,?,?);");
            st.setInt(1, inscripcion.getID());
            st.setString(2, inscripcion.getDia());
            st.setString(3, inscripcion.getHorario());
            st.setString(4, inscripcion.getArea());
            st.setString(5, inscripcion.getInstructor());
            st.executeUpdate();
            st.close();
            PreparedStatement st2 = this.conexion.prepareStatement("UPDATE clasesadmins SET Cupos = ? WHERE id = ?");
            st2.setInt(1, clase.getCupos() - 1);
            st2.setInt(2, clase.getID());
            st2.executeUpdate();
            st2.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
    }

    @Override
    public List<Inscripciones> listar() throws Exception {
        List<Inscripciones> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `inscripciones`");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Inscripciones inscripcion = new Inscripciones();
                inscripcion.setID(rs.getInt("ID"));
                inscripcion.setDia(rs.getString("Dia"));
                inscripcion.setHorario(rs.getString("Horario"));
                inscripcion.setArea(rs.getString("Area"));
                inscripcion.setInstructor(rs.getString("Instructor"));
                lista.add(inscripcion);
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
