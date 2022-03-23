

package proyectosupermercado;

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ProyectoSupermercado {
    
   
    public static void main(String args[]) throws IOException {
        Map <String,Usuarios> mapaDeUsuario = new HashMap <>();
        
        try{
            String[] datosUsuario = new String[4];
            Scanner input = new Scanner(new File("Usuarios.txt")); 
            while(input.hasNextLine()){
        
                String linea = input.nextLine();
                datosUsuario = linea.split("-");
                Usuarios User = new Usuarios(datosUsuario[0],datosUsuario[1],datosUsuario[2]);
                mapaDeUsuario.put(User.getCorreo(), User);
            } 
            input.close();
            for(Usuarios aux: mapaDeUsuario.values()){
            
                System.out.println(aux.xd());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
                
       
    }
    
}

