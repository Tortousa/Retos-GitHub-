/*
 * Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class Reto6 {
    public static void main(String[] args) {
        String palabra1 = "Cara";
        String palabra2 = "raca";

        boolean resultado = esAnagrama(palabra1, palabra2);

        System.out.println("Palabra1: " + palabra1 + "\nPalabra2: " + palabra2 + "\nSon anagrama: " + resultado);
    }

    private static char[] stringToChar(String palabra) {
        char[] letra = new char[palabra.length()];

        for(int i = 0; i < palabra.length(); i++) {
            letra[i] = palabra.charAt(i);
        }
        return letra;
    }

    private static boolean esAnagrama(String palabra1, String palabra2) {
        char[] letra1 = stringToChar(palabra1.toLowerCase());
        char[] letra2 = stringToChar(palabra2.toLowerCase());

        if(palabra1.length() != palabra2.length()) {
            return false;
        }

        if(mismaPalabra(letra1, letra2)) {
            return false;
        }

        for(int i = 0; i < palabra1.length(); i++) {
            boolean check = false;

            for(int j = 0; j < palabra2.length(); j++) {
                if(letra1[i] == letra2[j]) {
                    letra2[j] = ' '; //* Marca la letra como usada
                    check = true; //* Se encontró una coincidencia
                    break;
                }
            }
            if(!check) {
                return false;
            }
        }
        return true;
    }

    private static boolean mismaPalabra(char[] letra1, char[] letra2) {
        int contador = letra1.length;

        for(int i = 0; i < letra1.length; i++) {
            if(letra1[i] == letra2[i]) {
                contador--;
            }
        }

        if(contador == 0) {
            return true;
        }
        return false;
    }
}
