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
            {new Persona("Carlos", 16), new Persona("Ana", 25)},
            {new Persona("Luis", 40), new Persona("Beatriz", 20)}
        };

        // Ordenar las filas usando Bubble Sort sin Comparator
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                if (matriz[j][0].edad > matriz[j + 1][0].edad) {
                    // Intercambiar filas
                    Persona[] temp = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = temp;
                }
            }
        }

        // Imprimir matriz ordenada
        for (Persona[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
