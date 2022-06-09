package proyectosupermercado;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class BaseDeUsuarios implements Mostrador
{
    //VARIABLES DE INSTANCIA
    private Map <String,Usuario> mapaPorCorreo;
    private ArrayList <Usuario> listaDeUsuarios;
    
    public ArrayList<Usuario> getListaDeUsuarios()
    {
        return listaDeUsuarios;
    }

    //CONSTRUCTOR
    public BaseDeUsuarios()
    {
        mapaPorCorreo = new HashMap<>();
        listaDeUsuarios = new ArrayList<Usuario>();
    }
    
    //MÉTODOS
    public boolean ExisteCorreo(String correo)
    {
        return mapaPorCorreo.containsKey(correo);
    }
    
    public boolean ContrasenaCoincide(String correo, String contrasena)
    {
        return (mapaPorCorreo.get(correo)).getContrasena().equals(contrasena);
    }
    
    public boolean CorreoCoincide(String correo, String correoConectado)
    {
        return (mapaPorCorreo.get(correo)).getCorreo().equals(correoConectado);
    }

    public boolean EsAdministrador(String correo)
    {
        return (mapaPorCorreo.get(correo)).EsAdmin();
    }

    public void Mostrar()
    {
        System.out.println("Los usuarios guardados son:\n");
        for(Usuario aux : mapaPorCorreo.values())
        {
            System.out.println(aux);
        }
        System.out.println();
    }

    public void AgregarProducto(Producto prod)
    {
        Cliente user = (Cliente)BuscarConectado();
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
        listaDeUsuarios.add(datosUsuario);
    }
    
    public void CrearUsuario(String[] datos)
    {
        Usuario user;
        if(datos[3].equals("0"))
        {
            user = new Cliente(datos[0],datos[1],datos[2]);
        }
        else
        {
            user = new Administrador(datos[0],datos[1],datos[2],datos[3]);
        }
        AgregarUsuario(user);
    }
    
    public void EliminarUsuario(String correo)
    {
        if(mapaPorCorreo.containsKey(correo)==false)
        {
        }
        else
        {
            Usuario aux = mapaPorCorreo.get(correo);
            mapaPorCorreo.remove(correo, aux);
            listaDeUsuarios.remove(aux);
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
    
    public void InicioSesion(String correo)
    {
        (mapaPorCorreo.get(correo)).Inicio();
    }
    
    public void CierreSesion()
    {
        Usuario aux = BuscarConectado();
        aux.Cierre();
    }
    
    public Usuario BuscarConectado()
    {
        for (Usuario aux : mapaPorCorreo.values())
        {
            if (aux.EstaConectado())
            {
                return (Usuario) aux;
            }
        }
        return null;
    }
    public int confirmarUsuario ( String correo, String contrasena)
    {
        if (ExisteCorreo(correo))
        {
            if (ContrasenaCoincide(correo, contrasena))
            {
                InicioSesion(correo);
                if (EsAdministrador(correo))
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                return 2;
            }
        }
        else
        {
            return 2;
        }
    }
}
