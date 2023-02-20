package ejercicio5.clases;

public abstract class Persona {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final int exito;

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

    public int getExito() {
        return exito;
    }

    public abstract void calcularExito();
}
