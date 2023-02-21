package ejercicio3.clases;

public class Pelicula {
    private final String nombre;
    private final int epoca;
    private final int duracion;
    private final String genero;
    private final double precioTicket;

    public Pelicula(String nombre,
                    int epoca,
                    int duracion,
                    String genero,
                    double precioTicket) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.duracion = duracion;
        this.genero = genero;
        this.precioTicket = precioTicket;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEpoca() {
        return epoca;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecioTicket() {
        return precioTicket;
    }

    public String toString() {
        return String.format("Nombre: " + nombre + "%n" +
                " Epoca: " + epoca + "%n" +
                " Duracion: " + duracion + "%n" +
                " Genero: " + genero + "%n" +
                " Precio: " + precioTicket + "%n");
    }
}
