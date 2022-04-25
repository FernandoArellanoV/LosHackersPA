package proyectosupermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseDeProductos
{
    //VARIABLES DE INSTANCIA
    private Map <Integer,Producto> mapaPorCodigo;
    private Map <String,ArrayList<Producto>> mapaPorNombre;
    private ArrayList <Producto> listaDeProductos;
    
    //CONSTRUCTOR
    public BaseDeProductos()
    {
        mapaPorCodigo = new HashMap<>();
        mapaPorNombre = new HashMap<>();
        listaDeProductos = new ArrayList<Producto>();    
    }

    //MÉTODOS
    public void AgregarProducto(Producto datosProducto)
    {
        mapaPorCodigo.put(datosProducto.getCodigo(), datosProducto);
        if(mapaPorNombre.containsKey(datosProducto.getNombre()) == false)
        {
            ArrayList<Producto> listaDeNombre = new ArrayList<>();
            listaDeNombre.add(datosProducto);
            mapaPorNombre.put(datosProducto.getNombre(), listaDeNombre);
        }
        else
        {
            mapaPorNombre.get(datosProducto.getNombre()).add(datosProducto);
        }
        listaDeProductos.add(datosProducto);
    }
    
    public void MostrarProductos()
    {
        for (int i = 0; i < listaDeProductos.size(); i++)
        {
            System.out.println(listaDeProductos.get(i));
        }
        System.out.println();
    }

    public void MostrarPor(String nombre)
    {
        if(mapaPorNombre.containsKey(nombre) == false)
        {
            System.out.println("No existe el producto");
        }
        else
        {
            for (Producto aux : mapaPorNombre.get(nombre))
            {
                System.out.println(aux.toString());
            }
        }
        System.out.println();
    }

    public void MostrarPor(int codigo)
    {
        if(mapaPorCodigo.containsKey(codigo) == false)
        {
            System.out.println("No existe el producto");
        }
        else
        {
            System.out.println(mapaPorCodigo.get(codigo).toString());
        }
        System.out.println();
    }
    
    public void EliminarProducto(int codigo)
    {
        if(mapaPorCodigo.containsKey(codigo) == false)
        {
            System.out.println("No existe el producto");
        }
        else
        {
            Producto aux = mapaPorCodigo.get(codigo);
            mapaPorCodigo.remove(aux.getCodigo(), aux);
            mapaPorNombre.remove(aux.getNombre(), aux);
            listaDeProductos.remove(aux);
            System.out.println("Se elimino con exito");
        }
        System.out.println();
    }
}