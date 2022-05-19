package proyectosupermercado;

public class Administrador extends Usuario
{
    private String id;
    
    public Administrador()
    {   
        super("","","");
    }
    public Administrador(String nombre, String contrasena, String correo,String id)
    {
        super(nombre, contrasena, correo);
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public void Reportarse()
    {
        System.out.println("Tipo de usuario: Administrador");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Código de identificación: " + getId());
    }

    public boolean EsAdmin()
    {
        return true;
    }
}
