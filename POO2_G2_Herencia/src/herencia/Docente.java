
package herencia;


public class Docente extends Persona  {

 
 private String MateriaDocente;
    private int GradoDocente;

    public Docente(String MateriaDocente, int GradoDocente, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.MateriaDocente = MateriaDocente;
        this.GradoDocente = GradoDocente;
    }

    
   
     public void mostrarD ()
        {
            System.out.println("\n-DATOS DEL DOCENTE");
            System.out.println("nombre y apellido "+super.getNombre()+""+super.getApellidos());
            System.out.println("edad del estudiante: "+super.getEdad() );
            System.out.println("la materia del docente es: "+this.MateriaDocente);
            System.out.println("el grado del docente es: "+this.GradoDocente);
            
        
    
    
}


   
    
    
   

    
    
    
}
