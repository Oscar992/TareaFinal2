package ejercicio2.clases;

public class Cubo implements IFiguraEspacial {
    Double lado;

    public Cubo(Double lado) {
        this.lado = lado;
    }

    public String toString() {
        return String.format("El cubo cuenta con un lado de %f", lado);
    }

    @Override
    public Double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public Double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }
}
