/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BIDIMENSIONALES;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class quinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        
        System.out.println("VALOR DE LA MATRIZ 5x4");
        int matriz[][]=new int [5][4];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
               matriz[i][j]=sc.nextInt();
           
            }
            
        }
        
        
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j]+" ");
                      
                }
                        
                System.out.println();  
                
            }
           int Nula = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == 0) {
                    Nula = 1;
                    
                }
            }
           
        }
        
        // Mostrar el resultado
        if (Nula>=1) {
            System.out.println("La matriz es nula");
        } else {
            System.out.println("La matriz no es nula");
        }
        
       
    }
}
  
