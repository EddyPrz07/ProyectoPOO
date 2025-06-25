package proyecto_poo_ii;

import java.util.ArrayList;

public class Pedido {
    Cliente cliente;
    Establecimiento establecimiento;
    Domiciliario domiciliario;
    ArrayList descripcion;

    public Pedido(Cliente cliente, Establecimiento establecimiento, Domiciliario domiciliario,ArrayList descripcion) {
        this.cliente = cliente;
        this.establecimiento = establecimiento;
        this.domiciliario = domiciliario;
        this.descripcion = descripcion;
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + cliente.getName() + "\nDireccion: " + cliente.getDireccion());
        System.out.println("Establecimiento: " + establecimiento.getName());
        System.out.println("Domiciliario: " + domiciliario.getName() + "\nTransporte: " + domiciliario.getTransporte());
    }
    
    @Override 
    public String toString(){
        return "\nCliente: " + cliente.getName() + "\nDireccion: " + cliente.getDireccion()  + "\nEstablecimiento: " + establecimiento.getName() 
                + "\nDomiciliario: " + domiciliario.getName() + "\nTransporte: " 
                + domiciliario.getTransporte() + "\nPedido: " + descripcion;
    }
}

