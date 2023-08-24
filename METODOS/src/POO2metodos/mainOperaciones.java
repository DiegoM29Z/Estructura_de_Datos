
package POO2metodos;
import javax.swing.JOptionPane;

public class mainOperaciones {

    
    public static void main(String[] args) {
        operaciones op = new operaciones();
          
        int n1;
        int n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero "));
        
        int dec=Integer.parseInt(JOptionPane.showInputDialog(" que operacion desea realizar"+"\n1 suma"+"\n2 resta"+"\n3 multiplicacion"+"\n4 division"));
      
        switch (dec)
        {
            case 1:
                op.suma(n1, n2);
                break;
                case 2:
                op.resta(n1, n2);
                break;
                case 3:
                op.multiplicacion(n1, n2);
                break;
                case 4:
                op.division(n1, n2);
                break;
            
            default:
                throw new AssertionError();
        }
        
        
       
       
    }
    
}
