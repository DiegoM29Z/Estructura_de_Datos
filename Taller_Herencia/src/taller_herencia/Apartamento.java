
package taller_herencia;


public class Apartamento  extends SuperClase {
    private boolean administracion;
    private int estrato;

    public Apartamento(boolean administracion, int estrato, int Dimensiones, int NumeroHabitciones, int NumeroBaños, String Ubicacion) {
        super(Dimensiones, NumeroHabitciones, NumeroBaños, Ubicacion);
        this.administracion = administracion;
        this.estrato = estrato;
    }
    
    public void Datos_Apartamento()
    {
        
        if (this.administracion==true)
        {
            System.out.println("la administracion si la pago");
        }
        else{
            System.out.println("la administracions no la pago");
        }
        System.out.println("el estrato del apartamento: "+this.estrato);
        System.out.println("la dimension del apartamento: "+super.getDimensiones());
        System.out.println("el numero de habitaciones del apartamento: "+super.getNumeroHabitciones());
        System.out.println("le numero de baños: "+super.getNumeroBaños());
        System.out.println("la ubicacion del apartamento: "+super.getUbicacion());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
