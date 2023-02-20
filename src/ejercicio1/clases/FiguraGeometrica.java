package ejercicio1.clases;

//import Ejercicio1.Color;

public abstract class FiguraGeometrica {
    Color colorRelleno;
    Color colorBorde;
    Integer grosorLinea;
    Double perimetro;
    Double area;

    public FiguraGeometrica(Color colorRelleno, Color colorBorde, Integer grosorLinea) {
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
        return (String.format("Coloreo el relleno de color %s en un perimetro de %f Coloreo el borde de color %s " +
                        "en un area de %f.Para esto he usado un pincel de %d px", colorRelleno.toString(), perimetro,
                colorBorde.toString(), area, grosorLinea));
    }

    public abstract void calcularPerimetro();

    public abstract void calcularArea();
}
