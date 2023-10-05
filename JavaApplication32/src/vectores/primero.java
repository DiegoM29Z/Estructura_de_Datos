
package vectores;

import java.util.Scanner;
public class primero {

 
    public static void main(String[] args) {
      



  
        Scanner sc = new Scanner(System.in);
        int numAlmacenes = 10;
        int[] ventas = new int[numAlmacenes];
        int totalVentas = 0;

        // Leer las ventas mensuales de los almacenes
        for (int i = 0; i < numAlmacenes; i++) {
            System.out.print("Ingrese las ventas del almacén " + (i + 1) + ": ");
            ventas[i] = sc.nextInt();
            totalVentas += ventas[i];
        }

        // Calcular la media de las ventas
        double mediaVentas = (double) totalVentas / numAlmacenes;

        // Mostrar almacenes con ventas superiores a la media
        System.out.println("Almacenes con ventas superiores a la media:");
        for (int i = 0; i < numAlmacenes; i++) {
            if (ventas[i] > mediaVentas) {
                System.out.println("Almacén " + (i + 1) + ": " + ventas[i]);
            }
        }
    }
}

   
/*
Importación de la clase Scanner:

java
Copy code
import java.util.Scanner;
Importamos la clase Scanner para poder leer la entrada del usuario desde la consola.

Declaración de la clase VentasAlmacenes:

java
Copy code
public class VentasAlmacenes {
Declaramos una clase llamada VentasAlmacenes.

Método main:

java
Copy code
public static void main(String[] args) {
Definimos el método main, que es el punto de entrada de la aplicación Java.

Creación de un objeto Scanner:

java
Copy code
Scanner sc = new Scanner(System.in);
Creamos un objeto Scanner llamado sc para leer la entrada del usuario desde la consola.

Declaración de variables:

java
Copy code
int numAlmacenes = 10;
int[] ventas = new int[numAlmacenes];
int totalVentas = 0;
Declaramos las variables necesarias:

numAlmacenes: Representa el número de almacenes, que en este caso es 10.
ventas: Es un arreglo de enteros que almacenará las ventas de cada almacén.
totalVentas: Es una variable que llevará un seguimiento del total de ventas.
Leer las ventas mensuales de los almacenes:

java
Copy code
for (int i = 0; i < numAlmacenes; i++) {
    System.out.print("Ingrese las ventas del almacén " + (i + 1) + ": ");
    ventas[i] = sc.nextInt();
    totalVentas += ventas[i];
}
Utilizamos un bucle for para pedir al usuario que ingrese las ventas de cada almacén. Las ventas se almacenan en el arreglo ventas, y el total de ventas se actualiza en totalVentas.

Calcular la media de las ventas:

java
Copy code
double mediaVentas = (double) totalVentas / numAlmacenes;
Calculamos la media de las ventas dividiendo el totalVentas entre el número de almacenes (numAlmacenes). La conversión a double se realiza para obtener un resultado decimal.

Mostrar almacenes con ventas superiores a la media:

java
Copy code
System.out.println("Almacenes con ventas superiores a la media:");
for (int i = 0; i < numAlmacenes; i++) {
    if (ventas[i] > mediaVentas) {
        System.out.println("Almacén " + (i + 1) + ": " + ventas[i]);
    }
}
Utilizamos otro bucle for para recorrer el arreglo ventas y verificar si las ventas de cada almacén son mayores que la media. Si lo son, mostramos el nombre del almacén (1 al 10) y sus ventas.

En resumen, este programa permite al usuario ingresar las ventas mensuales de diez almacenes, calcula la media de las ventas y muestra una lista de los almacenes cuyas ventas son superiores a la media. Esto se logra mediante la lectura de datos, cálculos y la comparación de cada venta con la media calculada.
*/