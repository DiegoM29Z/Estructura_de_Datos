
package MainLibro;
import libro.Libro;


import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {

        List<Libro> lista_libro=new ArrayList<>();
     
        for (int i = 0; i <3; i++)
        {
              Libro ob=new Libro();
            int co=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo"));
            String nombre=JOptionPane.showInputDialog("ingrese el nombre");
            ob.setCodigo(co);
       ob.setNombre(nombre);
       lista_libro.add(ob);
        }
       
        //System.out.println("dato lista "+lista_libro.get(0).getCodigo()+"\n"+lista_libro.get(0).getNombre());
        System.out.println("el tamaño de la lista es de "+lista_libro.size());
        
        for (Libro l: lista_libro)
        {
            System.out.println("\nCODIGO: "+l.getCodigo());
            System.out.println("NOMBRE: "+l.getNombre());
        }
    
    }
    
}
