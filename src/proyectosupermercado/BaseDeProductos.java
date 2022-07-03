package proyectosupermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseDeProductos implements Mostrador
{
    //VARIABLES DE INSTANCIA
    private Map <Integer,Producto> mapaPorCodigo;
    private Map <String,ArrayList<Producto>> mapaPorNombre;
    private ArrayList <Producto> listaDeProductos;
    
    public ArrayList<Producto> getListaDeProductos()
    {
        return listaDeProductos;
    }
    public void setListaDeProductos(ArrayList<Producto> listaDeProductos)
    {
        this.listaDeProductos = listaDeProductos;
    }
    
    //CONSTRUCTOR
    public BaseDeProductos()
    {
        mapaPorCodigo = new HashMap<>();
        mapaPorNombre = new HashMap<>();
        listaDeProductos = new ArrayList();
    }

    //MÉTODOS
    public boolean ConfirmarStock(Producto prod, int stock)
    {
        if(prod.getStock() >= stock)
        {
            return true;
        }
        return false;
    }

    public int ProductoMasBarato()
    {
        int precioMenor = (listaDeProductos.get(0)).getPrecio();
        for (int i = 1; i < listaDeProductos.size(); i++)
        {
            if (precioMenor > (listaDeProductos.get(i)).getPrecio())
            {
                precioMenor = (listaDeProductos.get(i)).getPrecio();
            }
        }
        return precioMenor;
    }

    public ArrayList<Producto> BuscarPorRango(int precioMin, int precioMax)
    {
        ArrayList<Producto> productosRangos = new ArrayList();
        for (int i = 0; i < listaDeProductos.size(); i++)
        {
            Producto auxProd = listaDeProductos.get(i);
            if (auxProd.getPrecio() >= precioMin && auxProd.getPrecio() <= precioMax)
            {
                productosRangos.add(auxProd);
            }
        }
        return productosRangos;
    }
    
    public Producto CrearProductoBoleta(int codigo, int stock)
    {
        Producto aux = new Producto();
        aux.setNombre((BuscarProducto(codigo)).getNombre());
        aux.setCodigo((BuscarProducto(codigo)).getCodigo());
        aux.setStock(stock);
        aux.setPrecio((BuscarProducto(codigo)).getPrecio());
        aux.setTipo((BuscarProducto(codigo)).getTipo());
        BuscarProducto(codigo).setStock(BuscarProducto(codigo).getStock() - stock);
        return (Producto) aux;
    }
    
    public Producto CrearProducto(String nombre,int codigo, int stock, int precio, String tipo)
    {
        Producto aux = new Producto();
        aux.setNombre(nombre);
        aux.setCodigo(codigo);
        aux.setStock(stock);
        aux.setPrecio(precio);
        aux.setTipo(tipo);
        return (Producto) aux;
    }

    public void AgregarProducto(Producto datosProducto)
    {
        if(mapaPorCodigo.containsKey(datosProducto.getCodigo())==true)
        {
            ModificarStock(datosProducto.getStock(), datosProducto.getCodigo());
        }else
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
    }
    
    public void Mostrar()
    {
        for (int i = 0; i < listaDeProductos.size(); i++)
        {
            System.out.println(listaDeProductos.get(i));
        }
        System.out.println();
    }

    public boolean MostrarPor(String nombre)
    {
        if(mapaPorNombre.containsKey(nombre) == false)
        {
            return false;
        }
        else
        {
            return true;
        }
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
    }
    
    public Producto BuscarProducto(int codigo)
    {
        if(mapaPorCodigo.containsKey(codigo) == false)
        {
            return null;
        }
        else
        {
            return mapaPorCodigo.get(codigo);
        }
    }

    public void EliminarProducto(int codigo)
    {
        Producto aux = mapaPorCodigo.get(codigo);
        mapaPorCodigo.remove(aux.getCodigo(), aux);
        mapaPorNombre.remove(aux.getNombre(), aux);
        listaDeProductos.remove(aux);
    }
    
    public void ModificarNombre(String nombre , int codigo)
    {
        Producto aux = mapaPorCodigo.get(codigo);
        ArrayList<Producto> lista = mapaPorNombre.get(aux.getNombre());
        lista.remove(aux);
        aux.setNombre(nombre);
        if(mapaPorNombre.containsKey(nombre)){
            mapaPorNombre.get(aux.getNombre()).add(aux);
        }else{
            ArrayList<Producto> nuevaLista = new ArrayList<>();
            nuevaLista.add(aux);
            mapaPorNombre.put(nombre, nuevaLista);
        }
        mapaPorCodigo.put(codigo, aux);
        for (int i = 0; i < listaDeProductos.size(); i++) {
            if(listaDeProductos.get(i).getCodigo() == codigo){
                listaDeProductos.get(i).setNombre(nombre);
            }
        }
    }
    
    public void ModificarCodigo(int codigoNuevo , int codigoAntiguo)
    {
        Producto aux = mapaPorCodigo.get(codigoAntiguo);
        mapaPorCodigo.remove(codigoAntiguo,aux);
        aux.setCodigo(codigoNuevo);
        mapaPorCodigo.put(codigoNuevo, aux);
        for (int i = 0; i < listaDeProductos.size(); i++)
        {
            if(listaDeProductos.get(i).getCodigo() == codigoAntiguo)
            {
                listaDeProductos.get(i).setCodigo(codigoNuevo);
            }
        }
        ArrayList<Producto> lista = mapaPorNombre.get(aux.getNombre());
        for (int i = 0; i < lista.size(); i++)
        {
            if(lista.get(i).getCodigo() == codigoAntiguo)
            {
                lista.get(i).setCodigo(codigoNuevo);
            }
        }
        mapaPorNombre.put(aux.getNombre(), lista);
    }
    
    public void ModificarStock(int stock , int codigo)
    {
        Producto aux = mapaPorCodigo.get(codigo);
        aux.setStock(stock);
        mapaPorCodigo.put(codigo, aux);
        for (int i = 0; i < listaDeProductos.size(); i++)
        {
            if(listaDeProductos.get(i).getCodigo()== codigo)
            {
                listaDeProductos.get(i).setStock(stock);
            }
        }
        ArrayList<Producto> lista = mapaPorNombre.get(aux.getNombre());
        for (int i = 0; i < lista.size(); i++)
        {
            if(lista.get(i).getCodigo() == codigo)
            {
                lista.get(i).setStock(stock);
            }
        }
        mapaPorNombre.put(aux.getNombre(), lista);
    }
    
    public void ModificarPrecio(int precio , int codigo)
    {
        Producto aux = mapaPorCodigo.get(codigo);
        aux.setPrecio(precio);
        mapaPorCodigo.put(codigo, aux);
        for (int i = 0; i < listaDeProductos.size(); i++)
        {
            if(listaDeProductos.get(i).getCodigo()== codigo)
            {
                listaDeProductos.get(i).setPrecio(precio);
            }
        }
        ArrayList<Producto> lista = mapaPorNombre.get(aux.getNombre());
        for (int i = 0; i < lista.size(); i++)
        {
            if(lista.get(i).getCodigo() == codigo)
            {
                lista.get(i).setPrecio(precio);
            }
        }
        mapaPorNombre.put(aux.getNombre(), lista);
    }
}