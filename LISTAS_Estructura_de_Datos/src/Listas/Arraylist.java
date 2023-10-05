
package Listas;

import java.util.List;
import java.util.ArrayList;


public class Arraylist {

    public static void main(String[] args) {

        
        List<String>pais=new ArrayList<>();
                   //la funcion (.add) nos permite agregar elemetos en la lista 
          pais.add("colombia");
          pais.add("peru");
          pais.add("mexico");
          pais.add("brazil");
        
        
       List<Integer>num=new ArrayList<>();
                      num.add(1);
                      num.add(2);
                      num.add(3);
                      num.add(4);
             

    




       
          
          //este ( List pais2=pais;) es un metodo para pasar o clonar lo datos de una lista a otra
          
           
          //la funcion (.set) lo qeu nos permite es cambiar un elemento de la lista por otro que queramos usando el indice 
           pais.set(0,"venezuela");


         List<String>pais2=new ArrayList<>(pais);
         pais2.add("guatemala");
    
          
         List<String>pais3=new ArrayList<>(pais2);
         pais3.clear();
             

      
         
      
 //la funcion (.remove) nos permite eliminar un elemento de la lista dependiendo de la pocicion que queramos (quita el mesajeado que esta en la siguiente linea y te imprimira que el 2 es brazil,con al mensajeado te imprime que es mexico 
        
        //pais.remove(0);
        
        
        
       
  //la funcion (.size) nos permite saber cual es el tamaño de la lista 
          System.out.println("tamaño es "+pais.size());
          
        
        
        
      
// la funcion(.Get) nos permite obtener el elemento que se encuentre en la lista dependiendo de su pocicion
          System.out.println("el pais que esta en la posicion 3 es: "+pais.get(2));

// metodo para imprimir una lista (con foreach)
         System.out.println("\n-----PAISES-----");
        
         for (String pai : pais)
             {
         
            System.out.println("-pais: "+pai);
         
             }
        
         System.out.println("\nLISTA 2");
       
         for (Object object : pais2)
        {
            System.out.println("-pais"+object);
        }
       
        System.out.println("\nLISTA 3");
        
         for (String string : pais3)
        {
            System.out.println("-oais"+string);
        }
       
             System.out.println(""+pais.contains("venezuela"));
           
             System.out.println(""+pais.equals(pais2));
            
             
             
        //otro metodo de impresion:
        
      //  System.out.println(""+pais);
        //System.out.println(""+pais2);


    }
    
}
