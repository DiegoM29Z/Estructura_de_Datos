/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Suma_Matricez;

import javax.swing.JOptionPane;


public class forma_corta {

   
    public static void main(String[] args) {
      int n1 [][]=new int[3][3];
    int n2[][]=new int[3][3];
    int n3[][]=new int[3][3];
    
        for (int i = 0; i < n1.length; i++)
        {
            for (int j = 0; j < n1[i].length; j++)
            {
                n1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese los numeros del primer vector en la pocicion: "+(j +1)));
                   n2[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese los numeros del segundo vector en la posicion: "+(j+1)));
                n3[i][j]=n1[i][j]+n2[i][j];
            }
           
        
        }
          System.out.println("\nnumeros de la matriz 1");
          for (int i= 0; i<n1.length ; i++)
        {
            System.out.println("");
            for (int j= 0; j < n1[1].length; j++)
                
            {
                System.out.print(n1[i][j]+" ");
            }}
            System.out.println("\nlos numeros de la matriz 2");
               for (int i= 0; i<n2.length ; i++)
        {
            System.out.println("");
            
            for (int j= 0; j < n2[i].length; j++)
                
            {
                System.out.print(n2[i][j]+" ");
            }}
            System.out.println("\nresultados de la suma de matrices");
               for (int i= 0; i<n3.length ; i++)
        {
            System.out.println("");
            for (int j= 0; j < n3[i].length; j++)
                
            {
                System.out.print(n3[i][j]+" ");
            }
            
            
            
    }
    
    
    
    }
    
}
