package com.example;

public class Main {
    public static void main(String[] args) {


        Persona persona1 = new Persona("Juan", "Pérez", 12345678, 1990);
        Persona persona2 = new Persona("María", "Gómez", 87654321, 1985);

        System.out.println("Datos de la persona 1:");
        persona1.imprimirDatos();

        System.out.println("\nDatos de la persona 2:");
        persona2.imprimirDatos();
        
    }
}