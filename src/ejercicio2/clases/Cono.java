package ejercicio2.clases;

public class Cono implements IFiguraEspacial {
    private final double altura;
    private final double radio;
    private final double generatriz;

    public Cono(double altura, double radio, double generatriz) {
        this.altura = altura;
        this.radio = radio;
        this.generatriz = generatriz;
    }

    public String toString() {
        return String.format("El cono cuenta con altura %f, radio %f y generatriz %f", altura, radio, generatriz);
    }

    @Override
    public Double calcularVolumen() {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2) + Math.PI + radio * generatriz;
    }
}
