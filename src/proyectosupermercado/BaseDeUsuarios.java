package proyectosupermercado;

import java.util.HashMap;
import java.util.Map;

public class BaseDeUsuarios
{
    //VARIABLES DE INSTANCIA
    private Map <String,Usuario> mapaPorCorreo;
    
    //CONSTRUCTOR
    public BaseDeUsuarios()
    {
        mapaPorCorreo = new HashMap();
    }
    
    //MÉTODOS
    public void MostrarUsuarios()
    {
        for(Usuario aux: mapaPorCorreo.values())
        {
            System.out.println(aux.toString());
        }
        System.out.println();
    }

    public void MostrarUsuarios(String correo)
    {
        if(mapaPorCorreo.containsKey(correo) == false)
        {
            System.out.println("No existe el producto");
        }
        else
        {
            System.out.println(mapaPorCorreo.get(correo).toString());
        }
        System.out.println();
    }

    public void AgregarUsuario(Usuario datosUsuario)
    {
        mapaPorCorreo.put(datosUsuario.getCorreo(), datosUsuario);
    }
}
