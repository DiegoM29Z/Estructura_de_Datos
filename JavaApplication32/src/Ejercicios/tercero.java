/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;


public class tercero {

   
  

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4,5, 6}
        };

        mostrarMatrizEnEspiral(matriz);
    }

    public static void mostrarMatrizEnEspiral(int[][] matriz) {
        int filaInicial = 0;
        int filaFinal = matriz.length - 1;
        int columnaInicial = 0;
        int columnaFinal = matriz[0].length - 1;

        while (filaInicial <= filaFinal && columnaInicial <= columnaFinal) {
            // Imprimir fila superior
            for (int i = columnaInicial; i <= columnaFinal; i++) {
                System.out.print(matriz[filaInicial][i] + " ");
            }
            filaInicial++;

            // Imprimir columna derecha
            for (int i = filaInicial; i <= filaFinal; i++) {
                System.out.print(matriz[i][columnaFinal] + " ");
            }
            columnaFinal--;

            // Imprimir fila inferior
            if (filaInicial <= filaFinal) {
                for (int i = columnaFinal; i >= columnaInicial; i--) {
                    System.out.print(matriz[filaFinal][i] + " ");
                }
                filaFinal--;
            }

            // Imprimir columna izquierda
            if (columnaInicial <= columnaFinal) {
                for (int i = filaFinal; i >= filaInicial; i--) {
                    System.out.print(matriz[i][columnaInicial] + " ");
                }
                columnaInicial++;
            }
        }
    }
}
/*
Se define una matriz bidimensional matriz con dos filas y tres columnas:
java
Copy code
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6}
};
Esta matriz contiene números del 1 al 6, organizados en dos filas y tres columnas.

Se llama a la función mostrarMatrizEnEspiral(matriz); para mostrar la matriz en espiral.

La función mostrarMatrizEnEspiral toma la matriz como entrada y se define de la siguiente manera:

java
Copy code
public static void mostrarMatrizEnEspiral(int[][] matriz) {
Se inicializan cuatro variables para rastrear las coordenadas de la matriz: filaInicial, filaFinal, columnaInicial, y columnaFinal. Estas variables determinan los límites de las secciones de la matriz que se van a imprimir.
java
Copy code
int filaInicial = 0;
int filaFinal = matriz.length - 1;
int columnaInicial = 0;
int columnaFinal = matriz[0].length - 1;
filaInicial se inicia en 0, la primera fila.
filaFinal se establece en el número de filas menos 1, que es la última fila.
columnaInicial se inicia en 0, la primera columna.
columnaFinal se establece en el número de columnas menos 1, que es la última columna.
Se utiliza un bucle while para recorrer la matriz en espiral. El bucle continúa mientras filaInicial sea menor o igual a filaFinal y columnaInicial sea menor o igual a columnaFinal.

Sección de impresión de la fila superior:

java
Copy code
for (int i = columnaInicial; i <= columnaFinal; i++) {
    System.out.print(matriz[filaInicial][i] + " ");
}
filaInicial++;
Este bucle for imprime los elementos de la fila superior de izquierda a derecha.

Sección de impresión de la columna derecha:
java
Copy code
for (int i = filaInicial; i <= filaFinal; i++) {
    System.out.print(matriz[i][columnaFinal] + " ");
}
columnaFinal--;
Este bucle for imprime los elementos de la columna derecha de arriba hacia abajo.

Sección de impresión de la fila inferior (si es necesario):
java
Copy code
if (filaInicial <= filaFinal) {
    for (int i = columnaFinal; i >= columnaInicial; i--) {
        System.out.print(matriz[filaFinal][i] + " ");
    }
    filaFinal--;
}
Este bucle for imprime los elementos de la fila inferior de derecha a izquierda, pero solo si filaInicial es menor o igual a filaFinal.

Sección de impresión de la columna izquierda (si es necesario):
java
Copy code
if (columnaInicial <= columnaFinal) {
    for (int i = filaFinal; i >= filaInicial; i--) {
        System.out.print(matriz[i][columnaInicial] + " ");
    }
    columnaInicial++;
}
Este bucle for imprime los elementos de la columna izquierda de abajo hacia arriba, pero solo si columnaInicial es menor o igual a columnaFinal.

El bucle while continúa ejecutándose hasta que se hayan impreso todos los elementos de la matriz en espiral.
Este proceso se repite hasta que se hayan impreso todos los elementos de la matriz en el orden espiral deseado. El resultado es que se muestra la matriz en espiral en la consola.
*/   

    
    

