package resolHadadY;

import java.util.Scanner;

public class Ejercicio8 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de temperatura:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese grados Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Equivalen a " + fahrenheit + " °F");
        } else if (opcion == 2) {
            System.out.print("Ingrese grados Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Equivalen a " + celsius + " °C");
        } else {
            System.out.println("Opción inválida.");
        }
    }
}
