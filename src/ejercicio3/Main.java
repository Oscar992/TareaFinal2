package ejercicio3;

import Utility.FileManager;
import ejercicio3.clases.Pelicula;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final var listaPeliculas =
                FileManager.leerFile("src/ejercicio3/input/informacionPeliculas.txt");

        final var accionList = new ArrayList<String>();
        final var comediaList = new ArrayList<String>();
        final var terrorList = new ArrayList<String>();

        generarData(listaPeliculas, accionList, comediaList, terrorList);

        FileManager.escribirFile("src/ejercicio3/output/accion.txt", accionList);
        FileManager.escribirFile("src/ejercicio3/output/comedia.txt", comediaList);
        FileManager.escribirFile("src/ejercicio3/output/terror.txt", terrorList);
    }

    static void generarData(ArrayList<String> listaInput,
                            ArrayList<String> accion,
                            ArrayList<String> comedia,
                            ArrayList<String> terror) {

        for (var string : listaInput) {

            final var pelicula = new ArrayList<String>();

            for (var i = 0; i < string.split(",").length; i++) {
                pelicula.add(string.split(",")[i]);
            }

            final var peliObj = crearPelicula(pelicula);
            llenarLista(peliObj, accion, comedia, terror);
        }
    }

    private static Pelicula crearPelicula(List<String> lista) {
        final var nombre = lista.get(0);
        final var epoca = Integer.parseInt(lista.get(1));
        final var duracion = Integer.parseInt(lista.get(2));
        final var genero = lista.get(3);
        final var precioTicket = Double.parseDouble(lista.get(4));

        return new Pelicula(nombre, epoca, duracion, genero, precioTicket);
    }

    private static void llenarLista(Pelicula pelicula,
                                    List<String> accionList,
                                    List<String> comediaList,
                                    List<String> terrorList) {

        switch (pelicula.getGenero()) {
            case "ACCION":
                accionList.add(pelicula.toString());
                break;
            case "COMEDIA":
                comediaList.add(pelicula.toString());
                break;
            case "TERROR":
                terrorList.add(pelicula.toString());
        }
    }
}
