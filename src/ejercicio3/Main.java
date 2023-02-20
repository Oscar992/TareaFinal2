package ejercicio3;

import Utility.FileManager;
import ejercicio3.clases.Pelicula;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var fileManager = new FileManager();
        final var listaPeliculas =
                fileManager.leerFile("src/ejercicio3/input/informacionPeliculas.txt");

        var accionList = new ArrayList<String>();
        var comediaList = new ArrayList<String>();
        var terrorList = new ArrayList<String>();

        generarData(listaPeliculas, accionList, comediaList, terrorList);

        fileManager.escribirFile("src/ejercicio3/output/accion.txt", accionList);
        fileManager.escribirFile("src/ejercicio3/output/comedia.txt", comediaList);
        fileManager.escribirFile("src/ejercicio3/output/terror.txt", terrorList);
    }

    static void generarData(ArrayList<String> fileLeido,
                            ArrayList<String> accion,
                            ArrayList<String> comedia,
                            ArrayList<String> terror) {

        for (String string : fileLeido) {

            var pelicula = new ArrayList<String>();

            for (var i = 0; i < string.split(",").length; i++) {
                pelicula.add(string.split(",")[i]);
            }

            final var peliObj = crearPelicula(pelicula);
            llenarLista(peliObj, accion, comedia, terror);
        }
    }

    static Pelicula crearPelicula(ArrayList<String> lista) {
//BUSCANDO A NEMO,2003,140,TERROR,16.24
        var nombre = lista.get(0);
        var epoca = Integer.parseInt(lista.get(1));
        var duracion = Integer.parseInt(lista.get(2));
        var genero = lista.get(3);
        var precioTicket = Double.parseDouble(lista.get(4));

        return new Pelicula(nombre, epoca, duracion, genero, precioTicket);
    }

    static void llenarLista(Pelicula pelicula,
                            ArrayList<String> accionList,
                            ArrayList<String> comediaList,
                            ArrayList<String> terrorList) {

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
