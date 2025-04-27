package resolHadadY;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        String reverso = new StringBuilder(palabra).reverse().toString();
        if (palabra.equalsIgnoreCase(reverso)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
}
