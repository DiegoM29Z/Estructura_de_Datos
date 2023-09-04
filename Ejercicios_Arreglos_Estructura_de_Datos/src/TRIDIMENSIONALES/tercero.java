
package TRIDIMENSIONALES;

import javax.swing.JOptionPane;


public class tercero {

    public static void main(String[] args) {
     int[][][] compañia = new int[8][6][7];

        for (int x = 0; x < compañia.length; x++) {
            for (int y = 0; y < compañia[x].length; y++) {
                for (int z = 0; z < compañia[x][y].length; z++) {
                    compañia[x][y][z] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del día " + (z + 1) + " del departamento " + (y + 1) + " de la sucursal " + (x + 1)));
                }
            }
        }

        for (int x = 0; x < compañia.length; x++) {
           System.out.println("\n--------------Sucursal " + (x + 1)+"--------------");
            int sucursalTotal = 0;
            int maxVenta = -1; 
            int departamentoMaxVenta = -1;

            for (int y = 0; y < compañia[x].length; y++) {
                System.out.println("\n*Departamento " + (y + 1));
                int departamentoTotal = 0;
                for (int z = 0; z < compañia[x][y].length; z++) {
                    System.out.println("-Día " + (z + 1) + ": " + compañia[x][y][z]);
                    departamentoTotal += compañia[x][y][z];
                }
                System.out.println("*Total de ventas del departamento " + (y + 1) +")"+ ": " + departamentoTotal+" ventas");
                
              
                if (departamentoTotal > maxVenta) {
                    maxVenta = departamentoTotal;
                    departamentoMaxVenta = y + 1;
                }
                
                sucursalTotal += departamentoTotal;
            }

            System.out.println("\n*Total de ventas de la sucursal " +"("+ (x + 1) +")"+ ": " + sucursalTotal+" ventas");
            System.out.println("\n*Departamento con mayor venta en la sucursal " +"("+ (x + 1) +")"+ ": \n-Es el departamento " + departamentoMaxVenta + " con un total de " + maxVenta+" ventas");
          
            System.out.println("\n----------------------------------------");
        }
          
    }
    
}
