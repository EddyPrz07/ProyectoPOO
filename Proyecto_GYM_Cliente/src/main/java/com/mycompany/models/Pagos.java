/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author Usuario
 */
public class Pagos {
    
    private String Fecha;
    private String Membresia;
    private int Valor;

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setMembresia(String Membresia) {
        this.Membresia = Membresia;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getMembresia() {
        return Membresia;
    }

    public int getValor() {
        return Valor;
    }
    
    
}
