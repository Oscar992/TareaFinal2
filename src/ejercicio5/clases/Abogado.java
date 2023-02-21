package ejercicio5.clases;

public class Abogado extends Persona {
    private final double numJuiciosGanados;
    private final double numJuiciosParticipados;
    private final String nombreNotaria;

    public Abogado(String nombre, String apellido, int edad, double numJuiciosGanados,
                   double numJuiciosParticipados, String nombreNotaria) {
        super(nombre, apellido, edad);
        this.numJuiciosGanados = numJuiciosGanados;
        this.numJuiciosParticipados = numJuiciosParticipados;
        this.nombreNotaria = nombreNotaria;
        calcularExito();
    }

    public double getNumJuiciosGanados() {
        return numJuiciosGanados;
    }

    public double getNumJuiciosParticipados() {
        return numJuiciosParticipados;
    }

    public String getNombreNotaria() {
        return nombreNotaria;
    }

    @Override
    public void calcularExito() {
        exito = (numJuiciosGanados / numJuiciosParticipados) * 100;
    }
}
