package javaapplication1;

import java.util.Arrays;
import java.util.Comparator;

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
            {new Persona("Carlos", 16), null},
            {new Persona("Luis", 40), new Persona("Beatriz", 20)}
        };

        // Ordenar las filas por la edad de la primera persona en cada fila (sin lambda)
        Arrays.sort(matriz, new Comparator<Persona[]>() {
            @Override
            public int compare(Persona[] fila1, Persona[] fila2) {
                return Integer.compare(fila1[0].edad, fila2[0].edad);
            }
        });

        // Imprimir matriz ordenada
        for (Persona[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
