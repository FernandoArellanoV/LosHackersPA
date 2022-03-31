package proyectosupermercado;

public class Producto
{
    //VARIABLES DE INSTANCIA
    private String nombre;
    private int codigo;
    private int stock;
    private int precio;
    private String tipo;

    //CONSTRUCTOR
    public Producto(String nombre, String codigo,String stock,String precio,String tipo)
    {
        this.nombre = nombre;
        this.codigo = Integer.parseInt(codigo);
        this.stock = Integer.parseInt(stock);
        this.precio = Integer.parseInt(precio);        
        this.tipo = tipo;
    }

    //GETTERS
    public String getNombre()
    {
        return nombre;
    }
    public int getCodigo()
    {
        return codigo;
    }
    public int getStock()
    {
        return stock;
    }
    public int getPrecio()
    {
        return precio;
    }
    public String getTipo()
    {
        return tipo;
    }

    //SETTERS
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    public void setPrecio(int precio)
    {
        this.precio = precio;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", stock=" + stock + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
}