
package UNIDIMENSIONALES;

import java.util.Scanner;


public class segundo {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        int [] num = new int[5]; 
       
        for (int i = 0; i < num.length; i++) { 
            System.out.println("digite numero "+(i+1));
                num[i]= sc.nextInt();
          
       
        }
      
        int contador=0;
        int contador2=0;
        int contador3=0;
        for (int i = 0; i < num.length; i++) { 
            if (num[i]>0) { 
                contador++;
                
            }    
       
      
            if (num[i]<0) { 
                contador2++;
               
            }
            
            if (num[i]==0) {
                contador3++;
                
            }
            
            }
         System.out.println("numeros mayores a 0: "+contador);
        System.out.println("numeros menores a 0: "+contador2);
        System.out.println("numeros iguales a 0: "+contador3);
    }
    
}
        
        
        
    
    

