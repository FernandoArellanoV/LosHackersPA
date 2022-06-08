package proyectosupermercado;

public class BoletaNoGeneradaException extends Exception
{
    public BoletaNoGeneradaException()
    {
        super("No se ha podido generar correctamente la boleta de compra");
    }
}