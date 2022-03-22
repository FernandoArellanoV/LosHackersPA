

package proyectosupermercado;

import java.io.*;

public class ProyectoSupermercado {

   
    public static void main(String args[]) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        Usuario User = new Usuario();
        
        System.out.println("Ingrese su usuario");
        User.setNombre(lector.readLine());
        System.out.println("Ingrese su contraseña");
        User.setContraseña(lector.readLine());
        System.out.println("Ingrese su correo electrónico");
        User.setCorreo(lector.readLine());
        
        System.out.println("Su nombre es: "+ User.getNombre());
        System.out.println("Su contraseña es: "+ User.getContraseña());
        System.out.println("Su correo es: "+ User.getCorreo());
    }
    
}

