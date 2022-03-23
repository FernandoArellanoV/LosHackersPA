package proyectosupermercado;

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ProyectoSupermercado {

   
    public static void main(String args[]) throws IOException {
        int cont = 0;
        Map <String,Usuarios> mapaDeUsuario = new HashMap <String,Usuarios>();
        
        try{
            Usuarios User = new Usuarios();
            String[] datosUsuario = new String[4];
            Scanner input = new Scanner(new File("Usuarios.txt")); 
            while(input.hasNextLine()){
        
                String linea = input.nextLine();
                datosUsuario = linea.split("-");
                User.setNombre(datosUsuario[0]);
                User.setContraseña(datosUsuario[1]);
                User.setCorreo(datosUsuario[2]);
                mapaDeUsuario.put(datosUsuario[1], User);
                cont++;
            } 
            input.close();
            for(int i = 0;i <= cont ;i++ ){
        
                System.out.println("Su nombre es: "+ mapaDeUsuario);

            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
                
        /*
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        Usuarios User = new Usuarios();
        
        
        System.out.println("Ingrese su usuario");
        User.setNombre(lector.readLine());
        System.out.println("Ingrese su contraseña");
        User.setContraseña(lector.readLine());
        System.out.println("Ingrese su correo electrónico");
        User.setCorreo(lector.readLine());
        
        System.out.println("Su nombre es: "+ User.getNombre());
        System.out.println("Su contraseña es: "+ User.getContraseña());
        System.out.println("Su correo es: "+ User.getCorreo());
        */
    }
    
}

