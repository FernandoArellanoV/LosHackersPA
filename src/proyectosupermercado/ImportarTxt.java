package proyectosupermercado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ImportarTxt
{   //Escribe los cambios hechos durante la ejecución del código en los txt respectivos, se llama al cerrar el programa
<<<<<<< HEAD
    public static void importarUsuario(BaseDeUsuarios bdu) //throws ArchivoNoModificadoException
=======
    public static void importarUsuario(BaseDeUsuarios bdu) throws ArchivoNoModificadoException
>>>>>>> e01f3bf97dd5d87f5c9da5a74d530736d59f0dcf
    {
        try
        {
            File archivo = new File("Usuarios.txt");
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

<<<<<<< HEAD
    public static void importarProducto(BaseDeProductos bdp) //throws ArchivoNoModificadoException
=======
    public static void importarProducto(BaseDeProductos bdp) throws ArchivoNoModificadoException
>>>>>>> e01f3bf97dd5d87f5c9da5a74d530736d59f0dcf
    {
        try
        {
            File archivo = new File("Productos.txt");
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

<<<<<<< HEAD
    public static void importarBoleta(BaseDeUsuarios bdu) //throws BoletaNoGeneradaException
=======
    public static void importarBoleta(BaseDeUsuarios bdu) throws BoletaNoGeneradaException
>>>>>>> e01f3bf97dd5d87f5c9da5a74d530736d59f0dcf
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
}