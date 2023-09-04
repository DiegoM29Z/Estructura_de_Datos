
package TRIDIMENSIONALES;

import javax.swing.JOptionPane;


public class segundo {

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
            for (int y = 0; y < compañia[x].length; y++) {
                System.out.println("\nDepartamento " + (y + 1));
                int departamentoTotal = 0;
                for (int z = 0; z < compañia[x][y].length; z++) {
                    System.out.println("Dia " + (z + 1) + ": " + compañia[x][y][z]+" ventas");
                    departamentoTotal += compañia[x][y][z];
                }
                System.out.println("Total de ventas del departamento"+"("+(y+1) +")"+": "+ departamentoTotal+"ventas");
            }

          System.out.println("\n----------------------------------------");
           
        }
        System.out.println("\n\n________________VENTAS POR DIA________________");
        for (int x = 0; x < compañia.length; x++)
        {
            System.out.println("\n--------------Sucursal " + (x + 1)+"--------------");
             System.out.println("\nTotal de ventas por dia para la sucursal: " +"("+ (x + 1)+")");
            for (int z = 0; z < compañia[x][0].length; z++) {
                int diatotal = 0;
                for (int y = 0; y < compañia[x].length; y++) {
                    diatotal += compañia[x][y][z];
                }
                System.out.println("Dia " + (z + 1) + ": " + diatotal+" ventas");
            }
              System.out.println("\n----------------------------------------");
        }
        System.out.println("\n___________________________________________");
    }
}
