package ejercicio5.clases;

public class Ingeniero extends Persona {

    private final double numEdificiosConstruidos;
    private final double numEdificiosPlanificados;
    private final String nombreConstructora;

    public Ingeniero(String nombre, String apellido, int edad, double numEdificiosConstruidos,
                     double numEdificiosPlanificados, String nombreConstructora) {
        super(nombre, apellido, edad);
        this.numEdificiosConstruidos = numEdificiosConstruidos;
        this.numEdificiosPlanificados = numEdificiosPlanificados;
        this.nombreConstructora = nombreConstructora;
        calcularExito();
    }

    public double getNumEdificiosConstruidos() {
        return numEdificiosConstruidos;
    }

    public double getNumEdificiosPlanificados() {
        return numEdificiosPlanificados;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    @Override
    public void calcularExito() {
        exito = (numEdificiosConstruidos / numEdificiosPlanificados) * 100;
    }
}
