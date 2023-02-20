package ejercicio5.clases;

public class Abogado extends Persona {
    Integer numJuiciosGanados;
    Integer numJuiciosParticipados;
    String nombreNotaria;

    public Abogado(String nombre, String apellido, Integer edad, Integer numJuiciosGanados,
                   Integer numJuiciosParticipados, String nombreNotaria) {
        super(nombre, apellido, edad);
        this.numJuiciosGanados = numJuiciosGanados;
        this.numJuiciosParticipados = numJuiciosParticipados;
        this.nombreNotaria = nombreNotaria;
        calcularExito();
    }

    public Integer getNumJuiciosGanados() {
        return numJuiciosGanados;
    }

    public Integer getNumJuiciosParticipados() {
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
