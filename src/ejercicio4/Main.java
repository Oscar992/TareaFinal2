package ejercicio4;

import Utility.FileManager;
import ejercicio4.clases.Videojuego;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final var listaVideojuegos =
                FileManager.leerFile("src/ejercicio4/input/informacionVideojuegos.txt");

        final var nintendoList = new ArrayList<String>();
        final var playstationList = new ArrayList<String>();
        final var xboxList = new ArrayList<String>();

        generarData(listaVideojuegos, nintendoList, playstationList, xboxList);

        FileManager.escribirFile("src/ejercicio4/output/nintendo.txt", nintendoList);
        FileManager.escribirFile("src/ejercicio4/output/playStation.txt", playstationList);
        FileManager.escribirFile("src/ejercicio4/output/xbox.txt", xboxList);
    }

    private static void generarData(List<String> fileLeido,
                                    List<String> nintendoList,
                                    List<String> playstationList,
                                    List<String> xboxList) {

        for (String string : fileLeido) {
            final var videojuego = new ArrayList<String>();

            for (var i = 0; i < string.split(",").length; i++) {
                videojuego.add(string.split(",")[i]);
            }

            final var videojuegoObj = crearVideojuego(videojuego);
            llenarLista(videojuegoObj, nintendoList, playstationList, xboxList);
        }
    }

    private static Videojuego crearVideojuego(List<String> videojuego) {
        final var nombre = videojuego.get(0);
        final var epoca = videojuego.get(1);
        final var precio = videojuego.get(2);
        final var duracion = videojuego.get(3);
        final var genero = videojuego.get(4);
        final var empresa = videojuego.get(5);

        return new Videojuego(nombre, Integer.parseInt(epoca),
                Double.parseDouble(precio),
                Integer.parseInt(duracion), genero, empresa);
    }

    private static void llenarLista(Videojuego videojuego,
                                    List<String> nintendoList,
                                    List<String> playStationList,
                                    List<String> xboxList) {

        switch (videojuego.getEmpresa()) {
            case "NINTENDO":
                nintendoList.add(videojuego.toString());
                break;
            case "PLAY STATION":
                playStationList.add(videojuego.toString());
                break;
            case "XBOX":
                xboxList.add(videojuego.toString());
        }
    }
}


