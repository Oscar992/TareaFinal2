package ejercicio4.clases;

public class Videojuego {
    String nombre;
    Integer epoca;
    Double precio;
    Integer duracion;
    String genero;
    String empresa;

    public Videojuego(String nombre, Integer epoca, Double precio, Integer duracion, String genero, String empresa) {
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

    public Integer getEpoca() {
        return epoca;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getDuracion() {
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
