/*
*MAIN
 */
package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class Interfaz {
    public static void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try{
            PrintWriter salida = new PrintWriter(archivo); 
            salida.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombre, ArrayList contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {//se que el fichero esxiste
            salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el archivo!!");
        } catch (FileNotFoundException ex) {//el fichero no existe -> excp
            ex.printStackTrace(System.out);
        } finally {//Este bloque siempre se ejecuta
            salida.close();
        }
    }
    
    public static void agregarArchivo(String nombre, ArrayList contenido){//Este metodo agrega texto en el archivo
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {
             salida = new PrintWriter(new FileWriter(nombre, true));
             for (Object i: contenido) {
                salida.println(i);
            }
        } catch (IOException ex) {
            
        }finally{
            salida.close();
        }
    }

}
