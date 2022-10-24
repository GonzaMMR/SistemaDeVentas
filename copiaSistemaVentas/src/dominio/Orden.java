/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    private int idOrden=0;
    ArrayList<Producto> productos = new ArrayList<>();
    private int contadorProductos=10;//maximo d productos q puede haber son 10
    private int contadorOrdenes=0;

    public Orden() {
    }
    
    public Orden(int idOrden, ArrayList productos){
        this.idOrden = idOrden;
        this.productos = productos;
    }
    
    //getter del arraylist
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
       @Override
    public String toString() {
        return  idOrden + ":  " + productos;
    }
    
    
    public void ingresarProducto(Orden or, Producto producto){
        if(contadorProductos!=0){
            or.getProductos().add(producto);
            contadorProductos--;
            System.out.println("\n\t\tSe ha añadido el producto al carrito");
            System.out.println("\t\tEspacio disponible: "+ contadorProductos);
        }else{
            System.out.println("\n\t\tNo hay mas espacio en el carrito");
        }
    }

    
    //metodo2
    public double calcularTotal(Orden or){
        double pagar=0;
        for(Producto i: or.getProductos()){
            pagar = pagar + i.getPrecio();
        }
        System.out.println("");
        System.out.println("\t\tTOTAL A PAGAR: "+pagar);
        System.out.println("\t\tRECUERDA QUE PARA HACER OTRA COMPRA, USTED DEBE VOLVER A ATRAS Y VISUALIZAR SU COMPRA");
        idOrden++;
        contadorOrdenes++;
        System.out.println("\t\tLa ORDEN, que has realizado lleva el identificador "+idOrden);
        System.out.println("\t\tOrdenes realizadas:" +contadorOrdenes);
        contadorProductos=10;

        
        return pagar;
    }
    
    
    //metodo1
    public void mostrarOrden(Orden or){//visualizar carrito
        System.out.println("\t\tCARRITO");
        System.out.println("\t\t=======");
        Iterator<Producto> itr = or.getProductos().iterator();
        while(itr.hasNext()){
            Producto var = itr.next();
            System.out.println("\t\t"+var.toString());
        }
    }


    
    
}
