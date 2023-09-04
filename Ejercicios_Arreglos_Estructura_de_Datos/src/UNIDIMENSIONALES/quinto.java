
package UNIDIMENSIONALES;

import java.util.Scanner;


public class quinto {

    
    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
        int[] dato= new int [50];
        
        for (int i= 0; i < dato.length; i++) {
            System.out.println("digite los numeros "+(i+1));
            dato[i]= sc.nextInt();
            
        
        }
        
      
        for (int i = 0; i < dato.length-1; i++) {
            
             if (dato[i]<dato[i+1]){
                 int temp = dato[i];
                 dato[i]= dato[ i+1];
                 dato[i+1]=temp;
             }   
            }
        
         System.out.println("ORDENADO DE MAYOR A MENOR");
            for (int num : dato) {
                System.out.println(""+num);
        
    
        }
           
            }
    }
    

