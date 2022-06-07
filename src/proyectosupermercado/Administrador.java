package proyectosupermercado;

public class Administrador extends Usuario
{
    //VARIABLES DE INSTANCIA
    private String id;
    private boolean enSesion;

    //CONSTRUCTORES
    public Administrador(String nombre, String contrasena, String correo,String id)
    {
        super(nombre, contrasena, correo);
        this.id = id;
        this.enSesion = false;
    }

    //MÉTODOS
    @Override
    public boolean EsAdmin()
    {
        return true;
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

    //GETTERS & SETTERS
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
}
