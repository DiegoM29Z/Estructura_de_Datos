
package taller_herencia;




public class Local extends SuperClase {
    private String Tipo,Zona;

    public Local(String Tipo, String Zona, int Dimensiones, int NumeroHabitciones, int NumeroBaños, String Ubicacion) {
        super(Dimensiones, NumeroHabitciones, NumeroBaños, Ubicacion);
        this.Tipo = Tipo;
        this.Zona = Zona;
    }

    public void Datos_Local ()
            
    {
          System.out.println("la administracion del local: "+this.Tipo);
        System.out.println("el estrato del local: "+this.Zona);
        System.out.println("la dimension del local: "+super.getDimensiones());
        System.out.println("el numero de habitaciones del local: "+super.getNumeroHabitciones());
        System.out.println("el numero de baños del local: "+super.getNumeroBaños());
        System.out.println("la ubicacion del local: "+super.getUbicacion());
    }
    


















}
