package proyectosupermercado;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

//MAIN
public class ProyectoSupermercado
{
    public static void main(String args[]) throws IOException
    {
        //INICIALIZACIÓN DE MAPASs
        BaseDeProductos productos = new BaseDeProductos();
        BaseDeUsuarios usuarios = new BaseDeUsuarios();
        LectorTXT.llenarProductos(productos);
        LectorTXT.llenarUsuarios(usuarios);
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int op;
        while(salir==false)
        {
            System.out.println("1. Registrarse");
            System.out.println("2. Agregar productos");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar usuarios");
            System.out.println("5. Salir");
            try
            {
                System.out.println("Elige una opcion");
                op = lector.nextInt();
                switch (op)
                {
                    case 1:
                    String[] datosUsuario = new String[3];
                    System.out.println("Nombre");
                    datosUsuario[0] = lector.next();
                    System.out.println("Contraseña");
                    datosUsuario[1] = lector.next();
                    System.out.println("Correo");
                    datosUsuario[2] = lector.next();
                    Usuario datosUsu = new Usuario(datosUsuario[0],datosUsuario[1],datosUsuario[2]);
                    usuarios.AgregarUsuario(datosUsu);
                    break;
                    case 2:
                        String[] datosProducto = new String[5];
                        System.out.println("Nombre producto");
                        datosProducto[0] = lector.next();
                        System.out.println("Codigo producto");
                        datosProducto[1] = lector.next();
                        System.out.println("Stock");
                        datosProducto[2] = lector.next();
                        System.out.println("Precio");
                        datosProducto[3] = lector.next();
                        System.out.println("Tipo");
                        datosProducto[4] = lector.next();
                        Producto datosPro = new Producto(datosProducto[0],datosProducto[1],datosProducto[2],datosProducto[3],datosProducto[4]);
                        productos.AgregarProducto(datosPro);
                        break;
                    case 3:
                        productos.MostrarProductos();
                        break;
                    case 4:
                        usuarios.MostrarUsuarios();
                        break;
                    case 5:  
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                lector.next();
            }
        }
    }
}