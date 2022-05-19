package proyectosupermercado;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Usuario {
    
    private final List <Producto> carrito; // final = la lista no puede ser llenada con nada más que "Productos"
    
    public Cliente()
    {
       super("", "", "");
       carrito = new ArrayList<>();
    }
    public Cliente(String nombre, String contrasena, String correo)
    {
       super(nombre, contrasena, correo);
       carrito = new ArrayList<>();
    }
    
    public void AgregarAlCarrito(Producto prod)
    {
        carrito.add(prod);
    }
}
