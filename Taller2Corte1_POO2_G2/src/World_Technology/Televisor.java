
package World_Technology;


public class Televisor extends Dispositivo {
    private int tamaño;
    private String resolucion,tipo;
    private boolean streamig;

    public Televisor(int tamaño, String resolucion, String tipo, boolean streamig, String marca, int serial, double precio) {
        super(marca, serial, precio);
        this.tamaño = tamaño;
        this.resolucion = resolucion;
        this.tipo = tipo;
        this.streamig = streamig;
    }
  
       public String PlataformaStream( boolean ps)
    {
      
        if (ps==true)
        {
            String dec="\tTiene las siguientes plataformas de streaming: "+"\n\t\t-Netflix"+"\n\t\t-Amazon Prime"+"\n\t\t-Disney Plus+";
           return dec;
        }
        else 
        {
            String dec="\tel dispositivo no posee plataformas de streaming";
            return dec;
        }
    }
    
       public void mostrsDatos()
       {
           super.mostratdatosdispositivo();
           System.out.println("\ttamaño del televisor: "+this.tamaño);
                   System.out.println("\tresolucion del televisor: "+this.resolucion);
                           System.out.println("\ttipo del televisor: "+this.tipo);
                                   System.out.println("\tstreaming del televisor: "+this.streamig);
       }
}
