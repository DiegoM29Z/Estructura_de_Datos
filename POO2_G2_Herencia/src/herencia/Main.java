
package herencia;
//en la clase main lo unico que se hace es darle los valores al constructor y crear un objeto para llamar el mer¿todo de impresion. 
import javax.swing.JOptionPane;
public class Main {
    
    
    public static void main(String[] args) {
       String materia=JOptionPane.showInputDialog("ingrese la materia del docente");
       int grado=Integer.parseInt(JOptionPane.showInputDialog("ingrese el grado del docente"));
        
        Estudiante obj =new Estudiante(71222015, 5.0f, "Diego", "Muñoz", 18);
Docente obj1=new Docente(materia, grado, "gerardo", "ortega", 25);

obj.mostrar();
obj1.mostrarD();
    }
    
}
