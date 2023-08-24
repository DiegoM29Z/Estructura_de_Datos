 
package ADMIN_CALIFICACIONES;

import javax.swing.JOptionPane;
public class OperacionesMain {

    
    public static void main(String[] args) {
        
   /*lo primero que se hace aqui es pedirle al profesor que ingrese el numero de estudiantes,esto para que se hace,
     pues se hace para saber si el programa se puede ejecutar o no ,porque segun las condiciones dice que para poder
     que le deje ingresar las notas tiene que tener minimo 4 estudiantes y maximo 10*/
   
   int numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de estudiantes (entre 4 y 10)"));
   
   /* estos son los array para que todo el programa funcione,se colocan afuera de los metodos y del java operaciones 
      porque tiene que ser universales para que todos los metodos los puedan usar */ 
       
        String nombres[] = new String[numEstudiantes];
        int id []= new int[numEstudiantes];
        double notas1[]= new double[numEstudiantes];
        double notas2[] = new double[numEstudiantes];
        double notas3[] = new double[numEstudiantes];
        double comnotas[]=new double[numEstudiantes];
       
        
   /* este es el IF es quien  decidira si el programa se puede ejcutar o no ,aqui es donde entra la decicion anterior 
      que ingreso el profesor,
        1) ...si la decicion ingresada es mayor a 4 o menor a 10 se comenzara a  ejecutar el programa,
        porque?,porque la decicion esta en el rango que indica la condicion ,
        2)...de lo contrario si el numero ingresado en la decicion
        es menor a 4 o mayor a 10 lo que hara el if es que va a imprimir el mensaje "el numero de estudiantes debe estar 
        entre 4 y 10.        
        */
        if (numEstudiantes < 4 || numEstudiantes > 10) {
            //2)...
          JOptionPane.showMessageDialog(null,"El numero de estudiantes debe estar entre 4 y 10.");
            
        }else{
             
          //1)...
          
      //aqui es donde se llaman todos los metodos que va a usar el programa para que funcione.
         
    /*el op es objeto que se crea en la principal para poder llamar a los metodos que estan en la otra clase,
     el objeto (op) se crea con el nombre de la clase donde se encuentran los metodos para que asi la principal sepa su ubicacion
           */
    Operaciones op=new Operaciones();
              
    /* aqui se esta hacendo el llamado del metodo llenadovectores,lo que realiza este metodo es es hacer el llenado
        de los datos de cada estudiante,este  vector esta defiido con algunos argumentos para que el metodo los reciba
        y funcione.*/  
    op.llenadovectores(numEstudiantes, nombres, id, notas1, notas2, notas3);
         
    /* aqui se esta hacendo el llamado del metodo promedio,lo que realiza este metodo es calcular el promedio de los estudiantes,
       esta defiido con algunos argumentos para que el metodo los reciba y funcione.*/
     op.promedio(numEstudiantes, notas1, notas2, notas3, comnotas,nombres);
              
    /* aqui se esta hacendo el llamado del metodo Nmax_Nmin,lo que realiza este metodo es calcular cual es el estudiante con
       la nota mas alta y cual es el estudiante con la nota minima, este  vector esta defiido con algunos argumentos para que el
       metodo los reciba y funcione*/ 
    op.Nmax_Nmin(comnotas, nombres);
              
    /*aqui se esta hacendo el llamado del metodo cons_estadisticas,lo que realiza este metodo es sacar las estadisticas o contar 
    y sacarme la cantidad de cuales son los estudiantes que tiene notas de 0.0 a 0.9--1.0 a 1.9--2.0 a 2.9--3.0 a 3.9--4.0 a
    4.9--5.0 ,este  vector esta defiido con algunos argumentos para que el metodo los reciba y funcione*/
    op.cons_estadisticas(numEstudiantes,comnotas);
              
    /*aqui se esta hacendo el llamado del metodo estadisticas,lo que realiza este metodo es solo imprimir las estadisticas que se 
    consultaron en el metodo cons_estadisticas.*/
    op.estadisticas();
    
    /*aqui se esta haciendo el llamado del metodo consulta ,lo que realiza este metodo es preguntarle al profesor si necesita 
    consultar el registro de algun estudiante */
    op.consulta( numEstudiantes, id, nombres, notas1, notas2, notas3,comnotas);
             
             
             
         }
    }
    
}
