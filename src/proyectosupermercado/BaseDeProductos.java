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
        mapaPorCodigo = new HashMap();
        mapaPorNombre = new HashMap ();
        listaDeProductos = new ArrayList <Producto>();    
    }
    public void AgregarProducto(Producto datosProducto)
    {
        mapaPorCodigo.put(datosProducto.getCodigo(), datosProducto);
        if(mapaPorNombre.containsKey(datosProducto.getNombre()) == false)
        {
            ArrayList<Producto> listaDeNombre = new ArrayList<>();
            listaDeNombre.add(datosProducto);
            mapaPorNombre.put(datosProducto.getNombre(), listaDeNombre);
        }else
        {
            mapaPorNombre.get(datosProducto.getNombre()).add(datosProducto);
        }
        listaDeProductos.add(datosProducto);
    }
    
    public void MostrarProductos()
    {
        for (int i=0;i<listaDeProductos.size();i++) {
            System.out.println(listaDeProductos.get(i));
        }
    }
    
    public void MostrarPor(int codigo)
    {
        if(mapaPorCodigo.containsKey(codigo) == false)
        {
            System.out.println("No existe el producto");
        }else
        {
            System.out.println(mapaPorCodigo.get(codigo).toString());
        }
    }
    
    public void MostrarPor(String nombre)
    {
        if(mapaPorNombre.containsKey(nombre) == false)
        {
            System.out.println("No existe el producto");
        }else
        {
            for (Producto aux : mapaPorNombre.get(nombre)) {
                System.out.println(aux.toString());
            }
        }
    }
}