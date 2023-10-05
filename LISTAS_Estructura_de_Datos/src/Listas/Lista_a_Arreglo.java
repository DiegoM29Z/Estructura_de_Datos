
package Listas;

import java.util.ArrayList;
import java.util.List;


public class Lista_a_Arreglo {

   
    public static void main(String[] args) {
//1).declaracion de lista
        List<String>pais=new ArrayList<>();

//2).llenado de lista
          pais.add("colombia");
          pais.add("peru");
          pais.add("mexico");
          pais.add("brazil");
//3).sacar el tamaño de la lista para implementarlo en el tamaño del arreglo
        int tam=   pais.size();
//4).declaracion del arreglo
       String arreglo[]=new String[tam];

//5).metodo para pasar la lista a arreglo
pais.toArray(arreglo);

//6).impresion del arreglo atraves de un forEach
        for (String string : arreglo)
        {
            System.out.println("arreglo "
                    + " "+string);
        }
        
        
        
    }
    
}
