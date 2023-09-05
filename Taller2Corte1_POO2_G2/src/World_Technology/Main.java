
package World_Technology;

import javax.swing.JOptionPane;

public class Main {

   
    public static void main(String[] args) {
int tam=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de dispositivos desea ingresar"));

Movil moviles[]=new Movil[tam];
Samsung smg[]=new Samsung[tam];
Televisor tv[]=new Televisor[tam];

String menu[]={"1. Registro de Moviles\n",
"1.1 Registro de móviles Samsung\n",
"2.Registro de Televisores\n" ,
"3.Autores"};

        for (int i = 0; i < tam; i++)
        {
            
        
int opcion=JOptionPane.showOptionDialog(null, "******* ALMACÉN WORLD TECHNOLOGY ********", "Elige...", 0,JOptionPane.QUESTION_MESSAGE, null, menu, "");


switch (opcion)
        {
            case 0:
           
             
         
            
          String procesador=JOptionPane.showInputDialog("ingrese el procesador del dispositivo");
          int ram=Integer.parseInt(JOptionPane.showInputDialog("ingresa la ram del dispositivo "));
         
          String marca=JOptionPane.showInputDialog("ingrese la marca del dispositivo");
          double precio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del dispositivo"));
          int serial=Integer.parseInt(JOptionPane.showInputDialog("ingrese el serial del dispositivo "));
           boolean camara=Boolean.parseBoolean(JOptionPane.showInputDialog("tiene camara: true o false"));
          
           Movil ob=new Movil(procesador, ram, camara, marca, serial, precio);
          moviles[i]=ob;
          ob.mostrarDatos();
           boolean camarafrontal=Boolean.parseBoolean(JOptionPane.showInputDialog("tiene camara frontal: true o false"));
          String cf=ob.c(camara);
                System.out.println(cf);
                    
             
            
            
           
                break;
                
            
            case 1:
                
                String almacenamiento=JOptionPane.showInputDialog("ingrese qu calse de almacenamiento tiene ");
                boolean huella= Boolean.parseBoolean(JOptionPane.showInputDialog("huella dactilar true o false"));
                   
          String procesador1=JOptionPane.showInputDialog("ingrese el procesador del dispositivo");
          int ram1=Integer.parseInt(JOptionPane.showInputDialog("ingresa la ram del dispositivo "));
          boolean camara1=Boolean.parseBoolean(JOptionPane.showInputDialog("tiene camara: true o false"));
          String marca1=JOptionPane.showInputDialog("ingrese la marca del dispositivo");
          double precio1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del dispositivo"));
          int serial1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el serial del dispositivo "));
                
                
                Samsung objSamsung=new Samsung(almacenamiento, huella, procesador1, ram1, camara1, marca1, serial1, precio1);
                 smg[i]=objSamsung;
                 String hd=objSamsung.huellaDig(huella);
                  objSamsung.mostrarDatos();
                  System.out.println(""+hd);
               
                break;
                  
            
            case 2:
                int tamaño =Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del televisor"));
                String resolucion=JOptionPane.showInputDialog("ingrese la resolucion del televisor");
                String tipo=JOptionPane.showInputDialog("ingrese el tipo del televisor");
                boolean streaming=  Boolean.parseBoolean(JOptionPane.showInputDialog("tiene plataformas streaming: true o false"));
                
                  String marca2=JOptionPane.showInputDialog("ingrese la marca del dispositivo");
          double precio2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del dispositivo"));
          int serial2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el serial del dispositivo "));
                Televisor objTelevisor=new Televisor(tamaño, resolucion, tipo, streaming, marca2, serial2, precio2);
             tv[i]=objTelevisor;
                String PS=objTelevisor.PlataformaStream(streaming);
                objTelevisor.mostrsDatos();
                System.out.println("\n"+PS);
                      
                break;
                  
            
            case 3:
                      System.out.println("Diego Fernando Muñoz"+"\nMaicol Victoria "+"\n");
                      
                break;
            default:
                throw new AssertionError();
        }
        }












//1registro moviles(falta)

      
    
   
    
    
    
    }
    }
