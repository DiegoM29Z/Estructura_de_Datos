
package TRIDIMENSIONALES;

import javax.swing.JOptionPane;


public class primero {

 
    public static void main(String[] args) {
        int[][][] compañia = new int[8][6][7];

       
        for (int x = 0; x < compañia.length; x++) {
            for (int y = 0; y < compañia[x].length; y++) {
                for (int z = 0; z <compañia[x][y].length; z++) {
                    compañia[x][y][z] = Integer.parseInt(JOptionPane.showInputDialog("ingrese la ventas de la  surcusal"+ (x+1)+"del departamento "+(y+1)+" de dia "+(z+1)));
                }
            }
        }

       
        for (int x = 0; x < compañia.length; x++) {
           System.out.println("\n--------------Sucursal " + (x + 1)+"--------------");
            for (int y = 0; y < compañia[x].length; y++) {
                System.out.println("\nel departamento "+(y+1)+"\t");
                for (int z = 0; z < compañia[x][y].length; z++) {
                    System.out.println("Dia "+(z+1 )+" : "+ compañia[x][y][z]);
                }
                
                
                
            }
               System.out.println("\n----------------------------------------");
        }
        
        
        
    }
    
}
