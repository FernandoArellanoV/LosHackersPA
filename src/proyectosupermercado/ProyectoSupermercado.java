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
        while (salir == false) {
            
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            opcion = lector.nextInt();
            try {
                switch(opcion)
                {
                    case 1: 
                        System.out.println("Ingrese su correo");
                        String correo = lector.next();
                        System.out.println("Ingrese la contraseña");
                        String contrasena = lector.next();
                        if (usuarios.getMapaPorCorreo().containsKey(correo)){
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
            } catch (InputMismatchException ex) {
                
                System.out.println("Debe ingresar un número entre 1 y 3\n");
                lector.next();
            }
        }
        
        /*while(salir == false)
        {
            System.out.println("1. Registrarse");
            System.out.println("2. Agregar productos");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar usuarios");
            System.out.println("5. Buscar usuario por correo");
            System.out.println("6. Buscar producto por nombre");
            System.out.println("7. Buscar producto por código");
            System.out.println("8. Modificar producto");
            System.out.println("9. Modificar usuario");
            System.out.println("10. Eliminar producto");
            System.out.println("11. Eliminar Usuario");
            System.out.println("12. Comprar");
            System.out.println("13. Salir del programa");
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
                        productos.Mostrar();
                        break;

                    case 4: //MOSTRAR USUARIOS
                        usuarios.Mostrar();
                        break;

                    case 5: //Buscar USUARIO POR CORREO
                        System.out.println("Ingrese el correo a buscar\n");
                        String correo = lector.next();
                        usuarios.MostrarUsuarios(correo);
                        break;

                    case 6: //Buscar PRODUCTO POR NOMBRE
                        System.out.println("Ingrese el nombre del producto a buscar\n");
                        String nombreProd = lector.next();
                        productos.MostrarPor(nombreProd);
                        break;

                    case 7: //Buscar PRODUCTO POR CÓDIGO
                        System.out.println("Ingrese el código del producto a buscar\n");
                        int códigoProd = lector.nextInt();
                        productos.MostrarPor(códigoProd);
                        break;
                    
                    case 8://MODIFICAR PRODUCTO
                        System.out.println("Ingrese lo que desea modificar del producto\n");
                        System.out.println("1.Nombre 2.Codigo 3.Stock 4.Precio");
                        int eleccion = lector.nextInt();
                        switch(eleccion){
                            
                            case 1:
                                System.out.println("Ingrese el nuevo nombre y el codigo asociado al producto\n");
                                String nombre = lector.next();
                                códigoProd = lector.nextInt();
                                productos.ModificarNombre(nombre,códigoProd);
                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo codigo y el codigo antiguo del producto\n");
                                int codigo = lector.nextInt();
                                códigoProd = lector.nextInt();
                                productos.ModificarCodigo(codigo, códigoProd);
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo stock y el codigo asociado al producto\n");
                                int stock =lector.nextInt();
                                códigoProd = lector.nextInt();
                                productos.ModificarStock(stock, códigoProd);
                                break;
                            case 4:
                                System.out.println("Ingrese el nuevo precio y el codigo asociado al producto\n");
                                int precio =lector.nextInt();
                                códigoProd = lector.nextInt();
                                productos.ModificarPrecio(precio, códigoProd);
                                break;
                            default:
                                System.out.println("Ingrese una opción válida\n");
                        }
                        break;
                    
                    case 9://MODIFICAR USUARIO
                        System.out.println("Ingrese la variable que desea modificar del producto\n");
                        System.out.println("1.Nombre 2.Correo 3.Constraseña");
                        int op = lector.nextInt();
                        switch(op){
                            
                            case 1:
                                System.out.println("Ingrese el nuevo nombre y el correo electrónico asociado al usuario\n");
                                String nombre = lector.next();
                                correo = lector.next();
                                usuarios.ModificarNombre(nombre,correo);
                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo correo y el correo electrónico anterior del usuario\n");
                                String correoNuevo = lector.next();
                                correo = lector.next();
                                usuarios.ModificarCorreo(correoNuevo, correo);
                                break;
                            case 3:
                                System.out.println("Ingrese la nueva contraseña y el correo electrónico asociado al usuario\n");
                                String contrasena =lector.next();
                                correo = lector.next();
                                usuarios.ModificarContrasena(contrasena, correo);
                                break;
                            default:
                            System.out.println("Ingrese una opción válida\n");
                        }
                        
                        break;
                    
                    case 10: //ELIMINAR PRODUCTO POR CODIGO
                        System.out.println("Ingrese el código del producto que desea eliminar\n");
                        int codigo = lector.nextInt();
                        productos.EliminarProducto(codigo);
                        break;
                        
                    case 11:
                        System.out.println("Ingrese el correo del usuario que desea eliminar\n");
                        String correoUsuario = lector.next();
                        usuarios.EliminarUsuario(correoUsuario);
                        break;
                        
                    case 12:
                        System.out.println("Ingrese el correo electrónico del usuario");
                        correo = lector.next();
                        int parar = 0;
                        Producto prod; 
                        while (parar == 0)
                        {
                            productos.Mostrar();
                            System.out.println("Ingrese el código del producto que desea y la cantidad de este");
                            codigo = lector.nextInt();
                            prod = productos.BuscarProducto(codigo);
                            int stock = lector.nextInt();
                            Producto aux = new Producto();
                            aux.setNombre(prod.getNombre());
                            aux.setCodigo(prod.getCodigo());
                            aux.setStock(stock);
                            aux.setPrecio(prod.getPrecio());
                            aux.setTipo(prod.getTipo());
                            prod.setStock(prod.getStock() - stock);
                            usuarios.AgregarProducto(aux, correo);
                            System.out.println("¿Desea seguir comprando? (0 = Sí || 1 = No)\n");
                            parar = lector.nextInt();
                        }
                        ImportarTxt.importarBoleta(usuarios, correo);
                        break;

                    case 13: //SALIR
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
        }*/
        ImportarTxt.importarUsuario(usuarios);
        ImportarTxt.importarProducto(productos);
        lector.close();
    }
}