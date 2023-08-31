
package taller_herencia;

import javax.swing.JOptionPane;
public class Main {

   
    public static void main(String[] args) {
      
        
        
        int dec=Integer.parseInt(JOptionPane.showInputDialog("\n que desea registrar"+"\n-1)Apartamentos"+"\n2)Local"));
        if (dec==1)
        {
          boolean  administracionA=Boolean.parseBoolean(JOptionPane.showInputDialog("Ingresa si pago "+"\n ingrese no si no pago"));
            int estratoA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato del apartamento")); 
            int  dimensionesA =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del apartamento")); 
              int NhabitacionesA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitaciones del apartamento")); 
              int  NbañoA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de baños del apartamento")); 
              String  ubicacionA=JOptionPane.showInputDialog("Ingrese la ubicacion del apartamento");
              Apartamento objApartamento=new Apartamento(administracionA, estratoA, dimensionesA, NhabitacionesA, NbañoA, ubicacionA);
              objApartamento.Datos_Apartamento();
        }
        else
        {
           String TipoL=JOptionPane.showInputDialog("Ingrese el tipo de local");
          String  ZonaL=JOptionPane.showInputDialog("ingrese la zona del local");
            int dimensionesL =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del local")); 
             int  NhabitacionesL=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitaciones del local")); 
              int  NbañoL=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de baños del apartamento")); 
               String ubicacionL=JOptionPane.showInputDialog("Ingrese la ubicacion del apartamento");
               Local objLocal=new Local(TipoL, ZonaL, dimensionesL, NhabitacionesL, NbañoL, ubicacionL);
               objLocal.Datos_Local();
               
        }
        
        
        
      
    
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
       
    }
    
}
