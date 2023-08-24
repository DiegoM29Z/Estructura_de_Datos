
package TansCauca_SA;


public class Tiquete {
    double ValorTiquet;
    int NumTiquet;
    String CiudadOrigen,CiudadDestino;

    public Tiquete(double ValorTiquet, int NumTiquet, String CiudadOrigen, String CiudadDestino) {
        this.ValorTiquet = ValorTiquet;
        this.NumTiquet = NumTiquet;
        this.CiudadOrigen = CiudadOrigen;
        this.CiudadDestino = CiudadDestino;
            }

   
      public double VT()
    {
        return this.ValorTiquet;
    }
    
        public int NT()
    {
        return this.NumTiquet;
    }
        
        public String CO()
    {
        return this.CiudadOrigen;
        
    }
        
        public String CD()
    {
        return this.CiudadDestino;
        
    }
        
    public double ValorT(double ValorTiquet,int NumTiquet)
    {
    double valortotal=ValorTiquet*NumTiquet;
        return valortotal;
    }
    
    public String DescuentoT(double ValorTiquet,int NumTiquet)
    {
        double vt=ValorTiquet*NumTiquet;
        if (NumTiquet>5)
        {
           double descuento= vt*15/100;
           double des_aplicado=vt-descuento;
          return "Se le aplicara un descuento del 15% al valor total ("+vt+")"+"\n eldescuento es de: $"+des_aplicado;
        }
        else
        {
            return "No hay descuento";
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
