package resolHadadY;

import java.util.ArrayList;

public class Ejercicio14 {
    public static void ejecutar() {
        int[][] arreglo = {
                {1, 2, 0, 3, 0, 7},
                {0, 0, 0, 0},
                {0, 6, 9, 8, 0, 9, 6},
                {0, 0, 0, 0, 7, 9, 0, 0},
                {0, 0, 0, 0, 0},
                {8, 7, 0, 8, 9, 0, 8}
        };

        System.out.println("Arreglo original:");
        mostrar(arreglo);

        ArrayList<int[]> nuevoArreglo = new ArrayList<>();

        for (int[] fila : arreglo) {
            int contadorCeros = 0;
            for (int num : fila) {
                if (num == 0) {
                    contadorCeros++;
                }
            }
            if (contadorCeros != fila.length) {
                ArrayList<Integer> nuevaFila = new ArrayList<>();
                for (int num : fila) {
                    if (num != 0) {
                        nuevaFila.add(num);
                    }
                }
                int[] nuevaFilaArray = nuevaFila.stream().mapToInt(i -> i).toArray();
                nuevoArreglo.add(nuevaFilaArray);
            }
        }

        System.out.println("\nArreglo sin ceros:");
        for (int[] fila : nuevoArreglo) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void mostrar(int[][] arreglo) {
        for (int[] fila : arreglo) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
