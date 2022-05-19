package proyectosupermercado;

import java.util.Scanner;
import java.util.InputMismatchException;

//MAIN
public class ProyectoSupermercado
{
    public static void main(String args[])
    {
        //INICIALIZACIÓN DE VARIABLES, MAPAS Y OBJETOS
        BaseDeProductos productos = new BaseDeProductos();
        BaseDeUsuarios usuarios = new BaseDeUsuarios();
        LectorTxt.llenarProductos(productos);
        LectorTxt.llenarUsuarios(usuarios);
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (salir == false)
        {
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            opcion = lector.nextInt();
            try
            {
                switch(opcion)
                {
                    case 1: 
                        System.out.println("Ingrese su correo");
                        String correo = lector.next();
                        System.out.println("Ingrese la contraseña");
                        String contrasena = lector.next();
                        if (usuarios.getMapaPorCorreo().containsKey(correo))
                        {
                            Menu.MenuCliente(usuarios,productos);
                        }
                        else
                        {
                            System.out.println("El usuario que usted ha ingresando no existe");
                        }
                        break; 
                    case 2:
                        String[] datosUsuario = new String[3];
                        System.out.println("Ingrese el nombre");
                        datosUsuario[0] = lector.next();
                        System.out.println("Ingrese la contraseña");
                        datosUsuario[1] = lector.next();
                        System.out.println("Ingrese el correo");
                        datosUsuario[2] = lector.next();
                        Usuario usuarioDatos = new Cliente(datosUsuario[0],datosUsuario[1],datosUsuario[2]);
                        usuarios.AgregarUsuario(usuarioDatos);
                        Menu.MenuCliente(usuarios,productos);
                        break;
                    case 3:
                        salir = true;
                        break;
                }
            }
            catch (InputMismatchException ex)
            {
                
                System.out.println("Debe ingresar un número entre 1 y 3\n");
                lector.next();
            }
        }
        ImportarTxt.importarUsuario(usuarios);
        ImportarTxt.importarProducto(productos);
        lector.close();
    }
}