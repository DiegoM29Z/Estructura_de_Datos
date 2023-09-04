
package BIDIMENSIONALES;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class segundo {

   
    public static void main(String[] args) {
     
 Scanner scanner = new Scanner(System.in);

        int[][] produccion = new int[20][7];

        
        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion[i].length; j++) {
                System.out.print("Ingrese la producción de la planta " + (i + 1) + " en el día " + (j + 1) + ": ");
                produccion[i][j] = scanner.nextInt();
            }
        }

        
        int mayorProduccion = produccion[0][0];
        int diaMayorProduccion = 0;
        int plantaMayorProduccion = 0;

        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion[i].length; j++) {
                if (produccion[i][j] > mayorProduccion) {
                    mayorProduccion = produccion[i][j];
                    diaMayorProduccion = j;
                    plantaMayorProduccion = i;
                }
            }
        }

        // Imprimir los resultados
        System.out.println("La mayor producción fue de " + mayorProduccion + " plantas.");
        System.out.println("Se alcanzó en el día " + (diaMayorProduccion + 1) + ".");
        System.out.println("La planta que la produjo es la planta " + (plantaMayorProduccion + 1) + ".");
    
     
    }
}
    
    

