package proyectosupermercado;

import java.util.ArrayList;
import java.util.List;

public class tiposProducto
{
    //VARIABLES DE INSTANCIA
    private String tipoDeProducto;
    private List <Producto> listaDeProductos;
    
    //CONSTRUCTOR
    public tiposProducto( String tipoDeProducto)
    {
        this.tipoDeProducto = tipoDeProducto;
        this.listaDeProductos = new ArrayList <Producto>();     
    }

    //GETTER
    public String getTipoDeProducto()
    {
        return tipoDeProducto;
    }

    //SETTER
    public void setTipoDeProducto(String tipoDeProducto)
    {
        this.tipoDeProducto = tipoDeProducto;
    }
}