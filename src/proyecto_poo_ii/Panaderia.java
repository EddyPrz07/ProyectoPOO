package proyecto_poo_ii;
import java.util.ArrayList;

public class Panaderia extends Establecimiento{
    
    
    boolean disponible;
    String menu;
    ArrayList<Object> listaPedidos;
    ArrayList<String> listaResenas;
    public Panaderia(String nombre,String direccion){
        super(nombre,direccion);
        disponible = true;
        menu = String.format("""
        ---------------------------
        %s - Menu
        1.Pan de queso ------> $3000
        2.Pastel de cumpleanos (Pequeno/Grande) ------> $16000/$25000 
        3.Almojabana ------> $2000
        4.Pastel gloria (Carne,pollo) ------> $3000 
        5.Brownie de chocolate ------> $2500 
        6.Mariposa  ------> $3000
        7.Brazo de reina ------> $8000
        8.Pan integral ------> $5000
        9.Sandwich (Carne,pollo,mixto) ------> $6000
        10.Mogolla (Grande / Pequena) ------> $4000/$7000
        11.Postre de maracuya ------> $8000
        12.Galleta de chocolate ------> $2500
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
