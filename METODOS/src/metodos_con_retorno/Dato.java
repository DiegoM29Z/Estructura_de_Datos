
package metodos_con_retorno;


public class Dato {
    
    //metodo saludar
    public String saludar(String nombre)
    
    {
       String saludo="hola"+nombre;
       return saludo;
       
    }
    
    public String nombres_apellidos(String n1,String n2,String ap1,String ap2)
    {
        String mostrarNA=n1+ n2 + ap1 + ap2;
        return mostrarNA;
    }
    
    public int cedula(int cd)
    {
        int mostrarCD=cd;
        return mostrarCD;
    }
  
    public int direccion(int DR)
    {
        int mostrardireccion=DR;
        return mostrardireccion;
    }
    
     public double telefono(double CL)
    {
        double mostrartelefono=CL;
        return mostrartelefono;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
