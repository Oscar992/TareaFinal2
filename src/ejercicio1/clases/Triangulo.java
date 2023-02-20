package ejercicio1.clases;

public class Triangulo extends FiguraGeometrica {
    Double lado1;
    Double lado2;
    Double lado3;

    public Triangulo(Double lado1, Double lado2, Double lado3, Color colorRelleno, Color colorBorde,
                     Integer grosorLinea) {
        super(colorRelleno, colorBorde, grosorLinea);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Double getLado1() {
        return lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public Double getLado3() {
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
