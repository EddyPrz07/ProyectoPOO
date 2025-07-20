/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author Usuario
 */
public class ClasesINS {
    
        private int ID;
    private String Dia;
    private String Horario;
    private String Instructor;
    private String Area;
    private boolean Estado;
    private int Cupos;
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public void setInstructor(String Instructor) {
        this.Instructor = Instructor;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public void setCupos(int Cupos) {
        this.Cupos = Cupos;
    }
    
    public int getID() {
        return ID;
    }

    public String getDia() {
        return Dia;
    }

    public String getHorario() {
        return Horario;
    }

    public String getInstructor() {
        return Instructor;
    }

    public String getArea() {
        return Area;
    }

    public boolean isEstado() {
        return Estado;
    }

    public int getCupos() {
        return Cupos;
    }
    
}
