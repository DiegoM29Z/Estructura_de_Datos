
package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
       List<Persona>libreta=new  ArrayList<>();
          
        String menu[] =
        {
            "1.Agregar Nueva Persona\n",
            "2.Mostrar Lista de Personas",
            "Buscar Persona por nombre",
            "promedio de las edades",
            "Salir"
        };
         
        int opcion =0;
        do
        {
                                 opcion = JOptionPane.showOptionDialog(null, "******* Listas Java ********", "****************Aplicacion Gestionar Persona ****************", 0, JOptionPane.QUESTION_MESSAGE, null, menu, "");
                                switch (opcion)
            {
                case 0:
                   ;
                        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del conacto");
                        int edad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                        String genero =JOptionPane.showInputDialog("Ingrese su genero");
         Persona ob=new Persona();             
                      ob.setNombre(nombre);
                      ob.setEdad(edad);
                      ob.setGenero(genero);
                      libreta.add(ob);
                    
                  
                    break;
                    
                
                case 1:
                    boolean dec=libreta.isEmpty();
                    if (dec==true)
                    {
                            
                        System.out.println("La lista esta vacia");
                    }
                    else{
                      for (Persona lbt :libreta)
                    {
                        System.out.println("\nEl nombre es: "+lbt.getNombre());
                        System.out.println("La edad es: "+lbt.getEdad());
                        System.out.println("El genero es: "+lbt.getGenero());
                        
                    }}
                  
                    break;
                    
                
                case 2:
                      
                   String elemento=JOptionPane.showInputDialog("Nombre de la persona ");
                   boolean en=false;
                    for (Persona l: libreta)
                    {
                                                

                         if (l.getNombre().equalsIgnoreCase(elemento))
                    {
                        
                        System.out.println(" Contacto Encontrado: "+"El nombre: "+l.getNombre()+" La edad: "+l.getEdad()+" El genero "+l.getGenero());
                        en=true;
                    }
                       
                      
                    }
                    if (!en)
                    {
                        System.out.println("no encontrado");
                    }
                   
       
                
                    
                    break;
                case 3:
                    int suma=0;
                    int promedio=0;
                    for (Persona op : libreta)
                    {
                     suma+=op.getEdad();
                     promedio=suma/libreta.size();
                    }
                    System.out.println("El promedio de los estudiantes es "+promedio);
                    
                    break;
                   
              
                default:
                   break;            }

        }while (opcion<3) ;           
            System.out.println("saliendo del programa...");
        
    }
    
}
