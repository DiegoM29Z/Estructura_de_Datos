
package TansCauca_SA;
import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) {
       
       int a = 0;
       int b=0;
       int c=0;
       int d=0;
        for (int i = 0; i < 4; i++)
        {
            
        
       int dec=Integer.parseInt(JOptionPane.showInputDialog(" **********TransCauca SA**********"+"\n"+"\n1- registro buses"+"\n2- registro conductores"+"\n3-registro tiquetes"+"\n4-autores"+"\n"+"\n **********TransCauca SA**********"));
       
        
            
        
        switch (dec)
        {
            case 1:
                  
                     int codigo;
                     String marca,modelo,placa;
    
                     codigo=Integer.parseInt(JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese el codigo de el auto"+"\n"+"\n **********TransCauca SA**********"));
                     marca=JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese la marca del bus"+"\n"+"\n **********TransCauca SA**********");
                     placa=JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese la placa del bus"+"\n"+"\n **********TransCauca SA**********");
                     modelo=JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese la modelo del bus"+"\n"+"\n **********TransCauca SA**********");
    
                     Bus obj1=new Bus(codigo, marca, placa, modelo);
                     System.out.println("\n **********TransCauca SA**********"+"\n"+"\n-codigo del bus: "+obj1.codigoBus+"\n-marca del bus:  "+ obj1.MarcaBus+"\n-placas del bus: "+obj1.PlacaBus+"\n-modelo del bus: "+obj1.ModeloBus+"\n"+"\n **********TransCauca SA**********");
                   a++;
        break;
                
            case 2:
                     
                    int cedula, exp;
                    String nombre,apellido;
    
                    cedula=Integer.parseInt(JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese la cedula del conductor"+"\n"+"\n **********TransCauca SA**********"));
                    nombre=JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese el nombre del conductor"+"\n"+"\n **********TransCauca SA**********");
                    apellido=JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese el apellido del conductor"+"\n"+"\n **********TransCauca SA**********");
                    exp=Integer.parseInt(JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese la experiencia del conductor"+"\n"+"\n **********TransCauca SA**********"));
      
                   Conductor obj2 =new Conductor(cedula, exp, nombre, apellido);
                   System.out.println("\n **********TransCauca SA**********"+"\n"+obj2.DCN(exp)+"\n-cedula del conductor: "+obj2.CD()+"\n-nombre del conductor: "+obj2.NB()+"\n-apellido del conductor: "+obj2.AP()+"\n-experiencia del conductor: "+obj2.EX()+"\n"+"\n **********TransCauca SA**********");
                   b++;
        break;
        
            case 3:
                
                    double valorT;
                    int numeroT;
                    String origen,destino;
    
                    valorT=Double.parseDouble(JOptionPane.showInputDialog( "\n **********TransCauca SA**********"+"\n"+"\ningrese el valor del tiquet"+"\n"+"\n **********TransCauca SA**********"));
                    origen=JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese la ciudad de origen"+"\n"+"\n **********TransCauca SA**********");
                    destino=JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese la ciudad de destino"+"\n"+"\n **********TransCauca SA**********");
                    numeroT=Integer.parseInt(JOptionPane.showInputDialog("\n **********TransCauca SA**********"+"\n"+"\ningrese el numero de tiquets"+"\n"+"\n **********TransCauca SA**********"));
    
                    Tiquete obj3=new Tiquete(valorT, numeroT, origen, destino);
                    System.out.println("\n **********TransCauca SA**********"+"\n"+"\n-valor del tiquet: "+obj3.VT()+"\n-numero el tiquet: "+obj3.NT()+"\n-ciudad de origen: "+obj3.CO()+"\n-ciudad de destino: "+obj3.CD()+"\n-valor total de todos los tiquets: $"+obj3.ValorT(valorT, numeroT)+"\n"+obj3.DescuentoT(valorT, numeroT)+"\n"+"\n **********TransCauca SA**********");
                    c++;
        break;
        
            case 4:
              
                System.out.println("""
                                    
                                   **********TransCauca SA**********
                                   
                                   trabajo realizado por: 
                                   -Diego Fernando Muñoz
                                   -Cesar Yafue
                                   
                                   **********TransCauca SA**********""");
                d++;
                
                
                
                
        break;
           
            default:
                throw new AssertionError();
        }
        }
      
                
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
        }
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     