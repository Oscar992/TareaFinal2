package ejercicio5.clases;

public class Ingeniero extends Persona {

    Integer numEdificiosConstruidos;
    Integer numEdificiosPlanificados;
    String nombreConstructora;

    public Ingeniero(String nombre, String apellido, Integer edad, Integer numEdificiosConstruidos,
                     Integer numEdificiosPlanificados, String nombreConstructora) {
        super(nombre, apellido, edad);
        this.numEdificiosConstruidos = numEdificiosConstruidos;
        this.numEdificiosPlanificados = numEdificiosPlanificados;
        this.nombreConstructora = nombreConstructora;
        calcularExito();
    }

    public Integer getNumEdificiosConstruidos() {
        return numEdificiosConstruidos;
    }

    public Integer getNumEdificiosPlanificados() {
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
