package ejercicio2.clases;

public class Cilindro implements IFiguraEspacial {
    private final double altura;
    private final double radio;

    public Cilindro(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    public String toString() {
        return String.format("El cilindro con altura  %f, y radio %f", altura, radio);
    }

    @Override
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * radio * (altura + radio);
    }
}
