package resolHadadY;

import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }
}
