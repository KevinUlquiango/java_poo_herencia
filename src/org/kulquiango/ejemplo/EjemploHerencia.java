package org.kulquiango.ejemplo;

import org.kulquiango.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Kevin");
        alumno.setApellido("Ulquiango");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
       alumnoInternacional.setNombre("Peter");
       alumnoInternacional.setApellido("Parker");
       alumnoInternacional.setPais("Australia");
       alumnoInternacional.setEdad(15);
       alumnoInternacional.setInstitucion("Instituto Nacional");
       alumnoInternacional.setNotaIdiomas(6.8);
       alumnoInternacional.setNotaCastellano(6.2);
       alumnoInternacional.setNotaHistoria(5.8);
       alumnoInternacional.setNotaMatematica(6.5);

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");

        /*Para conocer la herencia*/
        /*
        org.kulquiango.pooherencia.AlumnoInternacional es una clase hija de la clase padre org.kulquiango.pooherencia.Alumno
        org.kulquiango.pooherencia.Alumno es una clase hija de la clase padre org.kulquiango.pooherencia.Persona
        org.kulquiango.pooherencia.Persona es una clase hija de la clase padre java.lang.Object
        */
        Class clase = alumnoInternacional.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println(alumno);
        System.out.println(profesor);
        System.out.println(alumnoInternacional);
        System.out.println("-----------------------------------------------------------------");
//        StringBuilder datosImprimir = new StringBuilder();
//        datosImprimir
//                .append("Alumno " + alumno.getNombre() + " " + alumno.getApellido() + "\n")
//                .append("Profesor: " + profesor.getNombre() + " " + profesor.getApellido());
//        System.out.println(datosImprimir);


    }

}
