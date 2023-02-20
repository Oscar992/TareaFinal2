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

        var aleatorio = new Aleatorio();
        var fileManager = new FileManager();

        Cubo cubo = new Cubo(aleatorio.generarRandomDouble(50, 100));
        Cilindro cilindro = new Cilindro(aleatorio.generarRandomDouble(50, 100), aleatorio.generarRandomDouble(50, 100));
        Cono cono = new Cono(aleatorio.generarRandomDouble(50, 100), aleatorio.generarRandomDouble(50, 100), aleatorio.generarRandomDouble(50, 100));
        Esfera esfera = new Esfera(aleatorio.generarRandomDouble(50, 100));

        var listaFinal = new ArrayList<String>();

        listaFinal.add(GenerarMensajes.crearMensaje(cubo));
        listaFinal.add(GenerarMensajes.crearMensaje(cilindro));
        listaFinal.add(GenerarMensajes.crearMensaje(cono));
        listaFinal.add(GenerarMensajes.crearMensaje(esfera));

        fileManager.escribirFile("src/ejercicio2/output/output.txt", listaFinal);
    }
}
