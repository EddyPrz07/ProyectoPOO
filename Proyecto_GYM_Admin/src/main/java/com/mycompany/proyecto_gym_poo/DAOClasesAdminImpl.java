package com.mycompany.proyecto_gym_poo;

import com.mycompany.db.DataBase;
import com.mycompany.interfaces.DAOClasesAdmin;
import com.mycompany.models.ClasesAdmin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOClasesAdminImpl extends DataBase implements DAOClasesAdmin{

        
    @Override
    public void modificar(ClasesAdmin clase) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE clasesadmins SET horario = ?,instructor = ?,area = ?,estado = ?,cupos = ? WHERE id = ?");
            st.setString(1, clase.getHorario());
            st.setString(2, clase.getInstructor());
            st.setString(3, clase.getArea());
            st.setBoolean(4, clase.isEstado());
            st.setInt(5, clase.getCupos());
            st.setInt(6, clase.getID());
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
    public List<ClasesAdmin> listar() throws Exception{
    List<ClasesAdmin> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `clasesadmins`");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                ClasesAdmin clase = new ClasesAdmin();
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
    public ClasesAdmin obtenerClasePorID(int claseID) throws Exception {
        ClasesAdmin clase = new ClasesAdmin();
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
    
}
