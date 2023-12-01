package ar.com.deko;

public class Persona {
    // Creame atriburo de persona
    private String nombre;
    private String apellido;
    private int edad;

    // Creame un constructor de persona
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    // Creame un metodo de persona
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    // Creame un metodo de persona
    public int getEdad() {
        return this.edad;
    }

    // Creame un metodo de persona
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Creame un metodo de persona
    public String getNombre() {
        return this.nombre;
    }

}
