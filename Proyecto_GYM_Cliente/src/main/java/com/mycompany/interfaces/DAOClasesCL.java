package com.mycompany.interfaces;

import com.mycompany.models.ClasesCL;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface DAOClasesCL {
    
    public ClasesCL obtenerClasePorID(int claseID) throws Exception;
    public List<ClasesCL> listar() throws Exception;
    public void cancelar(int claseID,ClasesCL clase) throws Exception;
    
}
