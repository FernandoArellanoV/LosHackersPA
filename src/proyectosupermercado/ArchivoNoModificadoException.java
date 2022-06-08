package proyectosupermercado;

public class ArchivoNoModificadoException extends Exception
{
    public ArchivoNoModificadoException()
    {
        super("No se ha podido sobreescribir el archivo txt correctamente");
    }
}
