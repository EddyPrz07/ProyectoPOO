/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.ClasesCL;
import com.mycompany.models.Inscripciones;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface DAOInscripciones {
    
    public void inscripcion(ClasesCL clase,Inscripciones inscripciones) throws Exception;
    public List<Inscripciones> listar() throws Exception;
    
}
