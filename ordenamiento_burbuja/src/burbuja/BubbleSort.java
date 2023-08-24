
package burbuja;

import javax.swing.JOptionPane;

public class BubbleSort {

    public static void main(String[] args) {
       int dec=Integer.parseInt(JOptionPane.showInputDialog("cuantos datos quiere agregar"));
          int num[]= new int [dec];
        for (int i = 0; i < num.length; i++)
        {
          num[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el dato"+(i+1)));
        }
      
        for (int i = 0; i < num.length-1; i++)
        {
            for (int j = 0; j < num.length-1; j++)
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
