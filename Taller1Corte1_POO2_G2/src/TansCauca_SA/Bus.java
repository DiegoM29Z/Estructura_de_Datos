
package TansCauca_SA;




public class Bus {
    int codigoBus ;
    String MarcaBus,PlacaBus,ModeloBus;

    public Bus(int codigoBus, String MarcaBus, String PlacaBus, String ModeloBus) {
        this.codigoBus = codigoBus;
        this.MarcaBus = MarcaBus;
        this.PlacaBus = PlacaBus;
        this.ModeloBus = ModeloBus;
    }

   

    public int CB() 
    {
         return this.codigoBus;
    }
   
    public String MB() 
    {
      return this.MarcaBus;
    }
   
    public String PB() 
    {
       return this.PlacaBus;
    }
    
    public String MDB() 
    { 
       return this.ModeloBus;
    }
   
  
}
