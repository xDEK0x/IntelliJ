package ar.com.deko;

public class Usuario {
    // Creame atriburo de usuario
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String password;

    // Creame un constructor de usuario
    public Usuario(String nombre, String apellido, int edad, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.password = password;

    }

    // Creame un metodo de usuario
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    // Creame un metodo de usuario
    public int getEdad() {
        return this.edad;
    }

    // Creame un metodo de usuario
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Creame un metodo de usuario
    public String getNombre() {
        return this.nombre;
    }

    // Creame un metodo de usuario
    public String getEmail() {
        return this.email;
    }

    // Creame un metodo de usuario
    public String getPassword() {
        return this.password;
    }

    // Creame un metodo de usuario
    public void setPassword(String password) {
        this.password = password;
    }

    // Creame un metodo de usuario
    public void setEmail(String email) {
        this.email = email;
    }
}
