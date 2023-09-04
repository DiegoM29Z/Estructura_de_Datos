
package BIDIMENSIONALES;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class tercero {

    public static void main(String[] args) {
        int num[][]=new int [6][6];
        JOptionPane.showMessageDialog(null, "VALORES EN LA MATRIZ 6x6");
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                num[i][j]=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LOS NUMEROS DE LA FILA "+(i+1)+"\n INGRESE LOS NUMEROS DE LA COLUMNA "+(j+1)));
                
            }
        }
        JOptionPane.showMessageDialog(null, "MATRRIZ INGRESADA");
            
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(num[i][j]+" ");
                    
                }
                
                System.out.println(); 
                
            }
            int sumacol[]=new int[6];
            JOptionPane.showMessageDialog(null, "LA SUMA DE LAS COLUMNAS");
            for (int j = 0; j < sumacol.length; j++) {
            for (int i = 0; i < sumacol.length; i++) {
                sumacol[j] += num[i][j];
        }
            
                System.out.println("COLUMNA "+(j+1)+": "+sumacol[j]); 
            }       
        
        
    }
    
}
    
