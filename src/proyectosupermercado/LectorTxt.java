package proyectosupermercado;

import java.io.File;
import java.util.Scanner;

public class LectorTXT
{
    
    public static void llenarUsuarios(BaseDeUsuarios objetoUsuario)
    {
        try
        {
            String[] datosUsuario = new String[3];
            Scanner input = new Scanner(new File("Usuarios.txt")); 
            while(input.hasNextLine())
            {
                String linea = input.nextLine();
                datosUsuario = linea.split("-");
                Usuario User = new Usuario(datosUsuario[0],datosUsuario[1],datosUsuario[2]);
                objetoUsuario.AgregarUsuario(User);
            } 
            input.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void llenarProductos(BaseDeProductos objetoProducto)
    {
        try
        {
            String[] datosProducto = new String[4];
            Scanner input = new Scanner(new File("Productos.txt")); 
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
