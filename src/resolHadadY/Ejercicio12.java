package resolHadadY;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio12 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Integer[] numeros = new Integer[5];

        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Números ordenados de mayor a menor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
