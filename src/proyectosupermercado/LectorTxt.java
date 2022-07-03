package proyectosupermercado;

import java.io.File;
import java.util.Scanner;

public class LectorTxt
{
    public static void llenarUsuarios(BaseDeUsuarios objetoUsuario) //throws ArchivoInexistenteException
    {   //Lee el txt de usuarios y llena el mapa y la lista
        try
        {
            String[] datosUsuario = new String[4];
            Scanner input = new Scanner(new File("Usuarios.csv")); 
            while(input.hasNextLine())
            {
                String linea = input.nextLine();
                datosUsuario = linea.split("-");
                objetoUsuario.CrearUsuario(datosUsuario);
            } 
            input.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void llenarProductos(BaseDeProductos objetoProducto) throws ArchivoInexistenteException
    {   //Lee el txt de productos y llena los mapas y la lista
        try
        {
            String[] datosProducto = new String[4];
            Scanner input = new Scanner(new File("Productos.csv")); 
            while(input.hasNextLine())
            {
                String linea = input.nextLine();
                datosProducto = linea.split("-");
                Producto productos = new Producto(datosProducto[0],datosProducto[1],datosProducto[2],datosProducto[3],datosProducto[4]);
                objetoProducto.AgregarProducto(productos);
            } 
            input.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    } 
}