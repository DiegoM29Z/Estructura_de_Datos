
package ejercicios_foreach;

import javax.swing.JOptionPane;

public class primero {

   
    public static void main(String[] args) {
       //con los datos  ya fijos 

           /*String [] nombres={"juanna","david","juliana","pepe","ete sech"};
          for (String fer : nombres)
         {
             System.out.println(fer);
         }*/
     
       
        //pidiendole los datos string por teclado  
        
      String [] datos =new String [5];
        for (int i=0;i<datos.length;i++)
        {
            datos[i]=JOptionPane.showInputDialog("ingrese el"+(i+1)+"nombres");
        }
        
        for (String fer : datos)
         {
             JOptionPane.showMessageDialog(null,fer);
         }
   

}
}
