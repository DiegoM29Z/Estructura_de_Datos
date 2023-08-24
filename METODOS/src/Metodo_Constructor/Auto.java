
package Metodo_Constructor;


public class Auto {
    String marca,color;
    int modelo,velocidad;

    public Auto(String marca, String color, int modelo, int velocidad) 
    {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    //metodo para imprimir los resultado
    public void mostrarDatos()
    {
        System.out.println("la marca del auto es: "+marca);
        System.out.println("el color del auto es: "+color);
        System.out.println("el modelo del auto es: "+modelo);
        System.out.println("la velocida del auto es: "+velocidad+"km/h");
    }
   
    }

