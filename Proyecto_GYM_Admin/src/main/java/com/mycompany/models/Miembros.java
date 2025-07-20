package com.mycompany.models;

public class Miembros {
    
    private int ID;
    private String Nombre;
    private String Apellido;
    private String Documento;
    private String Memb_area;
    private String Telefono;
    private String Correo;
    private String Dias;
    private String Horario;
    private boolean Pago;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public void setMemb_area(String Memb_area) {
        this.Memb_area = Memb_area;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setDias(String Dias) {
        this.Dias = Dias;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public void setPago(boolean Pago) {
        this.Pago = Pago;
    }
    
    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDocumento() {
        return Documento;
    }

    public String getMemb_area() {
        return Memb_area;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getDias() {
        return Dias;
    }

    public String getHorario() {
        return Horario;
    }

    public boolean isPago() {
        return Pago;
    }
    
    
}
