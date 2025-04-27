package resolHadadY;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();

        int mayusculas = 0, minusculas = 0, digitos = 0;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                digitos++;
            }
        }

        if (contrasena.length() >= 8 && mayusculas >= 2 && minusculas >= 3 && digitos >= 2) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña NO es segura.");
        }
    }
}
