/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.Interfaz;
import dominio.Orden;
import dominio.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class VentasTest {
    static Orden o =new Orden();
    static Scanner ent = new Scanner(System.in);
    static ArrayList<Orden> orden = new ArrayList<>();
    static int id=0;
    
    //ficheros
    static String nombreArchivo = "productos.txt";
    
    //PRODUCTOS
    static Producto p1 = new Producto(1, "PS4", 200);
    static Producto p2 = new Producto(2, "XBOX", 150);
    static Producto p3 = new Producto(3, "PC", 50);
    static Producto p4 = new Producto(4, "CAMARA", 25);
    static Producto p5 = new Producto(5, "PSP", 30);
    static Producto p6 = new Producto(6, "MOVIL", 500);
    static Producto p7 = new Producto(7, "TABLET", 15);
    static Producto p8 = new Producto(8, "COMIC", 3);
    static Producto p9 = new Producto(9, "CASCOS", 10);
    static Producto p10 = new Producto(10, "HORNO", 100);
    static Producto p11 = new Producto(11, "VENTILADOR", 50);
    static Producto p12 = new Producto(12, "LIBRO", 13);
    
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\tBIENVENIDO AL SISTEMA DE VENTAS");
        System.out.println("\t\t\t\t\t\t\t\t\t===============================");
        menu2();
        
    }
    
    public static void menu2(){
        int opcion=-1;
        while(opcion!=0){
        System.out.println("¿QUE DESEA REALIZAR?\n");
        System.out.println("(1) REALIZAR UNA ORDEN (COMPRA)");
        System.out.println("(2) VISUALIZAR TODAS SUS COMPRAS");
        System.out.println("(3) VER ARCHIVO CON SUS ORDENES");
        System.out.println("\t(0)   SALIR");
        System.out.print("Seleccione la opcion a elegir: ");
        opcion=ent.nextInt();
        switch(opcion){
            case 1:
                ArrayList<Producto> productos = new ArrayList<>();
                id++;
                Orden or = new Orden(id, productos);
                menu(or);
                break;
            case 2:
                mostrarOrdenes();
                break;
            case 3:
                //Interfaz.crearArchivo(nombreArchivo);
                Interfaz.agregarArchivo(nombreArchivo, orden);
                break;
            case 0:
                break;
            default:
                System.out.println("Elija entre las opcines 1 y 3");
                break;
        }
        for(int i=0;i<2;i++){
            System.out.println("");
        }
        }
    }
    
    
    public static void menu(Orden or){
        int opcion=-1;
        while(opcion!=0){
            System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\t¿QUE DESEA COMPRAR?\n");
        System.out.println("(1) MOSTRAR PRODUCTOS DISPONIBLES A COMPRAR");
        System.out.println("(2) AGREGAR AL CARRITO ");
        System.out.println("(3) VISUALIZAR CARRITO ");
        System.out.println("(4) TOTAL A PAGAR");
        System.out.println("\t(0)   SALIR");
        System.out.print("Seleccione la opcion a elegir: ");
        opcion=ent.nextInt();
        switch(opcion){
            case 1:
                insertarProducto();
                break;
            case 2:
               agregarAlCarrito(or);
                break;
            case 3:
               o.mostrarOrden(or);
                break;
            case 4:
                o.calcularTotal(or);
                break;
            case 0:
                orden.add(or); 
                break;
            default:
                System.out.println("Elija entre las opcines 1 y 4");
                break;
        }
        for(int i=0;i<2;i++){
            System.out.println("");
        }
        }
    }
    
    public static void insertarProducto(){
        System.out.println("");
        System.out.println("\t\tLISTA DE PRODUCTOS");
        System.out.println("\t\t==================");
        System.out.println("\t\t" + p1.getIdProducto() + ": " + p1.getNombre() + ", " + p1.getPrecio());
        System.out.println("\t\t" + p2.getIdProducto() + ": " + p2.getNombre() + ", " + p2.getPrecio());
        System.out.println("\t\t" + p3.getIdProducto() + ": " + p3.getNombre() + ", " + p3.getPrecio());
        System.out.println("\t\t" + p4.getIdProducto() + ": " + p4.getNombre() + ", " + p4.getPrecio());
        System.out.println("\t\t" + p5.getIdProducto() + ": " + p5.getNombre() + ", " + p5.getPrecio());
        System.out.println("\t\t" + p6.getIdProducto() + ": " + p6.getNombre() + ", " + p6.getPrecio());
        System.out.println("\t\t" + p7.getIdProducto() + ": " + p7.getNombre() + ", " + p7.getPrecio());
        System.out.println("\t\t" + p8.getIdProducto() + ": " + p8.getNombre() + ", " + p8.getPrecio());
        System.out.println("\t\t" + p9.getIdProducto() + ": " + p9.getNombre() + ", " + p9.getPrecio());
        System.out.println("\t\t" + p10.getIdProducto() + ": " + p10.getNombre() + ", " + p10.getPrecio());
        System.out.println("\t\t" + p11.getIdProducto() + ": " + p11.getNombre() + ", " + p11.getPrecio());
        System.out.println("\t\t" + p12.getIdProducto() + ": " + p12.getNombre() + ", " + p12.getPrecio());
    }
    
            public static void agregarAlCarrito(Orden or){
        int num;
        System.out.print("\n\t\tIntroduzca el ID del producto que quieras añadir al carrito: ");
        num = ent.nextInt();
        if(num==1){
            o.ingresarProducto(or,p1);
        }else if(num==2){
            o.ingresarProducto(or,p2);
        }else if(num==3){
            o.ingresarProducto(or,p3);
        }else if(num==4){
            o.ingresarProducto(or,p4);
        }else if(num==5){
            o.ingresarProducto(or,p5);
        }else if(num==6){
            o.ingresarProducto(or,p6);
        }else if(num==7){
            o.ingresarProducto(or,p7);
        }else if(num==8){
            o.ingresarProducto(or,p8);
        }else if(num==9){
            o.ingresarProducto(or,p9);
        }else if(num==10){
            o.ingresarProducto(or,p10);
        }else if(num==11){
            o.ingresarProducto(or,p11);
        }else if(num==12){
            o.ingresarProducto(or,p12);
        }
    }
    
    public static void mostrarOrdenes(){
        System.out.println("");
        System.out.println("\t\tORDENES");
        System.out.println("\t\t=======");
        for (Orden i: orden) {
            System.out.println("\t\t"+i);
        }
    }

}
