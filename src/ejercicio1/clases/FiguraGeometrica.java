package ejercicio1.clases;

public abstract class FiguraGeometrica {
    private final Color colorRelleno;
    private finalColor colorBorde;
    private final int grosorLinea;
    private final double perimetro;
    private final double area;

    public FiguraGeometrica(Color colorRelleno, Color colorBorde, int grosorLinea) {
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
        this.grosorLinea = grosorLinea;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Color getColorRelleno() {
        return colorRelleno;
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public int getGrosorLinea() {
        return grosorLinea;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public String colorearFigura() {
        return String.format("Coloreo el relleno de color %s en un perimetro de %f Coloreo el borde de color %s " +
                        "en un area de %f.Para esto he usado un pincel de %d px %n", colorRelleno.toString(), perimetro,
                colorBorde.toString(), area, grosorLinea);
    }

    public abstract void calcularPerimetro();

    public abstract void calcularArea();
}
