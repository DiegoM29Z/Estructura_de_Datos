
package POO2metodos;

import javax.swing.JOptionPane;
public class operaciones {
    
    //METODOS CON PARAMETROS
    
   // definir las variables
    int suma ,resta,multiplicacion,division;
    
    public void suma(int num1,int num2)
    {
        suma=num1+num2;
        JOptionPane.showMessageDialog(null,"la suma de los numeros es"+suma);
    }
     public void resta(int num1,int num2)
    {
        
        if (num1<num2)
        {
            
JOptionPane.showMessageDialog(null,"el primer numero debe ser mayor que el segundo ");            
        }
                else{
            resta=num1-num2;
            
        JOptionPane.showMessageDialog(null,"la resta de los numeros es"+resta);}
    }
      public void multiplicacion(int num1,int num2)
    {
        multiplicacion=num1*num2;
        JOptionPane.showMessageDialog(null,"la multiplicacion de los numeros es"+multiplicacion);
    }
       public void division(int num1,int num2)
    {
        if(num2<=0){
            JOptionPane.showMessageDialog(null, "la division no se puede realizar porque el denominador no tiene que ser igual a 0");
        }{
        {
        division=num1/num2;
        JOptionPane.showMessageDialog(null,"la division de los numeros es "+division);}
    }
    }}
