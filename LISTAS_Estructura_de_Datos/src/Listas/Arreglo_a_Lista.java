
package Listas;

//importacion de bibliotecas
import java.util.Arrays;
import java.util.List;


public class Arreglo_a_Lista {

    
    public static void main(String[] args) {
        
        
    //declaracion del arreglo con datos listos
  String nombres []={"diego","fernando","muñoz"  };
  //declaracion y metodo para pasar los datos del arreglo a la lista   
  List<String>nombre=Arrays.asList(nombres);
   
  //impresion de la lista 
            System.out.println(""+nombre);

  
  
}}