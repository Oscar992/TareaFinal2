package ejercicio1.clases;

public class Triangulo extends FiguraGeometrica {
    private final double lado1;
    private final double lado2;
    private final double lado3;

    public Triangulo(double lado1, double lado2, double lado3, Color colorRelleno, Color colorBorde,
                     int grosorLinea) {
        super(colorRelleno, colorBorde, grosorLinea);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }

    @Override
    public void calcularArea() {
        area = (lado1 + lado2 + lado3) / 2;
    }
}
