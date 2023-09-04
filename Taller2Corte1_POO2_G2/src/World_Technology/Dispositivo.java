
package World_Technology;


public class Dispositivo {
     private String marca;
     private int serial;
     private double precio;

    public Dispositivo(String marca, int serial, double precio) {
        this.marca = marca;
        this.serial = serial;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getSerial() {
        return serial;
    }

    public double getPrecio() {
        return precio;
    }

    
     
     public void mostratdatosdispositivo()
     {
         System.out.println("\n\tmarca del dispositivo: "+this.marca);
         System.out.println("     \tserial del dispositivo: "+this.serial);
         System.out.println("\tprecio del dispositivo: "+this.precio);
     }
}
