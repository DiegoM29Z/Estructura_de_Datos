
package Suma_Matricez;

import javax.swing.JOptionPane;


public class matrices {

   
    public static void main(String[] args) {
    /*  int matriz [][]={{1,1,1},{1,1,1},{1,1,1}};
      int matriz2 [][]={{1,1,1},{1,1,1},{1,1,1}};
      */
    int n1 [][]=new int[3][3];
    int n2[][]=new int[3][3];
    int n3[][]=new int[3][3];
    
        for (int i = 0; i < n1.length; i++)
        {
            for (int j = 0; j < n1[i].length; j++)
            {
                n1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese los numeros del primer vector"));
                
            }
            for (int a= 0; a < n2[i].length; a++)
            {
                n2[i][a]=Integer.parseInt(JOptionPane.showInputDialog("ingrese los numeros del segundo vector "));
            }
            for (int b = 0; b <n3[i].length; b++)
            {
              
               n3[i][b]=n1[i][b]+n2[i][b];
            }
        
        }
        
        for (int i= 0; i<n1.length ; i++)
        {
            System.out.println("");
            for (int j= 0; j < n1[1].length; j++)
                
            {
              
                System.out.print(n1[i][j]+" ");
            
           }}
            
               for (int i= 0; i<n2.length ; i++)
        {
            System.out.println("");
            
            for (int j= 0; j < n2[i].length; j++)
                
            {
               
                System.out.print(n2[i][j]+" ");
            
           }}
            
               for (int i= 0; i<n3.length ; i++)
        {
            System.out.println("");
            for (int j= 0; j < n3[i].length; j++)
                
            {
                System.out.print(n3[i][j]+" ");
            
           }
            
            
            
    }
 
    
    
    
    
    
    
//     System.out.println("la suma"+n3[i][b]);
     /*   for (int c = 0; c < n3[i].length; c++)
            {
                System.out.println("la suma de las 2 matrices es"+n3[i][c]);
            }*/
    
    }
    
}
