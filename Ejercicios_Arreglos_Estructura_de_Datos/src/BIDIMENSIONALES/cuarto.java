/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BIDIMENSIONALES;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class cuarto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "VALOR DE LA MATRIZ 10x10");
    int numeros[][]=new int[10][10];
    
    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j){
                    numeros[i][j]=1;
               
                }else{
                    numeros[i][j]=0;
                }
            }  
        }
    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(numeros[i][j]+ " ");
                
            }
            System.out.println();
        }
    
    
    }
    
}
    
    

