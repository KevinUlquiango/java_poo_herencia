package org.kulquiango.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String toString() {
        StringBuilder datosDelAlumno = new StringBuilder();
        datosDelAlumno.append("\t" + "Datos del Alumno" +  "\n")
                .append("Nombre: " + this.getNombre() + "\n")
                .append("Apellido: " + this.getApellido() + "\n")
                .append("Institucion: " + this.institucion + "\n")
                .append("Nota"+ "\n")
                .append("\t" + "Matematicas: " + this.notaMatematica + "\n")
                .append("\t" + "Castelllano: " + this.notaCastellano + "\n")
                .append("\t" + "Historia: " + this.notaHistoria + "\n");
        return datosDelAlumno.toString();
    }
}
