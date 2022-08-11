
package herencialanzadora;
//esta es la clase profesor y esta clase hereda a la clase Persona lo que significa que todos los 
//metodos y atributos que estan en la clase persona son heredados en esta clase profesor 
public class Profesor extends Persona{
    //declara variable de la clase profesor pero no es de persona
    private String idProfesor;
    
    //creamos constructor de la clase profesor y como vemos pudimos traer los atributos de la clase persona 
    //con el comando super e incluimos el atributo de la clase profesor.

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);  //con la palabra super siempre ahi que invocar los argumentos de la clase padre
        idProfesor =  "Unknown";   
    }
    
    //Metodos de la subclase es decir de la clase profesor ya que la clase principal seria la clase persona
    public String getIdProdesor() { return idProfesor;  }

    public void setIdProdesor(String idProdesor) { 
        this.idProfesor = idProdesor;   }
    
    public void mostrarNombreApellidoYCarnet(){
         System.out.println ("Profesor de nombre: " + getNombre() + " " +  getApellido() +
         " con Id de profesor: " + getIdProdesor());
    } //cierre Metodo para mostrar datos.

  } //Cierre de la clase

    

