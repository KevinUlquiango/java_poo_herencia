package org.kulquiango.pooherencia;

public final class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("AlumnoInternacional Inicializando constructor");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        this(nombre, apellido);
        this.pais = pais;
    }

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
        String datosPersonales = super.toString();
        StringBuilder datosDelAlumnoInternacional = new StringBuilder();
        datosDelAlumnoInternacional.append(datosPersonales)
                .append("\t" + "Idiomas: " + this.notaIdiomas + "\n")
                .append("Pais de Origen: " + this.pais + "\n");

        return datosDelAlumnoInternacional.toString();
    }

    @Override
    public String saludar() {
        return "Hola soy un alumno extrangero del pais " + getPais() + ", mi nombre es " + getNombre();
    }

    @Override
    public double calcularPromedio() {
        double calificaciones = super.calcularPromedio() *3 ;
        return (calificaciones + notaIdiomas)/4;
    }
}
