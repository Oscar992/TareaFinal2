package ejercicio4.clases;

public class Videojuego {
    private final String nombre;
    private final int epoca;
    private final double precio;
    private final int duracion;
    private final String genero;
    private final String empresa;

    public Videojuego(String nombre, int epoca, double precio, int duracion, String genero, String empresa) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.precio = precio;
        this.duracion = duracion;
        this.genero = genero;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEpoca() {
        return epoca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String toString() {
        return String.format("Nombre: %s\n" +
                " Epoca: %d\n" +
                " Precio: %f\n" +
                " Duracion: %d\n" +
                " Genero: %s\n" +
                " Empresa: %s", nombre, epoca, precio, duracion, genero, empresa);
    }
}
