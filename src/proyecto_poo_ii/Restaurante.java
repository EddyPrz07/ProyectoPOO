package proyecto_poo_ii;
import java.util.ArrayList;

public class Restaurante extends Establecimiento{
    
    boolean disponible;
    String menu;
    ArrayList<Object> listaPedidos;
    ArrayList<String> listaResenas;
    public Restaurante(String nombre,String direccion) {
        super(nombre,direccion);
        disponible = true;
        menu = String.format("""
        ---------------------------
        %s - Menu
        1.Corrientazo ------> $10000 (Tiempo promedio de preparacion: 3 Min.)
        2.Especial (Sobrebarriga,pechuga,mojarra,chicharron)------> $15000 (Tiempo promedio de preparacion: 12 Min.)
        3.Ensalada clasica (Tomate,cebolla,lechuga) ------> $3000
        4.Gallina (1/2,completa) ------> $40000/80000 (Tiempo promedio de preparacion: 12 Min.)
        5.Porcion de rellena ------> $5000
        6.Picada (Carnes,papa,platano,yuca,rellena,chicharron) ------> $60000 (Tiempo promedio de preparacion: 6 Min.)
        7.Sopa del dia ------> $5000
        8.Jugo ------> $4000
        9.Sancocho ------> $8000 
        10.Ajiaco ------> $10000 
        11.Consome ------> $5000 
        12.Caldo de costilla ------> $8000
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
