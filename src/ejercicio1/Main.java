package ejercicio1;

import Utility.FileManager;
import ejercicio1.clases.Circulo;
import ejercicio1.clases.Color;
import ejercicio1.clases.Cuadrado;
import ejercicio1.clases.FiguraGeometrica;
import ejercicio1.clases.Triangulo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var fileManager = new FileManager();
        final var listaColores = fileManager.leerFile("src/Ejercicio1/input/colores.txt");
        final var listaFiguras = fileManager.leerFile("src/Ejercicio1/input/figuras.txt");

        var outputList = new ArrayList<String>();
        var mapaColores = crearColoresMap(listaColores);

        outputList = generarData(listaFiguras, mapaColores);

        fileManager.escribirFile("src/ejercicio1/output/output.txt", outputList);
    }

    static HashMap<String, String> crearColoresMap(ArrayList<String> lista) {
        HashMap<String, String> map = new HashMap<>();
        for (String string : lista) {
            var color = Arrays.asList(string.split(","));
            var nombre = color.get(0);
            var codigo = color.get(1);
            map.put(nombre, codigo);
        }
        return map;
    }

    static ArrayList<String> generarData(ArrayList<String> listaFiguras, HashMap<String, String> map) {

        ArrayList outputList = new ArrayList<String>();

        for (String string : listaFiguras) {
            var figura = Arrays.asList(string.split(","));
            var colorRelleno = new Color(figura.get(0), map.get(figura.get(0)));
            var colorBorde = new Color(figura.get(1), map.get(figura.get(1)));

            FiguraGeometrica objFigura = null;

            switch (figura.get(6)) {
                case "CIRCULO":
                    objFigura = generarCirculo(Double.parseDouble(figura.get(3)), colorRelleno, colorBorde,
                            Integer.parseInt(figura.get(2)));
                    break;
                case "CUADRADO":
                    objFigura = generarCuadrado(Double.parseDouble(figura.get(3)), colorRelleno, colorBorde,
                            Integer.parseInt(figura.get(2)));
                    break;
                case "TRIANGULO":
                    objFigura = generarTriangulo(Double.parseDouble(figura.get(3)),
                            Double.parseDouble(figura.get(4)),
                            Double.parseDouble(figura.get(5)),
                            colorRelleno, colorBorde,
                            Integer.parseInt(figura.get(2)));
            }
            outputList.add(objFigura.colorearFigura());
        }
        return outputList;
    }

    static Circulo generarCirculo(Double radio, Color relleno, Color borde, Integer grosorLinea) {
        final var circulo = new Circulo(radio, relleno, borde, grosorLinea);

        circulo.calcularArea();
        circulo.calcularPerimetro();

        return circulo;
    }

    static Cuadrado generarCuadrado(Double lado, Color relleno, Color borde, Integer grosorLinea) {
        final var cuadrado = new Cuadrado(lado, relleno, borde, grosorLinea);

        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();

        return cuadrado;
    }

    static Triangulo generarTriangulo(Double lado1, Double lado2, Double lado3, Color relleno, Color borde,
                                      Integer grosorLinea) {
        final var triangulo = new Triangulo(lado1, lado2, lado3, relleno, borde, grosorLinea);

        triangulo.calcularArea();
        triangulo.calcularPerimetro();

        return triangulo;
    }
}
