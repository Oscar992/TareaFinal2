package ejercicio5.clases;

public class Abogado extends Persona {
    private final int numJuiciosGanados;
    private final int numJuiciosParticipados;
    private final String nombreNotaria;

    public Abogado(String nombre, String apellido, int edad, int numJuiciosGanados,
                   int numJuiciosParticipados, String nombreNotaria) {
        super(nombre, apellido, edad);
        this.numJuiciosGanados = numJuiciosGanados;
        this.numJuiciosParticipados = numJuiciosParticipados;
        this.nombreNotaria = nombreNotaria;
        calcularExito();
    }

    public int getNumJuiciosGanados() {
        return numJuiciosGanados;
    }

    public int getNumJuiciosParticipados() {
        return numJuiciosParticipados;
    }

    public String getNombreNotaria() {
        return nombreNotaria;
    }

    @Override
    public void calcularExito() {
        exito = numJuiciosGanados / numJuiciosParticipados;
    }
}
