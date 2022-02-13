package org.kulquiango.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String toString() {
        StringBuilder datosDelAlumnoInternacional = new StringBuilder();
        datosDelAlumnoInternacional.append("\t" + "Datos del Alumno Internacinal" +  "\n")
                .append("Nombre: " + this.getNombre() + "\n")
                .append("Apellido: " + this.getApellido() + "\n")
                .append("Institucion: " + this.getInstitucion() + "\n")
                .append("Pais de Origen: " + this.pais + "\n")
                .append("Nota"+ "\n")
                .append("\t" + "Matematicas: " + this.getNotaMatematica() + "\n")
                .append("\t" + "Castelllano: " + this.getNotaCastellano() + "\n")
                .append("\t" + "Idiomas: " + this.notaIdiomas + "\n")
                .append("\t" + "Historia: " + this.getNotaHistoria() + "\n");
        return datosDelAlumnoInternacional.toString();
    }
}
