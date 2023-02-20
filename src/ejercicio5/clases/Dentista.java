package ejercicio5.clases;

public class Dentista extends Persona {
    Integer numPacientesSinCaries;
    Integer numPacientesTotales;
    String nombreConsultorio;

    public Dentista(String nombre, String apellido, Integer edad, Integer numPacientesSinCaries,
                    Integer numPacientesTotales, String nombreConsultorio) {
        super(nombre, apellido, edad);
        this.numPacientesSinCaries = numPacientesSinCaries;
        this.numPacientesTotales = numPacientesTotales;
        this.nombreConsultorio = nombreConsultorio;
        calcularExito();
    }

    public Integer getNumPacientesSinCaries() {
        return numPacientesSinCaries;
    }

    public Integer getNumPacientesTotales() {
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
