package resolHadadY;

import java.util.Scanner;

public class Ejercicio11 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el término n de Fibonacci: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
