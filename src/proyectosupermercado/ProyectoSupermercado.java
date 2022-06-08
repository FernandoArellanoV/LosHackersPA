package proyectosupermercado;

import java.util.Scanner;

//MAIN
public class ProyectoSupermercado
{
    public static void main(String args[]) throws ArchivoInexistenteException
    {
        //INICIALIZACIÓN DE VARIABLES, MAPAS Y OBJETOS
        BaseDeProductos productos = new BaseDeProductos();
        BaseDeUsuarios usuarios = new BaseDeUsuarios();
        LectorTxt.llenarProductos(productos);
        LectorTxt.llenarUsuarios(usuarios);
        proyectoGui login = new proyectoGui(usuarios,productos);
        login.setVisible(true);
        //Scanner lector = new Scanner(System.in);
        //Menu.menuPrincipal(usuarios, productos, lector);
        ImportarTxt.importarUsuario(usuarios);
        ImportarTxt.importarProducto(productos);
        //lector.close();
    }
}