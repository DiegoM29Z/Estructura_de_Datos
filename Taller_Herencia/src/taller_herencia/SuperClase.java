
package taller_herencia;

public class SuperClase {
    private int Dimensiones,NumeroHabitciones,NumeroBaños;
    private String Ubicacion;

    public SuperClase(int Dimensiones, int NumeroHabitciones, int NumeroBaños, String Ubicacion) {
        this.Dimensiones = Dimensiones;
        this.NumeroHabitciones = NumeroHabitciones;
        this.NumeroBaños = NumeroBaños;
        this.Ubicacion = Ubicacion;
    }

    public int getDimensiones() {
        return Dimensiones;
    }

    public int getNumeroHabitciones() {
        return NumeroHabitciones;
    }

    public int getNumeroBaños() {
        return NumeroBaños;
    }

    public String getUbicacion() {
        return Ubicacion;
    }
    
    
}
