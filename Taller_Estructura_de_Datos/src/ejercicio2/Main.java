
package ejercicio2;

import ejercicio1.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
            List<Producto>inventario=new  ArrayList<>();

      
        String menu[] =
        {
            "1.Agregar un Nuevo producto\n",
            "2.Buscar Producto por Nombre",
            "3.Valor Total del Inventario",
            "Salir"
        };
     int opcion =0;
        do
        {
                                 opcion = JOptionPane.showOptionDialog(null, "******* Listas Java ********", "****************Aplicacion Gestionar Producto ****************", 0, JOptionPane.QUESTION_MESSAGE, null, menu, "");
                                switch (opcion)
            {
                case 0:
                   ;
                        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
                        Double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto "));
                        int cantidad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));
                       
         Producto ob=new Producto(nombre, precio, cantidad);
                   
                    inventario.add(ob);
                
                    
                  
                    break;
                    
                
                case 1:
                  
                   String elemento=JOptionPane.showInputDialog("\nNombre del producto");
                   boolean en=false;
                    for (Producto l: inventario)
                    {
                                                

                         if (l.getNombre().equalsIgnoreCase(elemento))
                    {
                        
                        System.out.println(" Producto Encontrado "+"\nNOMBRE: "+l.getNombre()+"\nPRECIO$: "+l.getPrecio()+"\nCANTIDAD: "+l.getCantidad());
                        en=true;
                    }
                       
                      
                    }
                    if (!en)
                    {
                        System.out.println("Producto no Encontrado");
                    }
                   
       
                
                    break;
                    
                
             
                case 2:
                              double total1 =0;
                   
                    for (Producto op : inventario)
                    {
                        total1+=op.getCantidad()*op.getPrecio();
                    
                    }
                    System.out.println("El valor total de todos los productos es: "+total1);
                    
                    break;
                   
              
                default:
                   break;            }

        }while (opcion!=3) ;           
            System.out.println("saliendo del programa...");
        
    
    
    
    
    }
    
}
