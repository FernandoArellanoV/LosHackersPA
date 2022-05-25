package proyectosupermercado;

public class Administrador extends Usuario
{
    private String id;
    private boolean enSesion;

    public Administrador(String nombre, String contrasena, String correo,String id)
    {
        super(nombre, contrasena, correo);
        this.id = id;
        this.enSesion = false;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public void Reportarse()
    {
        System.out.println("Tipo de usuario: Administrador");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Código de identificación: " + getId());
    }

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
}
