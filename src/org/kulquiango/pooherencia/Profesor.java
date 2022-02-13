package org.kulquiango.pooherencia;

public class Profesor extends Persona {
    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        StringBuilder datosProfesor = new StringBuilder();
        datosProfesor.append("\t" + "Datos del Profesor" + "\n")
                .append("Nombre: " + this.getNombre() + "\n")
                .append("Apellido: " + this.getApellido() + "\n")
                .append("Asignatura: " + this.getAsignatura() + "\n");
        return datosProfesor.toString();
    }
}
