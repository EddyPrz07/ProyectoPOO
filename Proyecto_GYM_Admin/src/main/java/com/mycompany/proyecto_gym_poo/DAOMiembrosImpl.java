package com.mycompany.proyecto_gym_poo;

import com.mycompany.db.DataBase;
import com.mycompany.interfaces.DAOMiembros;
import com.mycompany.models.Miembros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOMiembrosImpl extends DataBase implements DAOMiembros{

    @Override
    public void registrar(Miembros miembro) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO miembross(ID, Nombre, Apellido, Documento, Memb_Area, Telefono, Correo, Dias, Horario, Pago) VALUES(?,?,?,?,?,?,?,?,?,?);");
            st.setInt(1, miembro.getID());
            st.setString(2, miembro.getNombre());
            st.setString(3, miembro.getApellido());
            st.setString(4, miembro.getDocumento());
            st.setString(5, miembro.getMemb_area());
            st.setString(6, miembro.getTelefono());
            st.setString(7, miembro.getCorreo());
            st.setString(8, miembro.getDias());
            st.setString(9, miembro.getHorario());
            st.setBoolean(10, miembro.isPago());
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
    public void modificar(Miembros miembro) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE miembross SET nombre = ?,apellido = ?,documento = ?,memb_area = ?,telefono = ?,correo = ?,dias = ?,horario = ? WHERE id = ?");
            st.setString(1, miembro.getNombre());
            st.setString(2, miembro.getApellido());
            st.setString(3, miembro.getDocumento());
            st.setString(4, miembro.getMemb_area());
            st.setString(5, miembro.getTelefono());
            st.setString(6, miembro.getCorreo());
            st.setString(7, miembro.getDias());
            st.setString(8, miembro.getHorario());
            st.setInt(9, miembro.getID());
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
    public void eliminar(int miembroID) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM miembross WHERE id = ?;");
            st.setInt(1,miembroID);
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
    public List<Miembros> listar(String nombre) throws Exception {
        List<Miembros> lista = null;
        try{
            this.Conectar();
            String Query = nombre.isEmpty() ? "SELECT * FROM `miembross`" : "SELECT * FROM `miembross` WHERE Nombre LIKE '%" + nombre + "%'";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Miembros user = new Miembros();
                user.setID(rs.getInt("ID"));
                user.setNombre(rs.getString("Nombre"));
                user.setApellido(rs.getString("Apellido"));
                user.setDocumento(rs.getString("Documento"));
                user.setMemb_area(rs.getString("Memb_area"));
                user.setTelefono(rs.getString("Telefono"));
                user.setCorreo(rs.getString("Correo"));
                user.setDias(rs.getString("Dias"));
                user.setHorario(rs.getString("Horario"));
                user.setPago(rs.getBoolean("Pago"));
                lista.add(user);
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
    public Miembros obtenerUsuarioPorID(int miembroID) throws Exception {
        Miembros user = new Miembros();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM miembross WHERE id = ? LIMIT 1");
            st.setInt(1,miembroID);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                user.setID(rs.getInt("ID"));
                user.setNombre(rs.getString("Nombre"));
                user.setApellido(rs.getString("Apellido"));
                user.setDocumento(rs.getString("Documento"));
                user.setMemb_area(rs.getString("Memb_area"));
                user.setTelefono(rs.getString("Telefono"));
                user.setCorreo(rs.getString("Correo"));
                user.setDias(rs.getString("Dias"));
                user.setHorario(rs.getString("Horario"));
                user.setPago(rs.getBoolean("Pago"));
            }
            rs.close();
            st.close();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            this.Cerrar();}
        return user;
    }
    
}
