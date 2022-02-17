package org.kulquiango.ejemplo;

import org.kulquiango.pooherencia.Alumno;
import org.kulquiango.pooherencia.AlumnoInternacional;
import org.kulquiango.pooherencia.Persona;
import org.kulquiango.pooherencia.Profesor;
import org.w3c.dom.ls.LSOutput;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Kevin", "Ulquiango", 20, "ESPE", 10, 10, 10);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Parker", "Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(40);
        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);
        System.out.println();
        System.out.println();
        System.out.println(alumno);
        System.out.println(profesor);
        System.out.println(alumnoInternacional);
    }

    public static void imprimir(Persona persona) {
        String imprimir = null;
        String imprimirSobreEscritura = null;
        StringBuilder imprimirDatosDePersona = new StringBuilder();

        imprimirDatosDePersona.append("Nombre: " + persona.getNombre() + "\n")
                .append("Apellido: " + persona.getApellido() + "\n")
                .append("Edad: " + persona.getEdad() + "\n")
                .append("Email: " + persona.getEmail() + "\n");
        imprimir = imprimirDatosDePersona.toString();

        if (persona instanceof Alumno) {
            StringBuilder datosDelAlumno = new StringBuilder();
            datosDelAlumno.append("Institucion: " + ((Alumno) persona).getInstitucion() + "\n")
                    .append("Nota Matematicas: " + ((Alumno) persona).getNotaMatematica() + "\n")
                    .append("Notas Historia: " + ((Alumno) persona).getNotaHistoria() + "\n")
                    .append("Nota Castellano: " + ((Alumno) persona).getNotaCastellano() + "\n");
            imprimir += datosDelAlumno;

            if (persona instanceof AlumnoInternacional) {
                StringBuilder datosAlumnoInternacional = new StringBuilder();
                datosAlumnoInternacional.append("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas() + "\n")
                        .append("Pais: " + ((AlumnoInternacional) persona).getPais() + "\n");
                imprimir += datosAlumnoInternacional;


            }
            imprimirSobreEscritura = sobreEscritura(persona);
        }

        if (persona instanceof Profesor) {
            String datosProfesor = "Asignatura: " + ((Profesor) persona).getAsignatura();
            imprimir += datosProfesor;
        }

        System.out.println(imprimir);
        System.out.println("========Sobre escritura saludar=======");
        System.out.println(persona.saludar());
        System.out.println("========Sobre escritura saludar=======");
        if (persona instanceof Alumno){
            System.out.println(imprimirSobreEscritura);
        }


    }

    public static String sobreEscritura(Persona persona) {
        StringBuilder imprimir = new StringBuilder();
        imprimir.append("========Sobre escritura calcularPromedio=======\n")
                .append(((Alumno)persona).calcularPromedio() + "\n")
                .append("========Sobre escritura calcularPromedio=======\n");
        return imprimir.toString();
    }



}
