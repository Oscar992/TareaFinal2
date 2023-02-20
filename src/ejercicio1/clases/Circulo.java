package ejercicio1.clases;

public class Circulo extends FiguraGeometrica {
    Double radio;

    public Circulo(Double radio, Color colorRelleno, Color colorBorde, int grosorlinea) {
        super(colorRelleno, colorBorde, grosorlinea);
        this.radio = radio;
    }

    public Double getRadio() {
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
