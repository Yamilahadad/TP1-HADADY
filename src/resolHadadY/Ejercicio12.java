package resolHadadY;

import java.util.Scanner;

public class Ejercicio12 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números ordenados de mayor a menor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
