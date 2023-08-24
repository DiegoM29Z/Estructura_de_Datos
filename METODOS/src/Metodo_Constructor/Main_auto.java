
package Metodo_Constructor;
import javax.swing.JOptionPane;

public class Main_auto {

  
    public static void main(String[] args) {
        String Marca=JOptionPane.showInputDialog("ingrese la marca auto");
        String Color=JOptionPane.showInputDialog("ingrese el color auto");
        int Modelo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el modelo auto"));
        int Velocidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la velocidad  auto"));
        
        
       Auto auto1=new Auto(Marca, Color, Modelo, Velocidad);
       auto1.mostrarDatos();
    }
    
}
