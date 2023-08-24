
package ejercicios_foreach;

import javax.swing.JOptionPane;


public class tercero {

    
    public static void main(String[] args) {
       //dandole a las letras 
       /* char letras[]={'z','k','l','a','m','b','o'};
        for(char aux:letras)
 {
     if((aux=='a')||(aux=='e')||(aux=='i')||(aux=='o')||(aux=='u'))

    {
        System.out.println("hay una vocal ");
        break;
    }
    else 
    {
      System.out.println(""+aux);
       
    }
  
}*/
       // asignando las letras  por teclado con ventanas emergentes
       
       
       char letras []=new char [7];
       for (int i =0; i<letras.length;i++)
       {
           letras[i]=JOptionPane.showInputDialog("ingrese por favor la "+(i+1)+"letra").charAt(0);
       }
       
        for(char aux:letras)
 {
     if((aux=='a')||(aux=='e')||(aux=='i')||(aux=='o')||(aux=='u'))

    {
       JOptionPane.showMessageDialog(null,"hay una vocal ");
        break;
    }
    else 
    {
      JOptionPane.showMessageDialog(null,""+aux);
       
    }
  
}





        
}
} 
        
        
        
        
    
    

