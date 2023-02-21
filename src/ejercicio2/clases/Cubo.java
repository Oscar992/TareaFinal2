package ejercicio2.clases;

public class Cubo implements IFiguraEspacial {
    private final double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public String toString() {
        return String.format("El cubo cuenta con un lado de %f %n", lado);
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }
}
