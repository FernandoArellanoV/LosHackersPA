package proyectosupermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseDeProductos
{
    //VARIABLES DE INSTANCIA
    private Map <String,Producto> mapaPorCodigo;
    private Map <String,Producto> mapaPorNombre;
    private ArrayList <Producto> listaDeProductos;
    
    //CONSTRUCTOR
    public BaseDeProductos(Map aa, Map bb, ArrayList cc)
    {
        mapaPorCodigo = new HashMap();
        mapaPorNombre = new HashMap ();
        listaDeProductos = new ArrayList <Producto>();    
        mapaPorCodigo.putAll(aa);
        mapaPorNombre.putAll(bb);
        listaDeProductos.addAll(cc);
    }
    public void MostrarProductos()
    {
        for (int i=0;i<listaDeProductos.size();i++) {
            System.out.println(listaDeProductos.get(i));
        }
    }
    
    public void MostrarPorCodigo()
    {
        for(Producto aux: mapaPorCodigo.values())
        {
            System.out.println(aux.lectorDeProducto());
        }
    }
    
    public void MostrarPorNombre()
    {
        for(Producto aux: mapaPorNombre.values())
        {
            System.out.println(aux.lectorDeProducto());
        }
    }
}