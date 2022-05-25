package proyectosupermercado;

import java.io.File;
import java.util.Scanner;

public class LectorTxt
{
    public static void llenarUsuarios(BaseDeUsuarios objetoUsuario)
    { //"try" prueba durante ejecución el bloque de código para ver si hay errores
        try
        {
            String[] datosUsuario = new String[4]; // 4 = nombre + contraseña + correo + id
            Scanner input = new Scanner(new File("Usuarios.txt")); 
            while(input.hasNextLine()) //Mientras existan lineas en el txt
            {
                String linea = input.nextLine(); //saltando línea
                datosUsuario = linea.split("-"); //separando por "-"
                Usuario User = objetoUsuario.CrearUsuario(datosUsuario);
                objetoUsuario.AgregarUsuario(User); //Subiendo al mapa
            } 
            input.close();
        }
        catch(Exception ex) //"catch" es lo que sucederá si es que SI hay un error
        {
            ex.getMessage();
        }
        //"finally" ejecuta un bloque de código indeferentemente de los resultados anteriores
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
            ex.getMessage(); //Se usa para obtener un mensaje de error asociado con una excepción
        }
    } 
}