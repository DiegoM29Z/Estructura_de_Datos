
package poo2_g2_api;

import javax.swing.JOptionPane;


public class POO2_G2_API {

  
    public static void main(String[] args) {
        double num1=Double.parseDouble(JOptionPane.showInputDialog("digite  un numero"));
         double num2=Double.parseDouble(JOptionPane.showInputDialog("digite  un numero"));
         
         System.out.println("el numero mayor es:"+Math.max(num1, num2)+"y el numero minimo es "+Math.min(num1, num2));

        
 

    }
    
}
