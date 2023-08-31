
package EJERCICIOS;
import javax.swing.JOptionPane;
public class Numeros {

   
    public static void main(String[] args) {
   int dec=Integer.parseInt(JOptionPane.showInputDialog("cuantos numeros quiere ingresar"));
          int num[]= new int [dec];
        for (int i = 0; i < num.length; i++)
        {
          num[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+(i+1)));
        }
      
        for (int i = 0; i < num.length-1; i++)
            //este for es para recorre el tamaño del arreglo
        {
            for (int j = 0; j < num.length-1; j++)
                // este for es para que los que vaya acomodande 
                
            {
                if(num[j+1]>num[j])
                    //si colocamos el simbolo(<) es para acomodarlos decendentes
                    //si colocamos el simbolo (>) es para acomodarlos acendentes
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println("arreglo ordenado: ");
        for (int n:num )
        {
            System.out.println(" "+n);
            
        }
    }
    
}

    
    

