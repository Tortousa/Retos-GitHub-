/*
 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        int n;

        n = pedirInt("Introduce un entero: ");

        if (esPar(n) == true) {
            System.out.println("Numero " + n + " es PAR.");
        }
        if (esPrimo(n) == true) {
            System.out.println("Numero " + n + " es PRIMO.");
        }
        if (esFibonacci(n) == true) {
            System.out.println("Numero " + n + " es FIBONACCI.");
        }
    }

    public static int pedirInt(String enunciado) {
        Scanner patata = new Scanner(System.in);
        int n = 0;
        boolean check = false;

        do {
            System.out.print(enunciado);

            try {
                n = Integer.parseInt(patata.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println("No has introducido un numero. Vuelve a intentarlo.");
            }
        } while (!check);

        return n;
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Si encontramos un divisor distinto de 1 y n, no es primo
            }
        }
        return true; // Si no encontramos divisores, el número es primo
    }

    public static boolean esFibonacci(int n) {
        return esCuadradoPerfecto(5 * n * n + 4) || esCuadradoPerfecto(5 * n * n - 4);
    }

    public static boolean esCuadradoPerfecto(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x; // Si el cuadrado del entero más cercano es igual a x, entonces x es un cuadrado perfecto
    }

    public static boolean esPar(int n) {
        return (n % 2 == 0) ? true : false;
    }
}
