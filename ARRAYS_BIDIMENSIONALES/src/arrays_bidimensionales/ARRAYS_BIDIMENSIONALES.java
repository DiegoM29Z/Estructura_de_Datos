
package arrays_bidimensionales;

import javax.swing.JOptionPane;


public class ARRAYS_BIDIMENSIONALES {

    
    public static void main(String[] args) {
        int notas [] [] =new int [2] [3];
        
         
        for (int ren= 0; ren<notas.length ; ren++)
        {
            for (int col = 0; col < notas[ren].length; col++)
                
            {
                
                
     notas[ren][col]=Integer.parseInt(JOptionPane.showInputDialog("ingresa la nota del estudiante "+(col+1)));
                  
                 
            
            }
            
        }
        //por foreach(acabar para imprimirlos en orden
        /*        for (int ren []:notas)
            
        {                System.out.println(" ");

            for (int nota:ren)
                
            {
                System.out.println(nota+"");
            }
            
        }*/
      for (int ren= 0; ren<notas.length ; ren++)
        {
            System.out.println("");
            for (int col = 0; col < notas[ren].length; col++)
                
            {
                System.out.print(notas[ren][col]+" ");
        }
    }
    
    }
}
