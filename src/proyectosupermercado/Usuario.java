package proyectosupermercado;

import java.util.ArrayList;
import java.util.List;
//import proyectosupermercado.BaseDeProductos;

public abstract class Usuario
{
    //VARIABLES DE INSTANCIA
    private String nombre;
    private String contrasena;
    private String correo;
    private String id;

    
    //CONSTRUCTOR
    public Usuario(String nombre,String contrasena,String correo,String id)
    {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        this.id = id;
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
    public abstract String getId();

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
    public abstract void setId(String id);

    @Override //?
    public String toString()
    {
        return "Usuario (" + "Nombre: " + nombre + " | Contraseña: " + contrasena + " | Correo: " + correo + ")";
    }
}