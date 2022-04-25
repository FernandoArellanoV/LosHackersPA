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
        mapaPorCorreo = new HashMap<>();
    }
    
    //MÉTODOS
    public void MostrarUsuarios()
    {
        System.out.println("Los usuarios guardados son:\n");
        for(Usuario aux : mapaPorCorreo.values()) //for hace una operación hasta el final de "mapaPorCorreo"
        {
            System.out.println(aux);
        }
        System.out.println();
    }

    public void MostrarUsuarios(String correo)
    {
        if(mapaPorCorreo.containsKey(correo) == false)
        {
            System.out.println("No existe el usuario ingresado");
        }
        else
        {
            System.out.println("Datos del usuario ingresado:\n");
            System.out.println(mapaPorCorreo.get(correo));
        }
        System.out.println();
    }

    public void AgregarUsuario(Usuario datosUsuario)
    {
        mapaPorCorreo.put(datosUsuario.getCorreo(), datosUsuario);
    }
    
    public void EliminarUsuario(String correo)
    {
        if(mapaPorCorreo.containsKey(correo)==false)
        {
            System.out.println("No existe el usuario ingresado");
        }
        else
        {
            Usuario aux = mapaPorCorreo.get(correo);
            mapaPorCorreo.remove(correo, aux);
            System.out.println("Se elimino el usuario con exito");
        }
        System.out.println();
    }
}
