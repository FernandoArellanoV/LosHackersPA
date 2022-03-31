package proyectosupermercado;

import java.io.*;
/*import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;*/

//MAIN
public class ProyectoSupermercado
{
    public static void main(String args[]) throws IOException
    {
        //INICIALIZACIÓN DE MAPASs
        BaseDeProductos productos = new BaseDeProductos();
        BaseDeUsuarios usuarios = new BaseDeUsuarios();
        LectorTxt.llenarProductos(productos);
        LectorTxt.llenarUsuarios(usuarios);
        productos.MostrarPor("Arroz");
        productos.MostrarProductos();
    }
}