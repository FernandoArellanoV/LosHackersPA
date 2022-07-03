package proyectosupermercado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ExportarTxt
{   //Escribe los cambios hechos durante la ejecución del código en los txt respectivos, se llama al cerrar el programa
    public static void ExportarUsuario(BaseDeUsuarios bdu) //throws ArchivoNoModificadoException
    {
        try
        {
            File archivo = new File("Usuarios.csv");
            FileWriter fichero = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fichero);
            ArrayList <Usuario> listaAux = bdu.getListaDeUsuarios();
            for (int i = 0; i < listaAux.size(); i++)
            {
                if ((listaAux.get(i)).EsAdmin())
                {
                    Administrador admin = (Administrador) listaAux.get(i);
                    escritor.write(admin.getNombre() + "-" + admin.getContrasena() + "-" + admin.getCorreo() + "-" + admin.getId() + "\n");
                }
                else
                {
                    Cliente client = (Cliente) listaAux.get(i);
                    escritor.write(client.getNombre() + "-" + client.getContrasena() + "-" + client.getCorreo() + "-" + "0" + "\n");
                }
            }
            escritor.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void ExportarProducto(BaseDeProductos bdp) //throws ArchivoNoModificadoException
    {
        try
        {
            File archivo = new File("Productos.csv");
            FileWriter fichero = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fichero);
            ArrayList <Producto> listaAux = bdp.getListaDeProductos();
            for (int i = 0; i < listaAux.size(); i++)
            {
                Producto aux = listaAux.get(i);
                escritor.write(aux.getNombre() + "-" + aux.getCodigo() + "-" + aux.getStock() + "-" + aux.getPrecio() + "-" + aux.getTipo() + "\n");
            }
            escritor.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void ExportarBoleta(BaseDeUsuarios bdu) //throws BoletaNoGeneradaException
    {
        try
        {
            String ruta;
            Cliente user = (Cliente) bdu.BuscarConectado();
            ruta = user.getNombre() + ".txt";
            File archivo = new File(ruta);
            FileWriter fichero = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fichero);
            escritor.write("\n Andre S.A.\n\n\n");
            escritor.write("Nombre del comprador: " + user.getNombre() + "\n");
            escritor.write("Correo del comprador: " + user.getCorreo() + "\n");
            DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            escritor.write ("Fecha de la compra: " + dtf4.format(LocalDateTime.now()) + "\n");
            ArrayList <Producto> listaProductos = user.getCarrito();
            int total = 0;
            for (int i = 0; i < listaProductos.size(); i++)
            {
                Producto prod = listaProductos.get(i);
                total = total + (prod.getPrecio() * prod.getStock()); 
                escritor.write("\nNombre del producto: " + prod.getNombre() + "\n");
                escritor.write("Cantidad comprada : " + prod.getStock() + "\n");
                escritor.write("Precio: $" + (prod.getPrecio() * prod.getStock()) + "\n");
            }
            escritor.write("\nCantidad total a pagar: $" + total + "\n\n");
            escritor.write("---GRACIAS POR SU COMPRA---");
            escritor.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void ExportarReporte(BaseDeUsuarios bdu, BaseDeProductos bdp)
    {
        try
        {
            File archivo = new File("Reporte.txt");
            FileWriter fichero = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fichero);
            ArrayList <Usuario> listaAux = bdu.getListaDeUsuarios();
            escritor.write("Usuarios\n");
            for (int i = 0; i < listaAux.size(); i++)
            {
                if ((listaAux.get(i)).EsAdmin())
                {
                    Administrador admin = (Administrador) listaAux.get(i);
                    escritor.write(admin.getNombre() + "-" + admin.getContrasena() + "-" + admin.getCorreo() + "-" + admin.getId() + "\n");
                }
                else
                {
                    Cliente client = (Cliente) listaAux.get(i);
                    escritor.write(client.getNombre() + "-" + client.getContrasena() + "-" + client.getCorreo() + "-" + "0" + "\n");
                }
            }
            escritor.write("Productos\n");
            ArrayList <Producto> listaAux2 = bdp.getListaDeProductos();
            for (int i = 0; i < listaAux2.size(); i++)
            {
                Producto aux = listaAux2.get(i);
                escritor.write(aux.getNombre() + "-" + aux.getCodigo() + "-" + aux.getStock() + "-" + aux.getPrecio() + "-" + aux.getTipo() + "\n");
            }
            escritor.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}