/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Asistencias;
import java.util.List;


/**
 *
 * @author Usuario
 */
public interface DAOAsistencia {
    
    public Asistencias obtenerAsistenciaPorID(int asisID) throws Exception;
    public void modificar(Asistencias asistencia) throws Exception;
    public void agregar(Asistencias asistencia) throws Exception;
    public List<Asistencias> listar(String asistente) throws Exception;
    
}
