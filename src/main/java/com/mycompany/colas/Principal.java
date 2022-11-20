/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colas;

/**
 *
 * @author MargaritaT
 */
public class Principal {

    public static void main(String[] args) {
        Colas cola1=new Colas();
       
       
        System.out.println("                 Colas");
        System.out.println("========================================");
        System.out.println("La cola esta vacia:"+ cola1.is_empty());
        System.out.println("Tamanio de la cola es :"+cola1.length());
        System.out.println("\nIngresando elementos a la cola:");
         cola1.enqueue("Fernando");
        cola1.enqueue("Mariana");
        cola1.enqueue("Armando");
        cola1.enqueue("Jesus");
        cola1.enqueue("Fatima");
        System.out.println("\n\nLa cola esta vacia:"+ cola1.is_empty());
        System.out.println("Tamanio de la cola es :"+cola1.length());
        System.out.println("Primer elemento de la cola:"+cola1.Obtener());
        
        System.out.println("\nEliminando el pirmmer elemento de la cola ");
        cola1.dequeue();
        System.out.println("\nNuevo primer elemento:"+cola1.Obtener());
        System.out.println("\nEstado Actual de la cola:");
        while(cola1.head!=null)//ira imprimiendo los datos que encuntre al principio de la cola mientras la lista que recorre no sea null 
            //que significa que se llogo al final de la cola 
                {
                    System.out.println(cola1.Obtener());//Imprime el primeor de la cola
                    cola1.dequeue();//elimina el dato que se encuntra en la cabezara de la cola 
                    
                }

       
        
        
        
    }
}
