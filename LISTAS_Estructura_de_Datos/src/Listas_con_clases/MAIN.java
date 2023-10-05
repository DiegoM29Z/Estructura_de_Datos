
package Listas_con_clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MAIN {

   
    public static void main(String[] args) {
        String nombre,apellido;
        int edad,ID;
         
       
        
        
        
        List<persona>datos=new ArrayList<>();
       
        int tam=Integer.parseInt(JOptionPane.showInputDialog("cuantos datos desea ingresar"));
   

        for (int i = 0; i < tam; i++)
        {
             persona ob=new persona();
         nombre =JOptionPane.showInputDialog("ingrese el nombre");
        apellido=JOptionPane.showInputDialog("ingrese el apellido");
        edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        ID=Integer.parseInt(JOptionPane.showInputDialog("ingrese la identificacion"));

  
        ob.setNombre(nombre);
        ob.setApellido(apellido);
        ob.setEdad(edad);
        ob.setID(ID);
        
        datos.add(ob);
        }
      
        for (persona dato : datos)
        {
            System.out.println(""+dato.getNombre());
            System.out.println(""+dato.getApellido());
            System.out.println(""+dato.getEdad());
            System.out.println(""+dato.getID());
        }
       
        
        
        
           
      
        }
      
    }
    

