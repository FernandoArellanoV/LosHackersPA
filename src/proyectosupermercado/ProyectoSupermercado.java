

package proyectosupermercado;

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ProyectoSupermercado{
    public static void main(String args[]) throws IOException {
        Map <String,Usuarios> mapaDeUsuario = new HashMap <>();
        Map <String,Producto> mapaDeProductos = new HashMap<>();
        
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
            
                System.out.println(aux.lectorDeUsuario());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
         try{
            String[] datosProducto = new String[5];
            Scanner input = new Scanner(new File("Productos.txt")); 
            while(input.hasNextLine()){
        
                String linea = input.nextLine();
                datosProducto = linea.split("-");
                Producto productos = new Producto(datosProducto[0],datosProducto[1],datosProducto[2],datosProducto[3],datosProducto[4]);
                mapaDeProductos.put(productos.getTipo(), productos);
            } 
            input.close();
            for(Producto aux: mapaDeProductos.values()){
            
                System.out.println(aux.lectorDeProducto());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
            
        }
    }
    


