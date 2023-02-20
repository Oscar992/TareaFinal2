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
        final var listaColores = FileManager.leerFile("src/Ejercicio1/input/colores.txt");
        final var listaFiguras = FileManager.leerFile("src/Ejercicio1/input/figuras.txt");

        final var outputList = new ArrayList<String>();
        final var mapaColores = crearColoresMap(listaColores);

        outputList = generarData(listaFiguras, mapaColores);

        FileManager.escribirFile("src/ejercicio1/output/output.txt", outputList);
    }

    private static Map<String, String> crearColoresMap(List<String> lista) {
        HashMap<String, String> map = new HashMap<>();
        for (String string : lista) {
            final var color = Arrays.asList(string.split(","));
            final var nombre = color.get(0);
            final var codigo = color.get(1);
            map.put(nombre, codigo);
        }
        return map;
    }

    private static List<String> generarData(List<String> listaFiguras, Map<String, String> map) {

        final var ArrayList outputList = new ArrayList<String>();

        for (String string : listaFiguras) {
            final var figura = Arrays.asList(string.split(","));
            final var colorRelleno = new Color(figura.get(0), map.get(figura.get(0)));
            final var colorBorde = new Color(figura.get(1), map.get(figura.get(1)));

            FiguraGeometrica objFigura = null;

            switch (figura.get(6)) {
                case "CIRCULO":
                    outputList.add(generarCirculo(Double.parseDouble(figura.get(3)), colorRelleno, colorBorde,
                            Integer.parseInt(figura.get(2))));
                    break;
                case "CUADRADO":
                    outputList.add(generarCuadrado(Double.parseDouble(figura.get(3)), colorRelleno, colorBorde,
                            Integer.parseInt(figura.get(2))));
                    break;
                case "TRIANGULO":
                    outputList.add(generarTriangulo(Double.parseDouble(figura.get(3)),
                            Double.parseDouble(figura.get(4)),
                            Double.parseDouble(figura.get(5)),
                            colorRelleno, colorBorde,
                            Integer.parseInt(figura.get(2))));
            }
        }
        return outputList;
    }

    private static Circulo generarCirculo(double radio, Color relleno, Color borde, int grosorLinea) {
        final var circulo = new Circulo(radio, relleno, borde, grosorLinea);

        circulo.calcularArea();
        circulo.calcularPerimetro();

        return circulo;
    }

    private static Cuadrado generarCuadrado(double lado, Color relleno, Color borde, int grosorLinea) {
        final var cuadrado = new Cuadrado(lado, relleno, borde, grosorLinea);

        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();

        return cuadrado;
    }

    private static Triangulo generarTriangulo(double lado1, Double lado2, double lado3, Color relleno, Color borde,
                                              int grosorLinea) {
        final var triangulo = new Triangulo(lado1, lado2, lado3, relleno, borde, grosorLinea);

        triangulo.calcularArea();
        triangulo.calcularPerimetro();

        return triangulo;
    }
}
