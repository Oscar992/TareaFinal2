package ejercicio5.clases;

public class Dentista extends Persona {
    private final double numPacientesSinCaries;
    private final double numPacientesTotales;
    private final String nombreConsultorio;

    public Dentista(String nombre, String apellido, int edad, double numPacientesSinCaries,
                    double numPacientesTotales, String nombreConsultorio) {
        super(nombre, apellido, edad);
        this.numPacientesSinCaries = numPacientesSinCaries;
        this.numPacientesTotales = numPacientesTotales;
        this.nombreConsultorio = nombreConsultorio;
        calcularExito();
    }

    public double getNumPacientesSinCaries() {
        return numPacientesSinCaries;
    }

    public double getNumPacientesTotales() {
        return numPacientesTotales;
    }

    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    @Override
    public void calcularExito() {
        exito = (numPacientesSinCaries / numPacientesTotales) * 100;
    }
}
