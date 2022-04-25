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
        Scanner lector = new Scanner(System.in); //Crea un objeto que contendrá lo escaneado
        boolean salir = false;
        int opcion;

        while(salir == false)
        {
            System.out.println("1. Registrarse");
            System.out.println("2. Agregar productos");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar usuarios");
            System.out.println("5. Buscar usuario por correo");
            System.out.println("6. Buscar producto por nombre");
            System.out.println("7. Buscar producto por código");
            System.out.println("8. Eliminar producto");
            System.out.println("9. Eliminar Usuario");
            System.out.println("10. Salir del programa");
            try
            {
                System.out.println("Elija una opcion");
                opcion = lector.nextInt();
                switch (opcion)
                {
                    case 1: //REGISTRARSE
                    String[] datosUsuario = new String[3];
                    System.out.println("Ingrese el nombre");
                    datosUsuario[0] = lector.next();
                    System.out.println("Ingrese la contraseña");
                    datosUsuario[1] = lector.next();
                    System.out.println("Ingrese el correo");
                    datosUsuario[2] = lector.next();
                    Usuario usuarioDatos = new Usuario(datosUsuario[0],datosUsuario[1],datosUsuario[2]);
                    usuarios.AgregarUsuario(usuarioDatos);
                    break;

                    case 2: //AGREGAR PRODUCTO
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
                        Producto productoDatos = new Producto(datosProducto[0],datosProducto[1],datosProducto[2],datosProducto[3],datosProducto[4]);
                        productos.AgregarProducto(productoDatos);
                        break;

                    case 3: //MOSTRAR PRODUCTO
                        productos.MostrarProductos();
                        break;

                    case 4: //MOSTRAR USUARIOS
                        usuarios.MostrarUsuarios();
                        break;

                    case 5: //MOSTRAR USUARIO POR CORREO
                        System.out.println("Ingrese el correo a buscar\n");
                        String correo = lector.next();
                        usuarios.MostrarUsuarios(correo);
                        break;

                    case 6: ////MOSTRAR PRODUCTO POR NOMBRE
                        System.out.println("Ingrese el nombre del producto a buscar\n");
                        String nombreProd = lector.next();
                        productos.MostrarPor(nombreProd);
                        break;

                    case 7: ////MOSTRAR PRODUCTO POR CÓDIGO
                        System.out.println("Ingrese el código del producto a buscar\n");
                        int códigoProd = lector.nextInt();
                        productos.MostrarPor(códigoProd);
                        break;
                    
                    case 8: ///ELIMINAR PRODUCTO POR CODIGO
                        System.out.println("Ingrese el código del producto que desea eliminar\n");
                        int codigo = lector.nextInt();
                        productos.EliminarProducto(codigo);
                        break;
                        
                    case 9:
                        System.out.println("Ingrese el correo del usuario que desea eliminar\n");
                        String correoUsuario = lector.next();
                        usuarios.EliminarUsuario(correoUsuario);
                        break;
                        
                    case 10: //SALIR
                        salir = true;
                        break;

                    default:
                        System.out.println("Ingrese una opción válida\n");
                }
            }
            catch(InputMismatchException ex)
            {
                System.out.println("Debe ingresar un número\n");
                lector.next();
            }
        }
        lector.close();
    }
}