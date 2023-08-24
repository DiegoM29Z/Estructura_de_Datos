
package ejercicio;

import javax.swing.JOptionPane;

public class pares_impares {

    
    public static void main(String[] args) {
      int tam=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del array"));
        int numero[]=new int[tam];
        int p=0,ip=0;
       
      for(int i=0;i<tam;i++)
      {
          JOptionPane.showMessageDialog(null," digite el dato "+ (i+1));
          numero[i]=Integer.parseInt(JOptionPane.showInputDialog(""));
          if (numero[i]%2==0)
          {
              p++;
          }
          else
          {
              ip++;
          }
       }    
             System.out.println("la longitud de los pares es"+p);
             System.out.println("la longitud de los impares es"+ip);
                    
        
     
          
}
}
    

