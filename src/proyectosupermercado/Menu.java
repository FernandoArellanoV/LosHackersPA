
package proyectosupermercado;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    
    public static void MenuCliente(BaseDeUsuarios usuarios,BaseDeProductos productos)
    {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(salir == false)
        {
            System.out.println("1. Mostrar productos");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Buscar producto por código");
            System.out.println("4. Comprar");
            System.out.println("5. Cerrar sesion");
            opcion = lector.nextInt();
            try {
                switch(opcion)
                {
                    case 1: 
                        productos.Mostrar();
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre del producto a buscar\n");
                        String nombreProd = lector.next();
                        productos.MostrarPor(nombreProd);
                        break;
                    case 3:
                        System.out.println("Ingrese el código del producto a buscar\n");
                        int códigoProd = lector.nextInt();
                        productos.MostrarPor(códigoProd);
                        break;
                    case 4:
                        System.out.println("Ingrese el correo electrónico del usuario");
                        String correo = lector.next();
                        int parar = 0;
                        Producto prod; 
                        while (parar == 0)
                        {
                            productos.Mostrar();
                            System.out.println("Ingrese el código del producto que desea y la cantidad de este");
                            int codigo = lector.nextInt();
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
                    case 5:
                        salir = true;
                        break;
                }
            } catch (InputMismatchException ex) {
                
                System.out.println("Debe ingresar un número entre 1 y 3\n");
                lector.next();
            }
        }
    }
    
    public static void MenuAdministrador(BaseDeUsuarios usuarios,BaseDeProductos productos)
    {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(salir == false)
        {
            System.out.println("1. Agregar productos");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Mostrar usuarios");
            System.out.println("4. Buscar usuario por correo");
            System.out.println("5. Buscar producto por nombre");
            System.out.println("6. Buscar producto por código");
            System.out.println("7. Modificar producto");
            System.out.println("8. Modificar usuario");
            System.out.println("9. Eliminar producto");
            System.out.println("10. Eliminar Usuario");
            System.out.println("11. Cerrar sesion");
            opcion = lector.nextInt();
            try {
                switch(opcion)
                {
                    case 1: 
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
                    case 2:
                        productos.Mostrar();
                        break;
                    case 3:
                        usuarios.Mostrar();
                        break;
                    case 4:
                        System.out.println("Ingrese el correo a buscar\n");
                        String correo = lector.next();
                        usuarios.MostrarUsuarios(correo);
                        break;
                    case 5:
                        System.out.println("Ingrese el nombre del producto a buscar\n");
                        String nombreProd = lector.next();
                        productos.MostrarPor(nombreProd);
                        break;
                    case 6:
                        System.out.println("Ingrese el código del producto a buscar\n");
                        int códigoProd = lector.nextInt();
                        productos.MostrarPor(códigoProd);
                        break;
                    case 7:
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
                    case 8:
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
                    case 9:
                        System.out.println("Ingrese el código del producto que desea eliminar\n");
                        int codigo = lector.nextInt();
                        productos.EliminarProducto(codigo);
                        break;
                    case 10:
                        System.out.println("Ingrese el correo del usuario que desea eliminar\n");
                        String correoUsuario = lector.next();
                        usuarios.EliminarUsuario(correoUsuario);
                        break;
                    case 11:
                        salir = true;
                        break;
                }
            } catch (InputMismatchException ex) {
                
                System.out.println("Debe ingresar un número entre 1 y 3\n");
                lector.next();
            }
    }
        }
        
}
