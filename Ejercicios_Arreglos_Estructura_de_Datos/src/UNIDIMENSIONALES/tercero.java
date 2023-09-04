/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UNIDIMENSIONALES;

import java.util.Scanner;


public class tercero {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[5]; //creacion del arreglo
        for (int i = 0; i < num.length; i++) { //pidiendo los datos a comparar (en este caso 30 datos)
            System.out.println("digite numero "+(i+1));
                num[i]= sc.nextInt();
            
        }
          // Encontrar el número mayor y el número menor
        int numeroMayor = num[0];
        int numeroMenor = num[0];
        int repeticionesMayor = 1;
        int repeticionesMenor = 1;

        for (int i = 1; i < num.length; i++) {
            if (num[i] > numeroMayor) {
                numeroMayor = num[i];
                
            } else if (num[i] == numeroMayor) {
                repeticionesMayor++;
            }

            if (num[i] < numeroMenor) {
                numeroMenor = num[i];
                
            } else if (num[i] == numeroMenor) {
                repeticionesMenor++;
            }
        }

        // Imprimir el número mayor, el número menor y sus repeticiones
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        System.out.println("Se repite " + repeticionesMayor + " veces el numero mayor.");
        System.out.println("Se repite " + repeticionesMenor + " veces el numero menor.");
    }
}
    
    

