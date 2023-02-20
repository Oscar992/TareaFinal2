package ejercicio5.clases;

public class Dentista extends Persona {
    private final int numPacientesSinCaries;
    private final int numPacientesTotales;
    private final String nombreConsultorio;

    public Dentista(String nombre, String apellido, int edad, int numPacientesSinCaries,
                    int numPacientesTotales, String nombreConsultorio) {
        super(nombre, apellido, edad);
        this.numPacientesSinCaries = numPacientesSinCaries;
        this.numPacientesTotales = numPacientesTotales;
        this.nombreConsultorio = nombreConsultorio;
        calcularExito();
    }

    public int getNumPacientesSinCaries() {
        return numPacientesSinCaries;
    }

    public int getNumPacientesTotales() {
        return numPacientesTotales;
    }

    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    @Override
    public void calcularExito() {
        exito = numPacientesSinCaries / numPacientesTotales;
    }
}
