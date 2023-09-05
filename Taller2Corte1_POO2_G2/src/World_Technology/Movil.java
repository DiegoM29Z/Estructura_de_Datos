
package World_Technology;

import javax.swing.JOptionPane;


public class Movil extends Dispositivo {
   private String procesador;
   private int ram;
   private boolean camara;

    public Movil(String procesador, int ram, boolean camara, String marca, int serial, double precio) {
        super(marca, serial, precio);
        this.procesador = procesador;
        this.ram = ram;
        this.camara = camara;
    }

   

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    public boolean isCamara() {
        return camara;
    }
   
 
    public String c( boolean c)
    {
       int x=0;
        if (c==true)
        {
            x=Integer.parseInt(JOptionPane.showInputDialog("cuanto mg tiene la camara frontal"));
           String dec="\ttiene camara frontal y es de "+x+" Megapixeles";
           return dec;
        }
        else 
        {
            String dec="\tno tiene camara frontal";
            return dec;
        }
    }


 public void mostrarDatos()
        {
            System.out.println("\n______ ALMACÉN WORLD TECHNOLOGY ________");
            super.mostratdatosdispositivo();
            System.out.println("\tProcesador del dispositivo: "+this.procesador);
             System.out.println("\tRam del dispositivo: "+this.ram);
            System.out.println("\tCamara del dispositivo: "+this.camara);
           
        }











}
