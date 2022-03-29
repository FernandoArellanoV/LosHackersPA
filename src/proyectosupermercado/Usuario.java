package proyectosupermercado;

import java.util.ArrayList;
import java.util.List;

public class Usuario
{
    //VARIABLES DE INSTANCIA
    private String nombre;
    private String contraseña;
    private String correo;
    private List <Producto> carrito;

    //CONSTRUCTOR
    public Usuario(String nombre,String contraseña,String correo)
    {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
        carrito = new ArrayList<Producto>();
    }

    //GETTERS
    public String getNombre()
    {
        return nombre;
    }
    public String getContraseña()
    {
        return contraseña;
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
    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }
    public void setCorreo(String correo)
    {
        this.correo = correo;
    }
    
    //MÉTODO 1: LECTOR DE USUARIOS
    public String lectorDeUsuario()
    {
        return "Nombre: " + this.nombre + " Contraseña: (100% seguridad) " + this.contraseña + " Correo: " + this.correo;
    }
}