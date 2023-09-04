
package EJERCICIOS;

import javax.swing.JOptionPane;


public class Matriz {

  
    public static void main(String[] args) {
        
        //ejercicio suma de columnas de una matriz
        
        
      int numeros [] [] = { {1,2,3},{3,1,2},{2,3,1} };
       int resultado[]=new int [3];
       
         
        for (int filas= 0; filas<numeros.length ; filas++)
        {
            for (int columnas = 0; columnas < numeros[filas].length; columnas++)
                
            {
                //aqui lo que hace es guardar los primeros numero de cada columna ,ya cuando el primer for pasa a la segunda fila,los numeros que estan el en vector resultado van a ser sumados con los numeros columna de la segunda fila y a la ves en el vector se va a remplazar con el resultado de la suma,y asi suscesivamente hasta que se sume todas las columnas
         resultado[columnas]+=numeros[filas][columnas];
  
                  
                 
            
            }
            
        }
         for (int filas= 0; filas<numeros.length ; filas++)
        {
            System.out.println("");
            
            for (int columnas = 0; columnas < numeros[filas].length; columnas++)
                
            {
                System.out.print(numeros[filas][columnas]+" ");
               
               
        }
           
    }
    
     for (int columnas= 0; columnas< resultado.length; columnas++)
            {
                 System.out.println("\nel resultado de la suma de columna" +(columnas+1)+" es");
                System.out.println(resultado[columnas]+" ");
            }
    
    
    
    
    
    
    }
    
}
