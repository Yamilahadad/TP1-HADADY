package resolHadadY;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio6 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número (entre 1 y 100)");

        do {
            System.out.print("Ingresa tu número: ");
            intento = sc.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Más alto!");
            } else if (intento > numeroSecreto) {
                System.out.println("Más bajo!");
            } else {
                System.out.println("¡Correcto!");
            }
        } while (intento != numeroSecreto);
    }
}
