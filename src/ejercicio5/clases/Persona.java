package ejercicio5.clases;

public abstract class Persona {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final double exito;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getExito() {
        return exito;
    }

    public String toString() {
        return String.format("Nombre: " + nombre + "%n" +
                " Apellido: " + apellido + "%n" +
                " Edad: " + edad + "%n" +
                " Exito: " + exito + "%n");
    }

    public abstract void calcularExito();
}
