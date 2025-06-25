
package proyecto_poo_ii;


public abstract class Establecimiento {
    
    
    private String nombre;
    private String direccion;

    public Establecimiento(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public abstract void abrir();
    public abstract void cerrar();
    public abstract void mostrarData();
    
    
    public String getName(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
}
