package proyectosupermercado;

import java.util.Map;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ImportarTxt
{
    public static void importarUsuario(BaseDeUsuarios bdu)
    {
        try
        {
            File archivo = new File("Usuarios.txt");
            FileWriter fichero = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fichero);
            Map <String,Usuario> mapaAux = bdu.getMapaPorCorreo();
            for (Usuario aux : mapaAux.values())
            {
                escritor.write(aux.getNombre() + "-" + aux.getContrasena() + "-" + aux.getCorreo() + "\n");
            }
            escritor.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void importarProducto(BaseDeProductos bdp)  
    {
        try
        {
            File archivo = new File("Productos.txt");
            FileWriter fichero = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fichero);
            Map <Integer,Producto> mapaAux = bdp.getMapaPorCodigo();
            for (Producto aux : mapaAux.values())
            {
                escritor.write(aux.getNombre() + "-" + aux.getCodigo() + "-" + aux.getStock() + "-" + aux.getPrecio() + "-" + aux.getTipo() + "\n");
            }
            escritor.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void importarBoleta(BaseDeUsuarios bdu, String correo)
    {
        try
        {
            String ruta = null;
            Map <String,Usuario> mapaAux = bdu.getMapaPorCorreo();
            Usuario user = mapaAux.get(correo);
            ruta = user.getNombre() + ".txt";
            File archivo = new File(ruta);
            FileWriter fichero = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fichero);
            escritor.write("\n Andre S.A.\n\n\n");
            escritor.write("Nombre del comprador: " + user.getNombre() + "\n");
            escritor.write("Correo del comprador: " + user.getCorreo() + "\n");
            DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            escritor.write ("Fecha de la compra: " + dtf4.format(LocalDateTime.now()) + "\n");
            List <Producto> listaProductos = user.getCarrito();
            int total = 0;
            for (int i = 0; i < listaProductos.size(); i++)
            {
                Producto prod = listaProductos.get(i);
                total = total + (prod.getPrecio() * prod.getStock()); 
                escritor.write("Nombre del producto: " + prod.getNombre() + "\n");
                escritor.write("Cantidad comprada : " + prod.getStock() + "\n");
                escritor.write("Precio: $" + (prod.getPrecio() * prod.getStock()) + "\n");
            }
            escritor.write("\nCantidad total a pagar: $" + total + "\n\n");
            escritor.write("---GRACIAS POR SU COMPRA---");
            escritor.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}