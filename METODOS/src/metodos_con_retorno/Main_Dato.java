
package metodos_con_retorno;

import javax.swing.JOptionPane;

public class Main_Dato {

   
    public static void main(String[] args) {
        
      
       int fn []=new int[3];
       
       
      JOptionPane.showMessageDialog(null, "por favor ingrese sus datos personales");
      String nombre1=JOptionPane.showInputDialog("ingrese su primer nombre ");
      String nombre2=JOptionPane.showInputDialog("ingrese su segundo nombre ");
      String apd1=JOptionPane.showInputDialog("ingrese su primer apellido ");
      String apd2=JOptionPane.showInputDialog("ingrese su segundo apellido apellido ");
       int id=Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero de identifiacion"));
        for (int i = 0; i < 3; i++)
        {
            JOptionPane.showMessageDialog(null,"ingrese su fecha de nacimiento ");
             fn[i]=Integer.parseInt(JOptionPane.showInputDialog(" "));
        }
       
        int  dr=Integer.parseInt(JOptionPane.showInputDialog("ingrese su direccion"));
        Double  cl =Double.valueOf(JOptionPane.showInputDialog("ingrese su numero de telefono"));
      
      
        
        
        Dato dato1=new Dato();
       
       
      String NA;
      NA=dato1.nombres_apellidos(nombre1, nombre2, apd1, apd2);
      JOptionPane.showMessageDialog(null, NA);
      
      int CDA;
       CDA=dato1.cedula(id);
       JOptionPane.showMessageDialog(null, CDA);
       
       int DRN;
        DRN=dato1.direccion(dr);
         JOptionPane.showMessageDialog(null, DRN);
         
         double TL;
        TL=dato1.telefono(cl);
        JOptionPane.showMessageDialog(null, TL);
       
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      String Saludo;
       Saludo=dato1.saludar(" diego");
        System.out.println(Saludo);
    }
    
}
