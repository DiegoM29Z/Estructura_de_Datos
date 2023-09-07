
package BIDIMENSIONALES;

import javax.swing.JOptionPane;


public class primero {

    
    public static void main(String[] args) {
  
        int numeroMayor=0;
        int iy=0;
        
      
        int produccion[][]=new int [20][7];
        int sumaplantas[]=new int [2];
     
        for (int i = 0; i <produccion.length; i++)
        {
            for (int j = 0; j < produccion[i].length; j++)
            {
                produccion [i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la produccion de la planta "+(i+1)+" :Dia "+(j+1)));
         
                 sumaplantas[i]+=produccion[i][j];
                 if (sumaplantas[i]>numeroMayor)
                {
                    numeroMayor=sumaplantas[i];
                  
                }}
             if (numeroMayor==sumaplantas[i])
                
            {
                  iy=i;
            }
          
        }
        System.out.println("\tPLANTA"+"\t"+"\t PRODUCCION");
        for (int i = 0; i < sumaplantas.length; i++)
        {
               System.out.println("\tla planta "+(i+1)+" \t produccion semanal de: "+sumaplantas[i]);
              
        }
        
        System.out.println("\n\tLa planta: "+(iy+1)+" es la que mas produce a la semana y su produccion es de "+numeroMayor);
   
        
      
    
       

   
    
    
    
    
    
    
    }
    
}
