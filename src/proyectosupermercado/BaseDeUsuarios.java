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

    public Usuario BuscarUsuario(String correo)
    {
        return mapaPorCorreo.get(correo);
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
        Usuario aux = mapaPorCorreo.get(correo);
        mapaPorCorreo.remove(correo, aux);
        listaDeUsuarios.remove(aux);
    }
    
    public void ModificarNombre(String nombre,String correo)
    {
        Usuario aux = mapaPorCorreo.get(correo);
        aux.setNombre(nombre);
        mapaPorCorreo.put(correo, aux); 
        for (int i = 0; i < listaDeUsuarios.size(); i++)
        {
            if(listaDeUsuarios.get(i).getCorreo().equals(correo))
            {
                listaDeUsuarios.get(i).setNombre(nombre);
            }
        }
    }
    
    public void ModificarCorreo(String correoNuevo,String correoAntiguo)
    {
        Usuario aux = mapaPorCorreo.get(correoAntiguo);
        mapaPorCorreo.remove(correoAntiguo,aux);
        listaDeUsuarios.remove(aux);
        aux.setCorreo(correoNuevo);
        mapaPorCorreo.put(correoNuevo, aux);
        listaDeUsuarios.add(aux);
    }
    
    public void ModificarContrasena(String contrasena,String correo)
    {
        Usuario aux = mapaPorCorreo.get(correo);
        aux.setContrasena(contrasena);
        mapaPorCorreo.put(correo, aux);
        for (int i = 0; i < listaDeUsuarios.size(); i++)
        {
            if(listaDeUsuarios.get(i).getCorreo().equals(correo))
            {
                listaDeUsuarios.get(i).setContrasena(contrasena);
            }
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
