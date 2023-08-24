
package arreglitos;
import java.util.Scanner;
public class principal {
    public static void main(String[] args){
        int cant;
        double suma = 0, prom;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese la cantidad de elemntos");
        cant = s.nextInt();
        double num [] = new double[cant];
        
        for(int i = 0; i < cant; i++){
            System.out.println("elemento "+(i+1));
            num[i] = s.nextDouble();
            suma = suma + num[i]; 
    }
        for(int i = 0; i < cant; i++){
            System.out.println(""+num[i]);
        }
        prom = suma/cant;
          System.out.println("el promedio es "+prom);      
    }
}

