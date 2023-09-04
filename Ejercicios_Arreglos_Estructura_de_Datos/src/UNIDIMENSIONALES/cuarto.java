/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UNIDIMENSIONALES;

import java.util.Scanner;

public class cuarto {

  
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     String[] nom= new String [15];
        
        for (int i= 0; i < nom.length; i++) {
            System.out.println("digite una letra "+(i+1));
            nom[i]= sc.nextLine();
            
        
        }
        
        for (int i = 0; i < nom.length - 1; i++) {
            for (int j = 0; j < nom.length - i - 1; j++) {
                if (nom[j].compareTo(nom[j + 1]) < 0) {  
                                          
                    
                    String temp = nom[j];
                    nom[j] = nom[j + 1];
                    nom[j + 1] = temp;
                }
            }
        }

       
        
         System.out.println("ORDENADO DE FORMA DESCENDENTE");
            for (String n : nom) {
                System.out.println(""+n);
        
        
        }
           
   
    }
    
}
