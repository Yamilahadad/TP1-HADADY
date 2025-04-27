package resolHadadY;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el ejercicio a ejecutar (1 al 14): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar(args);
                break;
            case 2:
                Ejercicio2.ejecutar();
                break;
            case 3:
                Ejercicio3.ejecutar();
                break;
            case 4:
                Ejercicio4.ejecutar();
                break;
            case 5:
                Ejercicio5.ejecutar();
                break;
            case 6:
                Ejercicio6.ejecutar();
                break;
            case 7:
                Ejercicio7.ejecutar();
                break;
            case 8:
                Ejercicio8.ejecutar();
                break;
            case 9:
                Ejercicio9.ejecutar();
                break;
            case 10:
                Ejercicio10.ejecutar();
                break;
            case 11:
                Ejercicio11.ejecutar();
                break;
            case 12:
                Ejercicio12.ejecutar();
                break;
            case 13:
                Ejercicio13.ejecutar();
                break;
            case 14:
                Ejercicio14.ejecutar();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}
