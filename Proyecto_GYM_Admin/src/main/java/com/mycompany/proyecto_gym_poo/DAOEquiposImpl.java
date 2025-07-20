package com.mycompany.proyecto_gym_poo;

import com.mycompany.db.DataBase;
import com.mycompany.interfaces.DAOEquipos;
import com.mycompany.models.Equipos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOEquiposImpl extends DataBase implements DAOEquipos{

    @Override
    public void agregar(Equipos equipo) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO equiposs(ID,Nombre, Cantidad) VALUES(?,?,?);");
            st.setInt(1, equipo.getID());
            st.setString(2, equipo.getNombre());
            st.setInt(3, equipo.getCantidad());
            st.executeUpdate();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
    }
    
    @Override
    public List<Equipos> listar(String nombreEquipo) throws Exception {
        List<Equipos> lista = null;
        try{
            this.Conectar();
            String Query = nombreEquipo.isEmpty() ? "SELECT * FROM `equiposs`" : "SELECT * FROM `equiposs` WHERE Nombre LIKE '%" + nombreEquipo + "%'";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Equipos equipo = new Equipos();
                equipo.setID(rs.getInt("ID"));
                equipo.setNombre(rs.getString("Nombre"));
                equipo.setCantidad(rs.getInt("Cantidad"));
                lista.add(equipo);
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
    public Equipos obtenerEquipoPorID(int equipoID) throws Exception {
        Equipos equipo = new Equipos();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM equiposs WHERE id = ? LIMIT 1");
            st.setInt(1,equipoID);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                equipo.setID(rs.getInt("ID"));
                equipo.setNombre(rs.getString("Nombre"));
                equipo.setCantidad(rs.getInt("Cantidad"));
            }
            rs.close();
            st.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
        return equipo;
    }
    
    
    @Override
    public void modificar(Equipos equipo) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE equiposs SET nombre = ?,cantidad = ? WHERE id = ?");
            st.setString(1, equipo.getNombre());
            st.setInt(2, equipo.getCantidad());
            st.setInt(3, equipo.getID());
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
