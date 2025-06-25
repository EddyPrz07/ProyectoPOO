package proyecto_poo_ii;

import java.util.ArrayList;

public class Domiciliario {
    
    private String nombre;
    private String transporte;
    private boolean estado;
    ArrayList<Object> pedidosPendientes;
    
    public Domiciliario(String nombre, String transporte){
        this.nombre = nombre;
        this.transporte = transporte;
        estado = true;
        pedidosPendientes = new ArrayList<>();
    }
    
    public String getName(){
        return nombre;
    }
    
    public String getTransporte(){
        return transporte;
    }
    
    public void actualizarEstado(){
        if (estado)
            estado = false;
        estado = true;
    }
    
    public void mostrarData(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Estado: " + estado);
        System.out.println("Transporte: " + transporte);
    }
    
    public void anadirPedido(Pedido p){
        pedidosPendientes.add(p);
    }
    
}
