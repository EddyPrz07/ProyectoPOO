package proyecto_poo_ii;

import java.util.ArrayList;

public class Fast_Food extends Establecimiento{

    boolean disponible;
    String menu;
    ArrayList<Object> listaPedidos;
    ArrayList<String> listaResenas;
    public Fast_Food(String nombre,String direccion) {
        super(nombre,direccion);
        disponible = true;
        menu = String.format("""
        ---------------------------
        %s - Menu
        1.Porcion de papa francesa ------> $5000 (Tiempo promedio de preparacion: 5 Min.)
        2.Hamburguesa sencilla (Carne,tomate,cebolla,salsa BBQ y de tomate)------> $8000 (Tiempo promedio de preparacion: 8 Min.)
        3.Hamburguesa doble carne (Doble carne,tomate,cebolla,salsa BBQ y de tomate,porcion de papa francesa)------> $12000 (Tiempo promedio de preparacion: 12 Min.)
        4.Hamburguesa completa (Tocino,doble carne,tomate,cebolla,pepinillos,queso cheddar,salsa BBQ y de tomate,porcion de papa frita) ------> $16000 (Tiempo promedio de preparacion: 15 Min.)
        5.Hot dog americano (Salchicha Zenu,queso rallado,cebolla,papas fosforito,salsa tomate y BBQ)  ------> $7000 (Tiempo promedio de preparacion: 6 Min.)
        6.Chorriperro (Chorizo,queso rallado,cebolla,papas fosforito,salsa tomate y BBQ) ------> $9000 (Tiempo promedio de preparacion: 8 Min.)
        7.Hot dog mexicano (Salchicha premium,queso rallado,cebolla,papas fosforito,salsa tomate y BBQ,chiles chipotle y jalapeno,pico de gallo,pan premium) ------> $12000 (Tiempo promedio de preparacion: 10 Min.)
        8.Hot dog completo (Salchicha premium,queso cheddar x2,cebolla,papas fosforito,tocino,pan premium,salsa tomate y BBQ,guacamole,porcion de papa francesa) ------> $14000 (Tiempo promedio de preparacion: 10 Min.)
        9.Empanadas (Carne,pollo,mixta) ------> $4000 (Tiempo promedio de preparacion: 2 Min.)
        10.Burrito (Carne molida,frijoles,aguacate,pico de gallo) ------> $8000 (Tiempo promedio de preparacion: 8 Min.)
        11.Aditivos (Salsas (Rosada,tomate,BBQ,suero costeno,tartara),aji,pico de gallo,guacamole) ------> $2000
        12.Topes (Nachos,papas fritas,queso derretido) ------> $4000
        0.Salir
        ---------------------------""",nombre);
        listaPedidos = new ArrayList<>();
        listaResenas = new ArrayList<>();
    }
    
    @Override
    public void cerrar(){
        disponible = false;
    }
    
    @Override
    public void abrir(){
        disponible = true;
    }
    
    @Override
    public void mostrarData(){
        System.out.println(getName());
        System.out.println("Disponible: " + disponible);
        System.out.println(getDireccion());
    }
    
    public void anadirPedido(Pedido p){
        listaPedidos.add(p);
    }
    
    public void anadirResena(String r){
        listaResenas.add(r);
    }
}
