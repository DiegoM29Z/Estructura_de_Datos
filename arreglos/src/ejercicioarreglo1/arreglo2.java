
package ejercicioarreglo1;

import java.util.Scanner;


public class arreglo2 {

    
    public static void main(String[] args) {
       
        final int MAX=10;
        Scanner sc=new Scanner (System.in);
        int edades[]=new int [MAX];
        
        for (int i = 0; i <MAX; i++)
            
        {
            System.out.println("\n ingrese las edades");
            edades[i]=sc.nextInt();
        }
        System.out.println("\n imprimir edades");
        int suma=0;
        for (int sm : edades)
        {
            suma+=sm;
        }
        for (int edad: edades)
        {
            System.out.println(edad+" ");
            System.out.println( "la suma de las edades es"+suma);
        }
    }
    
}
