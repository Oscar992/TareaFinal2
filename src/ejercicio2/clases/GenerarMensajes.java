package ejercicio2.clases;

public class GenerarMensajes {
    public static String crearMensaje(Cubo cubo) {
        return String.format("Cubo %n Informacion:" +
                cubo.toString() + "%n Area: " +
                cubo.calcularArea() + "%n Volumen" +
                cubo.calcularVolumen());
    }

    public static String crearMensaje(Cilindro cilindro) {
        return String.format("Cilindro %n Informacion:" +
                cilindro.toString() + "%n Area: " +
                cilindro.calcularArea() + "%n Volumen" +
                cilindro.calcularVolumen());
    }

    public static String crearMensaje(Cono cono) {
        return String.format("Cono %n Informacion:" +
                cono.toString() + "%n Area: " +
                cono.calcularArea() + "%n Volumen" +
                cono.calcularVolumen());
    }

    public static String crearMensaje(Esfera esfera) {
        return String.format("Esfera %n Informacion:" +
                esfera.toString() + "%n Area: " +
                esfera.calcularArea() + "%n Volumen" +
                esfera.calcularVolumen());
    }
}
