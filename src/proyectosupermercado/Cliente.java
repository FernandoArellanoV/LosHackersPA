package proyectosupermercado;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario
{
    private String id;
    private final List <Producto> carrito; // final = la lista no puede ser llenada con nada más que "Productos"
    
    public Cliente()
    {
        super("","","");
        id = "0";
        carrito = new ArrayList<>();
    }

    public Cliente(String nombre, String contrasena, String correo)
    {
        super(nombre, contrasena, correo);
        id = "0";
        carrito = new ArrayList<>();
    }
    
    public void AgregarAlCarrito(Producto prod)
    {
        carrito.add(prod);
    }

    public void Reportarse()
    {
        System.out.println("Tipo de usuario: Cliente");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
    }
}
