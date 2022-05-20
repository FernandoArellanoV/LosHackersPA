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
        listaDeProductos = new ArrayList<Producto>();    
    }

    //MÉTODOS

    public void ProductoMasBarato()
    {
        int precioMenor = (listaDeProductos.get(0)).getPrecio();
        System.out.println("¡Productos con precios imperdible! ¡No dejes la oportunidad!\n");
        for (int i = 1; i < listaDeProductos.size(); i++)
        {
            if (precioMenor > (listaDeProductos.get(i)).getPrecio())
            {
                precioMenor = (listaDeProductos.get(i)).getPrecio();
            }
        }
        for (int i = 0; i < listaDeProductos.size(); i++)
        {
            if (precioMenor == (listaDeProductos.get(i)).getPrecio())
            {
                System.out.println( "-" + (listaDeProductos.get(i)).getCodigo() + " " + (listaDeProductos.get(i)).getNombre() + " " + (listaDeProductos.get(i)).getPrecio());
            }
            System.out.println("\n");
        }
    }

    public void BuscarPorRango(int precioMin, int precioMax)
    {
        for (int i = 0; i < listaDeProductos.size(); i++)
        {
            Producto auxProd = listaDeProductos.get(i);
            if (auxProd.getPrecio() >= precioMin && auxProd.getPrecio() <= precioMax)
            {
                System.out.println("- Nombre: " + auxProd.getNombre() + " | Precio: " + auxProd.getPrecio());
            }
        }
        System.out.println("\n");
    }

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
    
    public void Mostrar()
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
    
    public void ModificarNombre(String nombre , int codigo)
    {
        if(mapaPorCodigo.containsKey(codigo))
        {
            Producto aux = mapaPorCodigo.get(codigo);
            ArrayList<Producto> lista = mapaPorNombre.get(aux.getNombre());
            lista.remove(aux);
            aux.setNombre(nombre);
            if(mapaPorNombre.containsKey(nombre)){
                listaDeProductos.add(aux);
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
            System.out.println("El nombre se ha modificado con exito");
        }
        else
        {
            System.out.println("No existe el producto del codigo asociado");
        }  
    }
    
    public void ModificarCodigo(int codigoNuevo , int codigoAntiguo)
    {
        
        if(mapaPorCodigo.containsKey(codigoAntiguo))
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
            System.out.println("El codigo se ha modificado con exito");
        }
        else
        {
            System.out.println("No existe el producto del codigo asociado");
        }
    }
    
    public void ModificarStock(int stock , int codigo)
    {
        
        if(mapaPorCodigo.containsKey(codigo))
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
            System.out.println("El stock se ha modificado con exito");
        }
        else
        {
            System.out.println("No existe el producto del codigo asociado");
        }  
    }
    
    public void ModificarPrecio(int precio , int codigo)
    {
        if(mapaPorCodigo.containsKey(codigo))
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
            System.out.println("El precio se ha modificado con exito");
        }
        else
        {
            System.out.println("No existe el producto del codigo asociado");
        }  
    }
}