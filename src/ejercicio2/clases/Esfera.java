package ejercicio2.clases;

public class Esfera implements IFiguraEspacial {
    private final double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public String toString() {
        return String.format("La esfera cuenta con radio %f", radio);
    }

    @Override
    public double calcularVolumen() {
        return (4 / 3) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
