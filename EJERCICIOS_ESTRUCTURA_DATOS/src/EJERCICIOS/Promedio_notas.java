
package EJERCICIOS;

import javax.swing.JOptionPane;

public class Promedio_notas {

    
    public static void main(String[] args) {
        int notas[]=new int [3];
        double promedio=0;
        double profinal=0;
        for (int i = 0; i <notas.length; i++)
        {
                 notas[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota "+(i+1)));
             
               
                 
        } 
            promedio=(notas[0]*0.30+notas[1]*0.30+notas[2]*0.40);
            
            if (profinal>=3.0)
            {
                JOptionPane.showMessageDialog(null,"El promedio es "+promedio+" paso la nota" );
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El promedio es "+promedio+" no paso la nota ");
            }
    }
    
}
