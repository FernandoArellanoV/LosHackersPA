package proyectosupermercado;

public class ArchivoInexistenteException extends Exception
{
    public ArchivoInexistenteException()
    {
        super("No se ha encontrado un archivo de texto");
    }
}
