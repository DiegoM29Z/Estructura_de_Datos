
package EJERCICIOS;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Nombres {

   
    public static void main(String[] args) {
        
        // este es para organizar nombres de forma alfabetica 
      String nombres []=new String [15];
   
        for (int i = 0; i < nombres.length; i++)
        {
            nombres[i]=JOptionPane.showInputDialog("ingrese el nombre numero "+(i+1));
        }
    // este metodo es el que se encargar de orgnizar los nombres en orden alfabetico del array nombres[](lo hace automatico)
    Arrays.sort(nombres);
    
    
        for (String nombre : nombres)
        {
            System.out.println(""+nombre);
        }
    
       // este es para ordenar numeros del menor al mayor 
       /* int nombres []=new int [3];
   
        for (int i = 0; i < nombres.length; i++)
        {
            nombres[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el nombre numero "+(i+1)));
        }
    
    Arrays.sort(nombres);
    
    
        for (int nombre : nombres)
            
        {
            System.out.println(nombre);
        }
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
