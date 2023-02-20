package ejercicio5.clases;

public abstract class Persona {
    String nombre;
    String apellido;
    Integer edad;
    Integer exito;

    public Persona(String nombre, String apellido, Integer edad) {
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

    public Integer getEdad() {
        return edad;
    }

    public Integer getExito() {
        return exito;
    }

    public abstract void calcularExito();
}
