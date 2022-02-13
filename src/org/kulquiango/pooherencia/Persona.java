package org.kulquiango.pooherencia;

public class Persona {
    /*
    protected es usado mas para la herencia, pero es mejor que este privado
    lo pueden acceder las clases que se encuentren dentro del paquete
    */
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}