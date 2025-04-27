package resolHadadY;

import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese primer número: ");
                    int a = sc.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Ingrese primer número: ");
                    int c = sc.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    int d = sc.nextInt();
                    System.out.println("Resultado: " + (c - d));
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}
