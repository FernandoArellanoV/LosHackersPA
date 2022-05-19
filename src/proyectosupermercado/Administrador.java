
package proyectosupermercado;

public class Administrador extends Usuario{
   
    
    public Administrador()
    {   
       super("", "", "","");
    }
    public Administrador(String nombre, String contrasena, String correo,String id)
    {
        super(nombre, contrasena, correo,id);
    }

    public String getId() {
        return getId();
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
