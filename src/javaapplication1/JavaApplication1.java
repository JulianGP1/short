package javaapplication1;

import java.util.Arrays;

class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

public class JavaApplication1 {
    public static void main(String[] args) {
        Persona[][] matriz = {
            {new Persona("Carlos", 19), new Persona("Ana", 25)},
            {new Persona("Luis", 40), new Persona("Beatriz", 20)}
        };

        // Ordenar las filas por la edad de la primera persona en cada fila
        Arrays.sort(matriz, (fila1, fila2) -> Integer.compare(fila1[0].edad, fila2[0].edad));

        // Imprimir matriz ordenada
        for (Persona[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
