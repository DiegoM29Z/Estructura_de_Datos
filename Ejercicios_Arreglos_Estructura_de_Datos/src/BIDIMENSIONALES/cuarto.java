
package BIDIMENSIONALES;

import javax.swing.JOptionPane;


public class cuarto {

   
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
    
    

