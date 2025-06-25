package proyecto_poo_ii;

public class Cliente {
    
    private String nombre;
    private String direccion;
   
    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getName(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    
    
    
}

