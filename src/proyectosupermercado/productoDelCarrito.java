/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;


public class productoDelCarrito {
    
    private String nombre;
    private int codigo;
    private int stock;
    private int precio;
    private String tipo;
    
     public productoDelCarrito(String nombre, String codigo,String stock,String precio,String tipo){
    
        this.nombre = nombre;
        this.codigo = Integer.parseInt(codigo);
        this.stock = Integer.parseInt(stock);
        this.precio = Integer.parseInt(precio);        
        this.tipo = tipo;
    }
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
