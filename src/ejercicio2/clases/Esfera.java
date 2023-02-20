package ejercicio2.clases;

public class Esfera implements IFiguraEspacial {
    Double radio;

    public Esfera(Double radio) {
        this.radio = radio;
    }

    public String toString() {
        return String.format("La esfera cuenta con radio %f", radio);
    }

    @Override
    public Double calcularVolumen() {
        return (4 / 3) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public Double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
