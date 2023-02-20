package ejercicio5;

import Utility.FileManager;
import ejercicio5.clases.Abogado;
import ejercicio5.clases.Dentista;
import ejercicio5.clases.Ingeniero;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final var listaPersonas =
                FileManager.leerFile("src/ejercicio5/input/informacionAmigos.txt");

        final var abogadoList = new ArrayList<String>();
        final var dentistaList = new ArrayList<String>();
        final var ingenieroList = new ArrayList<String>();

        generarData(listaPersonas, dentistaList, abogadoList, ingenieroList);

        FileManager.escribirFile("src/ejercicio5/output/abogados.txt", abogadoList);
        FileManager.escribirFile("src/ejercicio5/output/dentistas.txt", dentistaList);
        FileManager.escribirFile("src/ejercicio5/output/ingenieros.txt", ingenieroList);
    }

    private static void generarData(List<String> fileLeido,
                                    List<String> dentistas,
                                    List<String> abogados,
                                    List<String> ingenieros) {

        for (String string : fileLeido) {

            final var persona = new ArrayList<String>();

            for (var i = 0; i < string.split(",").length; i++) {
                persona.add(string.split(",")[i]);
            }

            switch (persona.get(6)) {
                case "ABOGADO":
                    var abogado = crearAbogado(persona);
                    abogados.add(abogado.toString());
                    break;
                case "INGENIERO":
                    var ingeniero = crearIngeniero(persona);
                    ingenieros.add(ingeniero.toString());
                    break;
                case "DENTISTA":
                    var dentista = crearDentista(persona);
                    dentistas.add(dentista.toString());
            }
        }
    }

    private static Abogado crearAbogado(List<String> abogado) {
        final var nombre = abogado.get(0);
        final var apellido = abogado.get(1);
        final var edad = abogado.get(2);
        final var numJuicioGanados = abogado.get(3);
        final var numJuiciosParticipados = abogado.get(4);
        final var nombreNotaria = abogado.get(5);

        return new Abogado(nombre, apellido,
                Integer.parseInt(edad),
                Integer.parseInt(numJuicioGanados),
                Integer.parseInt(numJuiciosParticipados),
                nombreNotaria);
    }

    private static Dentista crearDentista(List<String> dentista) {
        final var nombre = dentista.get(0);
        final var apellido = dentista.get(1);
        final var edad = dentista.get(2);
        final var numPacientesSinCaries = dentista.get(3);
        final var numPacientesTotales = dentista.get(4);
        final var nombreConsultorio = dentista.get(5);

        return new Dentista(nombre, apellido,
                Integer.parseInt(edad),
                Integer.parseInt(numPacientesSinCaries),
                Integer.parseInt(numPacientesTotales),
                nombreConsultorio);
    }

    private static Ingeniero crearIngeniero(List<String> ingeniero) {
        final var nombre = ingeniero.get(0);
        final var apellido = ingeniero.get(1);
        final var edad = ingeniero.get(2);
        final var numEdificiosConstruidos = ingeniero.get(3);
        final var numEdificiosPlanificados = ingeniero.get(4);
        final var nombreConstructora = ingeniero.get(5);

        return new Ingeniero(nombre, apellido,
                Integer.parseInt(edad),
                Integer.parseInt(numEdificiosConstruidos),
                Integer.parseInt(numEdificiosPlanificados),
                nombreConstructora);
    }
}
