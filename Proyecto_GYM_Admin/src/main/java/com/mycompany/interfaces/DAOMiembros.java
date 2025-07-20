package com.mycompany.interfaces;

import com.mycompany.models.Miembros;
import java.util.List;

public interface DAOMiembros {
    public void registrar(Miembros miembro) throws Exception;
    public void modificar(Miembros miembro) throws Exception;
    public void eliminar(int miembroID) throws Exception;
    public List<Miembros> listar(String nombre) throws Exception;
    public Miembros obtenerUsuarioPorID(int miembroID) throws Exception;
    
    
}
