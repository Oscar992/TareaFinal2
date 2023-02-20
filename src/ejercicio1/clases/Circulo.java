package ejercicio1.clases;

public class Circulo extends FiguraGeometrica {
    private final double radio;

    public Circulo(double radio, Color colorRelleno, Color colorBorde, int grosorlinea) {
        super(colorRelleno, colorBorde, grosorlinea);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }
}
