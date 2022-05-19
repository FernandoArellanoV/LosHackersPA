package proyectosupermercado;

import java.util.ArrayList;

public class Cliente extends Usuario
{
    private final ArrayList <Producto> carrito; // final = la lista no puede ser llenada con nada más que "Productos"

    public ArrayList<Producto> getCarrito()
    {
        return carrito;
    }

    public Cliente()
    {
        super("","","");
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

    public void Reportarse()
    {
        System.out.println("Tipo de usuario: Cliente");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
    }

    public boolean EsAdmin()
    {
        return false;
    }
}
