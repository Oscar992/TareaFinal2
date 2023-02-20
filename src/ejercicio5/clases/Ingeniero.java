package ejercicio5.clases;

public class Ingeniero extends Persona {

    private final int numEdificiosConstruidos;
    private final int numEdificiosPlanificados;
    private final String nombreConstructora;

    public Ingeniero(String nombre, String apellido, int edad, int numEdificiosConstruidos,
                     int numEdificiosPlanificados, String nombreConstructora) {
        super(nombre, apellido, edad);
        this.numEdificiosConstruidos = numEdificiosConstruidos;
        this.numEdificiosPlanificados = numEdificiosPlanificados;
        this.nombreConstructora = nombreConstructora;
        calcularExito();
    }

    public int getNumEdificiosConstruidos() {
        return numEdificiosConstruidos;
    }

    public int getNumEdificiosPlanificados() {
        return numEdificiosPlanificados;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    @Override
    public void calcularExito() {
        exito = numEdificiosConstruidos / numEdificiosPlanificados;
    }
}
