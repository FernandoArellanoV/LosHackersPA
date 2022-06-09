package proyectosupermercado;

public abstract class Usuario
{
    //VARIABLES DE INSTANCIA
    private String nombre;
    private String contrasena;
    private String correo;

    //CONSTRUCTORES
    public Usuario(String nombre,String contrasena,String correo)
    {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
    }

    //MÉTODOS
    public boolean EsAdmin()    
    {
        return false;
    }
    
    public abstract void Inicio();
    
    public abstract void Cierre();
    
    public abstract boolean EstaConectado();

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