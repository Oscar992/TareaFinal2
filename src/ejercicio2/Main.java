package ejercicio2;

import Utility.Aleatorio;
import Utility.FileManager;
import ejercicio2.clases.Cilindro;
import ejercicio2.clases.Cono;
import ejercicio2.clases.Cubo;
import ejercicio2.clases.Esfera;
import ejercicio2.clases.GenerarMensajes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final var cubo = new Cubo(Aleatorio.generarRandomDouble(50, 100));

        final var cilindro = new Cilindro(Aleatorio.generarRandomDouble(50, 100),
                Aleatorio.generarRandomDouble(50, 100));

        final var cono = new Cono(Aleatorio.generarRandomDouble(50, 100), Aleatorio.generarRandomDouble(50, 100),
                Aleatorio.generarRandomDouble(50, 100));

        final var esfera = new Esfera(Aleatorio.generarRandomDouble(50, 100));

        final var listaFinal = new ArrayList<String>();

        listaFinal.add(GenerarMensajes.crearMensaje(cubo));
        listaFinal.add(GenerarMensajes.crearMensaje(cilindro));
        listaFinal.add(GenerarMensajes.crearMensaje(cono));
        listaFinal.add(GenerarMensajes.crearMensaje(esfera));

        FileManager.escribirFile("src/ejercicio2/output/output.txt", listaFinal);
    }
}
