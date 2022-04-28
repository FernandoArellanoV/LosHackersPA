package proyectosupermercado;

import java.util.ArrayList;
import java.util.List;
//import proyectosupermercado.BaseDeProductos;

public class Usuario
{
    //VARIABLES DE INSTANCIA
    private String nombre;
    private String contrasena;
    private String correo;
    private final List <Producto> carrito; // final = la lista no puede ser llenada con nada más que "Productos"

    //GETTER
    public List<Producto> getCarrito()
    {
        return carrito;
    }

    //CONSTRUCTOR
    public Usuario(String nombre,String contrasena,String correo)
    {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        carrito = new ArrayList<>();
    }

    public void AgregarAlCarrito(Producto prod)
    {
        carrito.add(prod);
    }

    //GETTERS
    public String getNombre()
    {
        return nombre;
    }
    public String getContrasena()
    {
        return contrasena;
    }
    public String getCorreo()
    {
        return correo;
    }

    //SETTERS
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setContrasena(String contrasena)
    {
        this.contrasena = contrasena;
    }
    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    @Override //?
    public String toString()
    {
        return "Usuario (" + "Nombre: " + nombre + " | Contraseña: " + contrasena + " | Correo: " + correo + ")";
    }
}