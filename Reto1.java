/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 * se caracteriza por sustituir caracteres alfanuméricos.
 * Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 * con el alfabeto y los números en "leet".
 * (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.Scanner;

public class Reto1 {
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		String texto = "";
		char[] letras;
		
		System.out.print("Traducir palabra a leet: ");
		texto = patata.nextLine().toUpperCase();
	
		System.out.print("Palabra: "+texto);
		
		letras = StringToChar(texto);
		
		System.out.print("\nTraduccion: ");
		mostrarTraduccion(letras);

	}
	public static char[] StringToChar(String texto) {
		char[] letras = new char[texto.length()];
		
		for(int i = 0; i<texto.length(); i++) {
			letras[i] = texto.charAt(i);
		}
		return letras;
	}
	public static void mostrarTraduccion(char[] letras) {
		for(int i = 0; i<letras.length; i++) {
			if(letras[i] == 'A') {
				System.out.print("4 ");
			}else if(letras[i] == 'B') {
				System.out.print("I3 ");
			}else if(letras[i] == 'C') {
				System.out.print("{ ");
			}else if(letras[i] == 'D') {
				System.out.print("|} ");
			}else if(letras[i] == 'E') {
				System.out.print("3 ");
			}else if(letras[i] == 'F') {
				System.out.print("|= ");
			}else if(letras[i] == 'G') {
				System.out.print("& ");
			}else if(letras[i] == 'H') {
				System.out.print("# ");
			}else if(letras[i] == 'I') {
				System.out.print("1 ");
			}else if(letras[i] == 'J') {
				System.out.print(",_| ");
			}else if(letras[i] == 'K') {
				System.out.print("1< ");
			}else if(letras[i] == 'L') {
				System.out.print("|_ ");
			}else if(letras[i] == 'M') {
				System.out.print("|V| ");
			}else if(letras[i] == 'N') {
				System.out.print("/V ");
			}else if(letras[i] == 'O') {
				System.out.print("() ");
			}else if(letras[i] == 'P') {
				System.out.print("|O ");
			}else if(letras[i] == 'Q') {
				System.out.print("9 ");
			}else if(letras[i] == 'R') {
				System.out.print("12 ");
			}else if(letras[i] == 'S') {
				System.out.print("$ ");
			}else if(letras[i] == 'T') {
				System.out.print("+ ");
			}else if(letras[i] == 'U') {
				System.out.print("|_| ");
			}else if(letras[i] == 'V') {
				System.out.print("\\/ ");
			}else if(letras[i] == 'W') {
				System.out.print("\\/\\/ ");
			}else if(letras[i] == 'X') {
				System.out.print(">< ");
			}else if(letras[i] == 'Y') {
				System.out.print("j ");
			}else if(letras[i] == 'Z') {
				System.out.print("2 ");
			}else if(letras[i] == '0') { //Numeros
				System.out.print("o ");
			}else if(letras[i] == '1') {
				System.out.print("L ");
			}else if(letras[i] == '2') {
				System.out.print("R ");
			}else if(letras[i] == '3') {
				System.out.print("E ");
			}else if(letras[i] == '4') {
				System.out.print("A ");
			}else if(letras[i] == '5') {
				System.out.print("S ");
			}else if(letras[i] == '6') {
				System.out.print("b ");
			}else if(letras[i] == '7') {
				System.out.print("T ");
			}else if(letras[i] == '8') {
				System.out.print("B ");
			}else if(letras[i] == '9') {
				System.out.print("g ");
			}else if(letras[i] == ' ') {
				System.out.print("  ");
			}else {
				System.out.print("* "); //Valor no admitido
			}
		}
	}
}
