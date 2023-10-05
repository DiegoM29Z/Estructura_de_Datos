
package Ejercicios;

import java.util.Random;


public class primero {

    
    public static void main(String[] args) {
       Random ran=new Random();
       int M=5;
       int N=5;
   
   int numeros[][]=new int [M][N];
  
   
        for (int i = 0; i <numeros.length; i++)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                 numeros[i][j]=ran.nextInt(100);
                     
                 
                    
                    
                
              
            }
        }
        int numeromenor=numeros[0][0];
        int fila=0;
   int columna=0;
         System.out.println("\nnumeros de la matriz ");
          for (int i= 0; i<numeros.length ; i++)
        {
            System.out.println("");
            for (int j= 0; j < numeros[i].length; j++)
                
            {  if ( numeros[i][j]<numeromenor)
                {
                    numeromenor=numeros[i][j];
                    fila=i;
                     columna=j;
                }
                
                
                System.out.print(numeros[i][j]+" ");
               
            }
        
        
          
        
        
    }
        System.out.println("\nel numero menor es"+numeromenor);     
        System.out.println("\n -la fila del numero menor es "+fila+"\nla column del numero menor es "+columna);
    }
    }
