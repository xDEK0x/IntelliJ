package ar.com.deko;

public class Socios {
    // Creame atriburo de socio
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String password;

    // Creame un constructor de socio
    public Socios(String nombre, String apellido, int edad, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.password = password;

    }

    // Creame un metodo de socio
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    // Creame un metodo de socio
    public int getEdad() {
        return this.edad;
    }

    // Creame un metodo de socio
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Creame un metodo de socio
    public String getNombre() {
        return this.nombre;
    }

    // Creame un metodo de socio
    public String getEmail() {
        return this.email;
    }

    // Creame un metodo de socio
    public String getPassword() {
        return this.password;
    }

    // Creame un metodo de socio
    public void setPassword(String password) {
        this.password = password;
    }

    // Creame un metodo de socio
    public void setEmail(String email) {
        this.email = email;
    }
}
