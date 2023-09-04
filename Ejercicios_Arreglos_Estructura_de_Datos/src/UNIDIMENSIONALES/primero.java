
package UNIDIMENSIONALES;

import javax.swing.JOptionPane;

public class primero {

    
    public static void main(String[] args) {
        String[] nombres = new String[20];
String consulta[]={"Por pocicion","Por nombre"};
for (int i = 0; i < nombres.length; i++) {
   nombres[i] = JOptionPane.showInputDialog("Introduzca el nombre de la persona " + (i + 1) + ":");
   
}


int opcion=JOptionPane.showOptionDialog(null, "******* CONSULTAR TU NOMBRE ********", "Elige...", 0,JOptionPane.QUESTION_MESSAGE, null, consulta, "");
        if (opcion ==0)
        {
        int dec1=Integer.parseInt(JOptionPane.showInputDialog("que nombre desea consultar,(elija un numero desde el 1 hasta el 20"));

        for (int i = 0; i <nombres.length; i++)
        {
            if (dec1-1==i)
            {
                System.out.println(nombres[i]+" En la pocicion "+(i+1)+"\n");    
            }
        }    
        }
        
        else
        {
           String dec2=JOptionPane.showInputDialog("Que nombre desea consultar");

        for (int i = 0; i <nombres.length; i++)
        {
            if (dec2.equals(nombres[i]))
            {
                System.out.println(nombres[i]+" En la pocicion "+(i+1)+"\n");    
            }
        } 
        }







 System.out.println("LOS NOMBRES CON SUS POSICIONES\n");
for (int i = 0; i < nombres.length; i++) {
   
    System.out.println("El nombre de la persona en la posición " + (i + 1) + " es: " + nombres[i]);


   
    
    
    }
    
}}
