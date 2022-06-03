package proyectosupermercado;

import java.util.ArrayList;

public class Cliente extends Usuario
{
    private final ArrayList <Producto> carrito; // final = la lista no puede ser llenada con nada más que "Productos"
    private boolean enSesion;
    
    public ArrayList<Producto> getCarrito()
    {
        return carrito;
    }

    public Cliente()
    {
        super("","","");
        carrito = new ArrayList<>();
        this.enSesion = false;
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

    @Override
    public boolean EsAdmin()
    {
        return false;
    }
    
    @Override
    public void Inicio()
    {
        this.enSesion = true;
    }
    
    @Override
    public void Cierre()
    {
        this.enSesion = false;
    }
    
    @Override
    public boolean EstaConectado()
    {
        return enSesion;
    }
}
