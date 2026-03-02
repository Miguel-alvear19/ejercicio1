package com.example;

public class Persona {

    private String nombre;
    private String apellido;
    private int numeroDocumento;
    private int añoNacimiento;

    public Persona(String nombre, String apellido, int numeroDocumento, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.añoNacimiento = añoNacimiento;
    }

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

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }


    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Documento: " + numeroDocumento);
        System.out.println("Año de Nacimiento: " + añoNacimiento);
    }


    public int calcularEdad(int añoActual) {
        return añoActual - añoNacimiento;
    }


}