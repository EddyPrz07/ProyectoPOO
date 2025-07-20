package com.mycompany.interfaces;

import com.mycompany.models.ClasesAdmin;
import java.util.List;

public interface DAOClasesAdmin {
    
    public ClasesAdmin obtenerClasePorID(int claseID) throws Exception;
    public void modificar(ClasesAdmin clase) throws Exception;
    public List<ClasesAdmin> listar() throws Exception;
    
}
