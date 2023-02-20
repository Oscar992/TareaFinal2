package ejercicio1.clases;

public class Cuadrado extends FiguraGeometrica {
    Double lado;

    public Cuadrado(Double lado, Color colorRelleno, Color colorBorde, int grosorLinea) {
        super(colorRelleno, colorBorde, grosorLinea);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado * 4;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }
}
