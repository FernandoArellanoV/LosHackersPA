
package proyectosupermercado;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector; 

public class Usuarios {
    
    private String nombre;
    private String contraseña;
    private String correo;
    private List <productoDelCarrito> carrito;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
}
