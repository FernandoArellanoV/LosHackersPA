package proyectosupermercado;

import java.util.HashMap;
import java.util.Map;

public class BaseDeUsuarios {
    private String tipoUsuario;
    private Map <String,Usuario> mapaPorCorreo;
    public BaseDeUsuarios(String tipoUsuario)
    {
        this.tipoUsuario = tipoUsuario;
        mapaPorCorreo = new HashMap();
    }
    public BaseDeUsuarios(String tipoUsuario, Map aa)
    {
        this.tipoUsuario = tipoUsuario;
        mapaPorCorreo = new HashMap();
        mapaPorCorreo.putAll(aa);
    }
    
}
