
package ejercicio;

import javax.swing.JOptionPane;
public class ejercicio2 {

  
    public static void main(String[] args) {
      int a[]=new int[3];
        int b[]=new int[3];  
        int c[]=new int [6];
        int j=0;
    for( int i=0;i<3;i++)
        {
           JOptionPane.showMessageDialog(null," digite el dato "+ (i+1));
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(args));
        }
      
      for(int i=0;i<3;i++)
        {
           JOptionPane.showMessageDialog(null," digite el dato "+ (i+1));
            b[i]=Integer.parseInt(JOptionPane.showInputDialog(args));
        }
       for (int i = 0; i < 3; i++) {
            
            c[j] = a [i]; //1*A
            j++;
            c[j] = b [i];
            j++;
        }
        System.out.println("\nEl tecer arreglo es ");
        for (int i = 0; i < 6; i++) {
            System.out.println(c[i] + " ");
        }
        
        System.out.println("");
        
       
    }
    
}
