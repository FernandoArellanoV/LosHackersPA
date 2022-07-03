package proyectosupermercado;

import java.util.ArrayList;

public class Cliente extends Usuario
{
    //VARIABLES DE INSTANCIA
    private final ArrayList <Producto> carrito;
    private boolean enSesion;
    public ArrayList<Producto> getCarrito()
    {
        return carrito;
    }
    
    //CONSTRUCTORES
    public Cliente()
    {
        super("","","");
        carrito = new ArrayList<>();
        this.enSesion = false;
    }

    //MÉTODOS
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
