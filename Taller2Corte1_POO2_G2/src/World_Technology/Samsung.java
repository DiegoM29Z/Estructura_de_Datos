
package World_Technology;

import javax.swing.JOptionPane;


public class Samsung extends Movil {
    private String almacenamiento;
    private boolean huella;

    public Samsung(String almacenamiento, boolean huella, String procesador, int ram, boolean camara, String marca, int serial, double precio) {
        super(procesador, ram, camara, marca, serial, precio);
        this.almacenamiento = almacenamiento;
        this.huella = huella;
    }
    
     public String huellaDig( boolean hd)
    {
      
        if (hd==true)
        {
            String dec="\tEl dispositivo posee identificador de huella digital";
           return dec;
        }
        else 
        {
            String dec="\tEl dispositivo no posee identificador tiene huella digital";
            return dec;
        }
    }
public void mostrarDatos()
        {
            System.out.println("\n______ ALMACÉN WORLD TECHNOLOGY ________");
            super.mostrarDatos();
            System.out.println("\tAlmacenamiento del dispositivo: "+this.almacenamiento);
             System.out.println("\tHuellas dactilar: "+this.huella);
        
           
        }




}
