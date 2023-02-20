package ejercicio2.clases;

public class Cilindro implements IFiguraEspacial {
    Double altura;
    Double radio;

    public Cilindro(Double altura, Double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    public String toString() {
        return String.format("El cilindro con altura  %f, y radio %f", altura, radio);
    }

    @Override
    public Double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public Double calcularArea() {
        return 2 * Math.PI * radio * (altura + radio);
    }
}
