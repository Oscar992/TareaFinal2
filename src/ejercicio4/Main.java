package ejercicio4;

import Utility.FileManager;
import ejercicio4.clases.Videojuego;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var fileManager = new FileManager();
        final var listaVideojuegos =
                fileManager.leerFile("src/ejercicio4/input/informacionVideojuegos.txt");

        var nintendoList = new ArrayList<String>();
        var playstationList = new ArrayList<String>();
        var xboxList = new ArrayList<String>();

        generarData(listaVideojuegos, nintendoList, playstationList, xboxList);

        fileManager.escribirFile("src/ejercicio4/output/nintendo.txt", nintendoList);
        fileManager.escribirFile("src/ejercicio4/output/playStation.txt", playstationList);
        fileManager.escribirFile("src/ejercicio4/output/xbox.txt", xboxList);
    }

    static void generarData(ArrayList<String> fileLeido,
                            ArrayList<String> nintendoList,
                            ArrayList<String> playstationList,
                            ArrayList<String> xboxList) {

        for (String string : fileLeido) {
            var videojuego = new ArrayList<String>();

            for (var i = 0; i < string.split(",").length; i++) {
                videojuego.add(string.split(",")[i]);
            }

            final var videojuegoObj = crearVideojuego(videojuego);
            llenarLista(videojuegoObj, nintendoList, playstationList, xboxList);
        }
    }

    static Videojuego crearVideojuego(ArrayList<String> videojuego) {
        var nombre = videojuego.get(0);
        var epoca = videojuego.get(1);
        var precio = videojuego.get(2);
        var duracion = videojuego.get(3);
        var genero = videojuego.get(4);
        var empresa = videojuego.get(5);

        return new Videojuego(nombre, Integer.parseInt(epoca),
                Double.parseDouble(precio),
                Integer.parseInt(duracion), genero, empresa);
    }

    static void llenarLista(Videojuego videojuego,
                            ArrayList<String> nintendoList,
                            ArrayList<String> playStationList,
                            ArrayList<String> xboxList) {

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


