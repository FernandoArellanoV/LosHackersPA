
package proyectosupermercado;

import java.util.ArrayList;
import java.util.List;


public class tiposProducto {
    
    private String tipoDeProducto;
    private List <Producto> listaDeProductos;
    
    public tiposProducto( String tipoDeProducto){
        
        this.tipoDeProducto = tipoDeProducto;
        this.listaDeProductos = new ArrayList <Producto>();     
    }
    
    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }
    
    
    
}
