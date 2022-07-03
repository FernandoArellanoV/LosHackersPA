package proyectosupermercado;

import java.util.Scanner;
import proyectosupermercadoGUI.proyectoGui;

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
        Usuario admin = new Administrador("fabi","perromagico","fvt@gmail.com","1234");
        Producto hielo = new Producto("hielo","4324","100","1000","congelado");
        productos.AgregarProducto(hielo);
        usuarios.AgregarUsuario(admin);
        proyectoGui login = new proyectoGui(usuarios,productos);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        //Scanner lector = new Scanner(System.in);
        //Menu.menuPrincipal(usuarios, productos, lector);
        //lector.close();
    }
}