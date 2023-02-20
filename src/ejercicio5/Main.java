package ejercicio5;

import Utility.FileManager;
import ejercicio5.clases.Abogado;
import ejercicio5.clases.Dentista;
import ejercicio5.clases.Ingeniero;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var fileManager = new FileManager();
        final var listaPersonas =
                fileManager.leerFile("src/ejercicio5/input/informacionAmigos.txt");
        var abogadoList = new ArrayList<String>();
        var dentistaList = new ArrayList<String>();
        var ingenieroList = new ArrayList<String>();

        generarData(listaPersonas, dentistaList, abogadoList, ingenieroList);

        fileManager.escribirFile("src/ejercicio5/output/abogados.txt", abogadoList);
        fileManager.escribirFile("src/ejercicio5/output/dentistas.txt", dentistaList);
        fileManager.escribirFile("src/ejercicio5/output/ingenieros.txt", ingenieroList);
    }

    static void generarData(ArrayList<String> fileLeido,
                            ArrayList<String> dentistas,
                            ArrayList<String> abogados,
                            ArrayList<String> ingenieros) {

        for (String string : fileLeido) {
            var persona = new ArrayList<String>();

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

    static Abogado crearAbogado(ArrayList<String> abogado) {
        var nombre = abogado.get(0);
        var apellido = abogado.get(1);
        var edad = abogado.get(2);
        var numJuicioGanados = abogado.get(3);
        var numJuiciosParticipados = abogado.get(4);
        var nombreNotaria = abogado.get(5);

        return new Abogado(nombre, apellido,
                Integer.parseInt(edad),
                Integer.parseInt(numJuicioGanados),
                Integer.parseInt(numJuiciosParticipados),
                nombreNotaria);
    }

    static Dentista crearDentista(ArrayList<String> dentista) {
        var nombre = dentista.get(0);
        var apellido = dentista.get(1);
        var edad = dentista.get(2);
        var numPacientesSinCaries = dentista.get(3);
        var numPacientesTotales = dentista.get(4);
        var nombreConsultorio = dentista.get(5);

        return new Dentista(nombre, apellido,
                Integer.parseInt(edad),
                Integer.parseInt(numPacientesSinCaries),
                Integer.parseInt(numPacientesTotales),
                nombreConsultorio);
    }

    static Ingeniero crearIngeniero(ArrayList<String> ingeniero) {
        var nombre = ingeniero.get(0);
        var apellido = ingeniero.get(1);
        var edad = ingeniero.get(2);
        var numEdificiosConstruidos = ingeniero.get(3);
        var numEdificiosPlanificados = ingeniero.get(4);
        var nombreConstructora = ingeniero.get(5);

        return new Ingeniero(nombre, apellido,
                Integer.parseInt(edad),
                Integer.parseInt(numEdificiosConstruidos),
                Integer.parseInt(numEdificiosPlanificados),
                nombreConstructora);
    }
}
