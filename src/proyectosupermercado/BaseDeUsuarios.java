package proyectosupermercado;

import java.util.HashMap;
import java.util.Map;

public class BaseDeUsuarios {
    private Map <String,Usuario> mapaPorCorreo;
    
    public BaseDeUsuarios()
    {
        mapaPorCorreo = new HashMap();
    }
    
    public void MostrarUsuarios()
    {
        for(Usuario aux: mapaPorCorreo.values())
        {
            System.out.println(aux.toString());
        }
    }
    
    public void MostrarUsuarios(String correo)
    {
        if(mapaPorCorreo.containsKey(correo) == false)
        {
            System.out.println("No existe el producto");
        }else
        {
            System.out.println(mapaPorCorreo.get(correo).toString());
        }
    }
    
    public void AgregarUsuario(Usuario datosUsuario)
    {
        mapaPorCorreo.put(datosUsuario.getCorreo(), datosUsuario);
    }
}
