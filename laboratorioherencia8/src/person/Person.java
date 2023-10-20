package person;


public class Person {
    private String nombre;
    private int edad;

    // Constructor
    
   
public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Person() {
	// TODO Auto-generated constructor stub
}

	// Métodos de obtención (getters) para acceder a las propiedades privadas
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Métodos de configuración (setters) para modificar las propiedades privadas
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
   
public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
public class Main {
	 public static void main(String[] args) {
	        Person persona = new Person ();

        // Configuración de datos a través de los métodos de configuración
        persona.setNombre("gero");
        persona.setEdad(18);

        // Acceso a los datos a través de logs métodos de obtención
        String nombre = persona.getNombre();
        int edad = persona.getEdad();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

}