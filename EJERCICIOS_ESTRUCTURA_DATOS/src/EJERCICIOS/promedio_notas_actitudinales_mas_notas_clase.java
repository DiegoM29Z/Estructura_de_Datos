
package EJERCICIOS;

import javax.swing.JOptionPane;


public class promedio_notas_actitudinales_mas_notas_clase {

  
    public static void main(String[] args) {
       double actitudinal[]=new double[3];
       double dominio[]=new double [3];
       double promedioact,promediodominio,promedioFinal=0;
       
       
          

        JOptionPane.showMessageDialog(null, "DIGITE LAS NOTAS ACTITUDINALES");
     
        for (int i = 0; i < actitudinal.length ;i++)
        {
            actitudinal[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota "+(i+1)));
                    
                  
                   
                     }
        promedioact=(actitudinal[0]*0.05+actitudinal[1]*0.05+actitudinal[2]*0.1);
        System.out.println("promedio actitudinal "+promedioact);
         
      JOptionPane.showMessageDialog(null, "DIGITE LAS NOTAS DE DOMINIO");
    
        for (int i = 0; i < dominio.length; i++)
        {
            dominio[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota "+(i+1)));
        }
        promediodominio=(dominio[0]*0.3+dominio[1]*0.3+dominio[2]*0.4)*0.8;
        
        promedioFinal=promedioact+promediodominio;
        System.out.println("promdedio dominio "+promediodominio);
        System.out.println("el promedio final de su nota es "+promedioFinal);
        } 
        
            
        
       
    }
        
    
        
        
        
        
        
    
    

