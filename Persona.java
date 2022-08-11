
package herencialanzadora;

public class Persona {
    //Atributos de la clase 
    String nombre;
    String apellido;
    int edad;

    //Metodo COnstructor de la clase persona
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Metodos Getters sirve para obtener datos.
    public String getNombre() { return nombre;  }

    public String getApellido() { return apellido; }
    
    public int getEdad() { return edad;  }
    
}
