# Proyecto Ejercicio 1

## Diagrama de Clases

```mermaid
classDiagram
    class Main {
        -main(String[] args) void
    }

    class Persona {
        -nombre: String
        -apellido: String
        -numeroDocumento: int
        -añoNacimiento: int
        +Persona(String, String, int, int)
        +getNombre() String
        +setNombre(String) void
        +getApellido() String
        +setApellido(String) void
        +getNumeroDocumento() int
        +setNumeroDocumento(int) void
        +getAñoNacimiento() int
        +setAñoNacimiento(int) void
        +imprimirDatos() void
    }

    Main --> Persona: crea instancias
```

## Descripción

### Clase Main
Contiene el método `main` que es el punto de entrada de la aplicación. Crea dos instancias de `Persona` y muestra sus datos.

### Clase Persona
Clase que representa una persona con los siguientes atributos:
- **nombre**: Nombre de la persona
- **apellido**: Apellido de la persona
- **numeroDocumento**: Número de documento de identidad
- **añoNacimiento**: Año de nacimiento

Incluye getters y setters para todos los atributos, así como un método `imprimirDatos()` que muestra la información de la persona en la consola.
