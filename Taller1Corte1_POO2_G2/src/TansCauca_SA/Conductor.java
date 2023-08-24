
package TansCauca_SA;


public class Conductor {
    int CedulaCond, experiencia;
    String NombreCond,ApellidoCond;

    public Conductor(int CedulaCond, int experiencia, String NombreCond, String ApellidoCond) {
        this.CedulaCond = CedulaCond;
        this.experiencia = experiencia;
        this.NombreCond = NombreCond;
        this.ApellidoCond = ApellidoCond;
    }
    
    public String DCN(int experiencia )
    {
        if (experiencia>30)
        {
            return "El conductor esta a punto de pensionarse ";
        }
        else{
           return "El conductor esta activo";
        }
        
    }
    public int CD()
    {
        return this.CedulaCond;
    }
    
    public String NB()
    {
        return this.NombreCond;
        
    }
    
    public String AP()
    {
        return this.ApellidoCond;
    }
    
    public int EX()
    {
        return this.experiencia;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
