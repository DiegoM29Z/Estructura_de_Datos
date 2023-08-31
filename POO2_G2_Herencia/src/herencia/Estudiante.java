
package herencia;
// esta clase lo que va a hacer es recibir los datos de la superclase persona,tambien va a crear nuevos datos que son codigo estudiante y notafinal,tambien crea un metodo para mostrar esos datos

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrar ()
        {
            System.out.println("'\n-DATOS DEL ESTUDIANTE");
            System.out.println("nombre y apellido "+super.getNombre()+""+super.getApellidos());
            System.out.println("edad del estudiante: "+super.getEdad() );
            System.out.println("codigo del estudiante"+this.codigoEstudiante);
            System.out.println("nota final del estudiante "+this.notaFinal);
            
        
    
    
}}
