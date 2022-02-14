package org.kulquiango.pooherencia;

public class Profesor extends Persona {
    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public Profesor() {
        System.out.println("Profesor Inicializando constructor");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        this(nombre,apellido);
        this.asignatura = asignatura;
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
