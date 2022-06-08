package proyectosupermercado;

import java.util.Scanner;

//MAIN
public class ProyectoSupermercado
{
    public static void main(String args[]) throws ArchivoInexistenteException
    {
        //INICIALIZACIÓN DE VARIABLES, MAPAS Y OBJETOS
<<<<<<< HEAD
        BaseDeProductos productos = new BaseDeProductos();
        BaseDeUsuarios usuarios = new BaseDeUsuarios();
        LectorTxt.llenarProductos(productos);
        LectorTxt.llenarUsuarios(usuarios);
        proyectoGui login = new proyectoGui(usuarios,productos);
        login.setVisible(true);
=======
        proyectoGui.main(args);
>>>>>>> e01f3bf97dd5d87f5c9da5a74d530736d59f0dcf
        //Scanner lector = new Scanner(System.in);
        //Menu.menuPrincipal(usuarios, productos, lector);
        ImportarTxt.importarUsuario(usuarios);
        ImportarTxt.importarProducto(productos);
        //lector.close();
    }
}