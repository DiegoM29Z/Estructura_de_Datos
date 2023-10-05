
package Ejercicios;

 import javax.swing.JOptionPane;
public class cuarto {

    public static void main(String[] args) {
        
      



    
        
         String cadena =JOptionPane.showInputDialog("Ingrese una cadena de texto: ");
         char[] caracteres = cadena.toCharArray();
          String cadenaAlReves = invertirCadena(cadena);

        
         System.out.println("La cadena al revés es: " + cadenaAlReves);
    }

    public static String invertirCadena(String cadena) {
        // Convierte la cadena en un arreglo de caracteres
        char[] caracteres = cadena.toCharArray();

        // Invierte el arreglo de caracteres
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        // Convierte el arreglo de caracteres de nuevo a cadena
        return new String(caracteres);
    }
}
        
/*
Importación de la clase Scanner:

java
Copy code
import java.util.Scanner;
Importamos la clase Scanner para poder leer la entrada del usuario desde la consola.

Declaración de la clase CadenaAlReves:

java
Copy code
public class CadenaAlReves {
Declaramos una clase llamada CadenaAlReves.

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

Solicitar entrada al usuario:

java
Copy code
System.out.print("Ingrese una cadena de texto: ");
String cadena = sc.nextLine();
Imprimimos un mensaje para solicitar al usuario que ingrese una cadena de texto y luego utilizamos el método nextLine() del objeto Scanner para leer la entrada del usuario y almacenarla en la variable cadena.

Llamada a invertirCadena:

java
Copy code
String cadenaAlReves = invertirCadena(cadena);
Llamamos al método invertirCadena con la cadena ingresada por el usuario como argumento. El resultado de la inversión se almacena en la variable cadenaAlReves.

Imprimir la cadena invertida:

java
Copy code
System.out.println("La cadena al revés es: " + cadenaAlReves);
Imprimimos la cadena invertida utilizando la variable cadenaAlReves.

Método invertirCadena:

java
Copy code
public static String invertirCadena(String cadena) {
Definimos el método invertirCadena, que toma una cadena como entrada y devuelve la cadena invertida.

Convertir la cadena en un arreglo de caracteres:

java
Copy code
char[] caracteres = cadena.toCharArray();
Convertimos la cadena de entrada en un arreglo de caracteres para poder manipular sus caracteres individualmente.

Invertir el arreglo de caracteres:

java
Copy code
for (int i = 0; i < caracteres.length / 2; i++) {
    char temp = caracteres[i];
    caracteres[i] = caracteres[caracteres.length - 1 - i];
    caracteres[caracteres.length - 1 - i] = temp;
}
Iteramos a través del arreglo de caracteres hasta la mitad y realizamos un intercambio de caracteres entre el inicio y el final del arreglo para invertir la cadena.

Convertir el arreglo de caracteres de nuevo en cadena:

java
Copy code
return new String(caracteres);
Convertimos el arreglo de caracteres invertido de nuevo en una cadena y la devolvemos como resultado.

En resumen, este programa permite al usuario ingresar una cadena de texto, la invierte y luego muestra la cadena invertida en la consola.
*/
       
     
    


        
    
    

