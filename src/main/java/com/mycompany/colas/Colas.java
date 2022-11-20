/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author MargaritaT
 */

public class Colas {
    public Nodo head,tail;
    
    int length=0;
    
  
    
    public void enqueue(String Solicitantes){ //Ingresa un elemento al final de la cola
        Nodo nodo1=new Nodo(Solicitantes);
        if(head==null){
            head=nodo1;
        }
        else
        {
            tail.siguiente=nodo1;
           
        }
        tail=nodo1;
        length ++;
       
    }
   
    
    public int length() {//tamanio de la cola
        return length;
    }
    
    
    public void dequeue()//Saca el elemento que se encuentra a la cabeza (primero) de la estructura
    {
      if (head!=null);
      {
          Nodo eliminado=head;
          head=head.siguiente;
          eliminado.siguiente=null;
          
       
          length --;
      }
      
     
    }
    
    public String Obtener()//Optiene el elemento que se encuntra en la cabezara de la cola 
    {
        if (head ==null)
        {
            return null;
        }
        else
        {
            return head.Solicitantes;
        }
    }
    public boolean is_empty() {//La cola esta vacia?
        if(length==0)
        {
            return length==0;
        }
        else
        {
            
            return length==1;
        }
        
        
    }

  
    
    
}
