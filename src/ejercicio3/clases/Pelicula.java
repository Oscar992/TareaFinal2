package ejercicio3.clases;

public class Pelicula {
    final String nombre;
    final Integer epoca;
    final Integer duracion;
    final String genero;
    final Double precioTicket;

    public Pelicula(String nombre,
                    Integer epoca,
                    Integer duracion,
                    String genero,
                    Double precioTicket) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.duracion = duracion;
        this.genero = genero;
        this.precioTicket = precioTicket;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEpoca() {
        return epoca;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public Double getPrecioTicket() {
        return precioTicket;
    }

    public String toString() {
        return String.format("Nombre: " + nombre +
                " Epoca: " + epoca +
                " Duracion: " + duracion +
                " Genero: " + genero +
                " Precio: " + precioTicket);
    }
}
