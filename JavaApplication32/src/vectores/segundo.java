
package vectores;
import java.util.Scanner;

public class segundo {

    
    public static void main(String[] args) {
    



    
        Scanner sc = new Scanner(System.in);
        int numMeses = 12;
        int numSucursales = 2;
        double[] ventasAnuales = new double[numSucursales];
        double[] ventasMensuales = new double[numMeses];

        // Leer las ventas mensuales de cada sucursal durante un año
        for (int i = 0; i < numSucursales; i++) {
            for (int j = 0; j < numMeses; j++) {
                System.out.print("Ingrese las ventas de la Sucursal " + (i + 1) + " en el mes " + (j + 1) + ": ");
                ventasAnuales[i] += ventasMensuales[j] = sc.nextDouble();
            }
        }

        // Calcular el promedio anual
        double promedioAnual = 0;
        for (double ventas : ventasAnuales) {
            promedioAnual += ventas;
        }
        promedioAnual /= numSucursales;

        // Calcular el promedio mensual
        double promedioMensual = 0;
        for (double ventas : ventasMensuales) {
            promedioMensual += ventas;
        }
        promedioMensual /= numMeses;

        // Mostrar ventas por sucursal menores que el promedio anual
        System.out.println("Ventas por sucursal menores que el promedio anual:");
        for (int i = 0; i < numSucursales; i++) {
            if (ventasAnuales[i] < promedioAnual) {
                System.out.println("Sucursal " + (i + 1) + ": " + ventasAnuales[i]);
            }
        }

        // Mostrar ventas mensuales mayores que el promedio mensual
        System.out.println("Ventas mensuales mayores que el promedio mensual:");
        for (int i = 0; i < numMeses; i++) {
            if (ventasMensuales[i] > promedioMensual) {
                System.out.println("Mes " + (i + 1) + ": " + ventasMensuales[i]);
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

Declaración de la clase VentasEmpresa:

java
Copy code
public class VentasEmpresa {
Declaramos una clase llamada VentasEmpresa.

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
int numMeses = 12;
int numSucursales = 2;
double[] ventasAnuales = new double[numSucursales];
double[] ventasMensuales = new double[numMeses];
Declaramos las variables necesarias:

numMeses: Representa el número de meses en un año, que es 12.
numSucursales: Representa el número de sucursales, que es 2.
ventasAnuales: Es un arreglo de tipo double que almacenará las ventas anuales de cada sucursal.
ventasMensuales: Es un arreglo de tipo double que almacenará las ventas mensuales.
Leer las ventas mensuales de cada sucursal durante un año:

java
Copy code
for (int i = 0; i < numSucursales; i++) {
    for (int j = 0; j < numMeses; j++) {
        System.out.print("Ingrese las ventas de la Sucursal " + (i + 1) + " en el mes " + (j + 1) + ": ");
        ventasAnuales[i] += ventasMensuales[j] = sc.nextDouble();
    }
}
Utilizamos dos bucles anidados for para pedir al usuario que ingrese las ventas de cada sucursal en cada mes. Las ventas se almacenan en los arreglos ventasAnuales y ventasMensuales. También, actualizamos las ventas anuales sumando las ventas mensuales correspondientes.

Calcular el promedio anual:

java
Copy code
double promedioAnual = 0;
for (double ventas : ventasAnuales) {
    promedioAnual += ventas;
}
promedioAnual /= numSucursales;
Calculamos el promedio anual sumando todas las ventas anuales y luego dividiendo por el número de sucursales para obtener el promedio.

Calcular el promedio mensual:

java
Copy code
double promedioMensual = 0;
for (double ventas : ventasMensuales) {
    promedioMensual += ventas;
}
promedioMensual /= numMeses;
Calculamos el promedio mensual sumando todas las ventas mensuales y luego dividiendo por el número de meses para obtener el promedio.

Mostrar ventas por sucursal menores que el promedio anual:

java
Copy code
System.out.println("Ventas por sucursal menores que el promedio anual:");
for (int i = 0; i < numSucursales; i++) {
    if (ventasAnuales[i] < promedioAnual) {
        System.out.println("Sucursal " + (i + 1) + ": " + ventasAnuales[i]);
    }
}
Utilizamos un bucle for para mostrar las ventas de cada sucursal que son menores que el promedio anual.

Mostrar ventas mensuales mayores que el promedio mensual:

java
Copy code
System.out.println("Ventas mensuales mayores que el promedio mensual:");
for (int i = 0; i < numMeses; i++) {
    if (ventasMensuales[i] > promedioMensual) {
        System.out.println("Mes " + (i + 1) + ": " + ventasMensuales[i]);
    }
}
Utilizamos otro bucle for para mostrar las ventas mensuales de cada mes que son mayores que el promedio mensual.

En resumen, este programa permite al usuario ingresar las ventas mensuales de dos sucursales durante un año, calcula los promedios anuales y mensuales de ventas y muestra las ventas por sucursal que son menores que el promedio anual y las ventas mensuales que son mayores que el promedio mensual. Esto se logra mediante la lectura de datos, cálculos y la comparación de ventas con los promedios.
*/
 