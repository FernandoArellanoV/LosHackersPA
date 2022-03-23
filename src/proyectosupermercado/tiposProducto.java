/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector; 

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
