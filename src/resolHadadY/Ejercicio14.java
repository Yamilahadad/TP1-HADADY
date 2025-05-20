package resolHadadY;

public class Ejercicio14 {

    public static void ejecutar() {
        int[][] original = {
                {1, 2, 0, 3, 0, 7},
                {0, 0, 0, 0},
                {0, 6, 9, 8, 0, 9, 6},
                {0, 0, 0, 0, 7, 9, 0, 0},
                {0, 0, 0, 0, 0},
                {8, 7, 0, 8, 9, 0, 8}
        };

        System.out.println("Arreglo original:");
        mostrar(original);

        int filasValidas = 0;
        for (int i = 0; i < original.length; i++) {
            boolean filaSoloCeros = true;
            for (int j = 0; j < original[i].length; j++) {
                if (original[i][j] != 0) {
                    filaSoloCeros = false;
                    break;
                }
            }
            if (!filaSoloCeros) {
                filasValidas++;
            }
        }

        int[][] resultado = new int[filasValidas][];
        int filaResultado = 0;

        for (int i = 0; i < original.length; i++) {
            int cantidadNoCeros = 0;
            for (int j = 0; j < original[i].length; j++) {
                if (original[i][j] != 0) {
                    cantidadNoCeros++;
                }
            }

            if (cantidadNoCeros > 0) {
                resultado[filaResultado] = new int[cantidadNoCeros];
                int idx = 0;
                for (int j = 0; j < original[i].length; j++) {
                    if (original[i][j] != 0) {
                        resultado[filaResultado][idx++] = original[i][j];
                    }
                }
                filaResultado++;
            }
        }

        System.out.println("Arreglo sin ceros y sin filas solo con ceros:");
        mostrar(resultado);
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
