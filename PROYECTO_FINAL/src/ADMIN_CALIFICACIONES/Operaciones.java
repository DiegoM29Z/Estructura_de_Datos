
package ADMIN_CALIFICACIONES;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class Operaciones {
    LocalTime horaactuaL= LocalTime.now();   
   LocalDate diaactual= LocalDate.now();
   
    //son las variables universales que se van a usar en los metodos 
  double promedio=0;
   double redondeo=0;
   double promedioAsignatura = 0;
    int indiceNotaMaxima = 0;
    int indiceNotaMinima = 0;
    
//contadores
       int a=0;
        int b =0;
        int c =0;
        int d=0;
        int e=0;
        int f=0;
       //metodo llenado de vectores
        public void llenadovectores(int t,String nm[],int ide[],double n1[],double n2[],double n3[]){
               for (int i = 0; i < t; i++) {
                  
                  
                  
            JOptionPane.showMessageDialog(null,"\nRegistro del estudiante " + (i + 1));
            
            
            nm[i]=JOptionPane.showInputDialog("Nombre");
            ide[i] =Integer.parseInt(JOptionPane.showInputDialog("Id/Cc: "));
            n1[i]  =Double.parseDouble(JOptionPane.showInputDialog("Nota 1: "));
            n2[i]  =Double.parseDouble(JOptionPane.showInputDialog("Nota 2: "));
            n3[i]  =Double.parseDouble(JOptionPane.showInputDialog("Nota 3: "));
        
            
            
        }
        }
        
 // metodo paraconsultar el promedio
 public void promedio(int t,double n1[],double n2[],double n3[],double cn[],String n[]){
     
        System.out.println("\nRegistro de notas:");
        System.out.println("Estudiante\t Nota 1 (30%)\tNota 2 (30%)\tNota 3 (40%)\tPromedio   \tRedondeo");
        
        for (int i = 0; i < t; i++) {
            
             promedio = (n1[i] * 0.30) + (n2[i] * 0.30) + (n3[i] * 0.40);
            promedio*=10;
            if ((promedio>=0.05)&&(promedio<=49.90))
            {
                redondeo=Math.round(promedio);
                cn[i]=redondeo;
            }
            else
            {
                redondeo=promedio;
                cn[i]=redondeo;
            }
            
        System.out.println(n[i] +"\t\t"+ n1[i] + "\t\t" + n2[i] + "\t\t" + n3[i] + "\t\t" + promedio/10+"\t\t"  +   redondeo/10);
   
       promedioAsignatura+=redondeo;
        }
        
        promedioAsignatura /= t;
        System.out.println(" \nPromedio de la asignatura: " +promedioAsignatura/10);}
        
    
 
  
 
 //metodo para consultar las estadisticas 
 public void cons_estadisticas(int t,double cn[])
 {
     for (int i = 0; i < t; i++)
     {
         if ((cn[i]==00.0)||(cn[i]==00.1)||(cn[i]==00.2)||(cn[i]==00.3)||(cn[i]==00.4)||(cn[i]==00.5)||(cn[i]==00.6)||(cn[i]==00.7)||(cn[i]==00.8)||(cn[i]==00.9))
            {
               a++; 
            }
        else  if ((cn[i]==10.0)||(cn[i]==11.0)||(cn[i]==12.0)||(cn[i]==13.0)||(cn[i]==14.0)||(cn[i]==15.0)||(cn[i]==16.0)||(cn[i]==17.0)||(cn[i]==18.0)||(cn[i]==19.0))
            {
               b++;
            }
             else if ((cn[i]==20.0)||(cn[i]==21.0)||(cn[i]==22.0)||(cn[i]==23.0)||(cn[i]==24.0)||(cn[i]==25.0)||(cn[i]==26.0)||(cn[i]==27.0)||(cn[i]==28.0)||(cn[i]==29.0))
            {
                c++;
            }
            else if ((cn[i]==30.0)||(cn[i]==31.0)||(cn[i]==32.0)||(cn[i]==33.0)||(cn[i]==34.0)||(cn[i]==35.0)||(cn[i]==36.0)||(cn[i]==37.0)||(cn[i]==38.0)||(cn[i]==39.0))
            {
                d++;
    
            }
            
            else if ((cn[i]==40.0)||(cn[i]==41.0)||(cn[i]==42.0)||(cn[i]==43.0)||(cn[i]==44.0)||(cn[i]==45.0)||(cn[i]==46.0)||(cn[i]==47.0)||(cn[i]==48.0)||(cn[i]==49.0))
            {
               e++;
            } 
            else 
            {
               f++; 
            } 
     }
        
       
  }

 
 //metodo para consultar cual es la nota maxima y la nota minima
 public void Nmax_Nmin(double cn[],String nm[]){
      for (int i = 1; i < cn.length; i++) {
            if (cn[i] > cn[indiceNotaMaxima]) {
                indiceNotaMaxima = i;
            }
            
            if (cn[i] < cn[indiceNotaMinima]) {
                indiceNotaMinima = i;
            }
        }
            
        String estudianteNotaMaxima = nm[indiceNotaMaxima];
        String estudianteNotaMinima = nm[indiceNotaMinima];
        double notaMaxima = cn[indiceNotaMaxima];
        double notaMinima = cn[indiceNotaMinima];
        
        // Imprimir los resultados
        System.out.println( estudianteNotaMaxima+" Es el estudiante con la nota mas alta: "+"\t\t"+notaMaxima/10);
         System.out.println( estudianteNotaMinima+" Es el estudiante con la nota mas baja: "+"\t\t"+notaMinima/10);
 }
 
 //metodo para imprimir las estadisticas
    public void estadisticas()
         {
               
         System.out.println("categorias de notas \t total de muestras ");
        System.out.println("0.0 a 0.9"+"\t\t"+a);
         System.out.println("1.0 a 1.9"+"\t\t"+b);
          System.out.println("2.0 a 2.9"+"\t\t"+c);
           System.out.println("3.0 a 3.9"+"\t\t"+d);
            System.out.println("4.0 a 4.9"+"\t\t"+e);
             System.out.println("   5.0   "+"\t\t"+f); 
         }

    
    //metodo para consultar el reporte de algun estudiante
public void consulta(int t,int ide[],String nm[],double n1[], double n2[],double n3[],double cn[]){
    int dec=Integer.parseInt(JOptionPane.showInputDialog("Desea consultar la nota de algun estudiante?"+"\n 1.SI"+"\n 2.NO"));
     if(dec==1){
         int CC=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de identificacion del estudiante"));
          for (int i = 0; i < t; i++){
          if(CC==ide[i]){
              
              System.out.println("\nNombre:"+nm[i]+"\n"+"Nota1: "+n1[i]+"\n"+"Nota2: "+n2[i]+"\n"+"Nota3: "+n3[i]+"\n"+ "promedio: "+cn[i]/10);
              System.out.println("\nHora del reporte: "+horaactuaL);
              System.out.println("\nFecha del reporte: "+diaactual);
          }
          
          }
         
      }
    
}
}
