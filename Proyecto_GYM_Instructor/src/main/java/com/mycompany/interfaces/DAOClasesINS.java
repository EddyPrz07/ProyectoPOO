package com.mycompany.interfaces;

import com.mycompany.models.ClasesINS;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface DAOClasesINS {
    
    public ClasesINS obtenerClasePorID(int claseID) throws Exception;
    public List<ClasesINS> listar() throws Exception;
    public void cancelacion(int claseID) throws Exception;
    
}
