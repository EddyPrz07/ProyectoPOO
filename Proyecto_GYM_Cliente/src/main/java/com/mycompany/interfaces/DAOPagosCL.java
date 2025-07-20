/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Pagos;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface DAOPagosCL {
    
    public List<Pagos> listar() throws Exception;
    
    
}
