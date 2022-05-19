package proyectosupermercado;

import java.util.HashMap;
import java.util.Map;

public class BaseDeUsuarios implements Mostrador
{
    //VARIABLES DE INSTANCIA
    private Map <String,Usuario> mapaPorCorreo;
    
    public Map<String, Usuario> getMapaPorCorreo()
    {
        return mapaPorCorreo;
    }
    //CONSTRUCTOR
    public BaseDeUsuarios()
    {
        mapaPorCorreo = new HashMap<>();
    }
    
    //MÉTODOS
    public void Mostrar()
    {
        System.out.println("Los usuarios guardados son:\n");
        for(Usuario aux : mapaPorCorreo.values()) //for hace una operación hasta el final de "mapaPorCorreo"
        {
            System.out.println(aux);
        }
        System.out.println();
    }

    public void AgregarProducto(Producto prod, String correo)
    {
        Cliente user = (Cliente)mapaPorCorreo.get(correo);
        user.AgregarAlCarrito(prod);
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
    
    public void ModificarNombre(String nombre,String correo)
    {
        
        if(mapaPorCorreo.containsKey(correo))
        {
            Usuario aux = mapaPorCorreo.get(correo);
            aux.setNombre(nombre);
            mapaPorCorreo.put(correo, aux);
            System.out.println("El nombre se ha modificado con exito");
        }
        else
        {
            System.out.println("No existe el usuario del correo asociado");
        }     
    }
    
    public void ModificarCorreo(String correoNuevo,String correoAntiguo)
    {
        if(mapaPorCorreo.containsKey(correoAntiguo))
        {
            Usuario aux = mapaPorCorreo.get(correoAntiguo);
            mapaPorCorreo.remove(correoAntiguo,aux);
            aux.setCorreo(correoNuevo);
            mapaPorCorreo.put(correoNuevo, aux);
            System.out.println("El correo se ha modificado con exito");
        }
        else
        {
            System.out.println("No existe el usuario del correo asociado");
        }
    }
    
    public void ModificarContrasena(String contrasena,String correo)
    {
        if(mapaPorCorreo.containsKey(correo))
        {
            Usuario aux = mapaPorCorreo.get(correo);
            aux.setContrasena(contrasena);
            mapaPorCorreo.put(correo, aux);
            System.out.println("La contraseña se ha modificado con exito");
        }
        else
        {
            System.out.println("No existe el usuario del correo asociado");
        }
    }
}