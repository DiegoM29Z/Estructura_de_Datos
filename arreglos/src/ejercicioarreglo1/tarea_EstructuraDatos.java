
package ejercicioarreglo1;
import javax.swing.JOptionPane;
public class tarea_EstructuraDatos {

    public static void main(String[] args) {
        int MAX=10;
        double sumaproducto=0;
        double A[]=new double [MAX];
        double B[]=new double [MAX];
        double C[]=new double [MAX];
        
        for (int i = 0; i < MAX; i++)
        {
           A[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero"+(i+1)+"del vector A"));
           B[i]=Double.parseDouble(JOptionPane.showInputDialog ("ingrese el numero"+(i+1)+"del vector B"));
              C[i]=A[i]*B[i];
              sumaproducto+=C[i];
        }
        for (double df:C)
        {
       
            System.out.println("producto de los vectores A y B es:"+df);
        }
        System.out.println( "la suma de los productos de los vectores A y B es:"+sumaproducto);
    }
    
}
