/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 * 
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.   
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
 */
import java.util.Scanner;
import java.lang.Math;

public class Reto2 {
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		
		int p1, p2;
		String finalizar;
		boolean check = false;
		int ronda = 1;
		
		do {
			p1 = generarRandom();
			p2 = generarRandom();
			
			System.out.println("P1 - P2");
			
			boolean ganadorRonda = comparar(p1,p2);
				
			
			
			System.out.print("\nPulse cualquier tecla para jugar la siguiente ronda (fin: N): ");
			finalizar = patata.nextLine().trim();
			
			if(finalizar.equalsIgnoreCase("N")) {
				System.out.println("Se cancela el partido");
				break;
			}else {
				System.out.println("Siguiente ronda");
				ronda++;
				continue;
			}
			
		}while(!check);
	}
	public static boolean comparar(int p1, int p2) {
		boolean ganadorP1 = true;
		boolean iguales = false;
		
		do {
			if(p1>p2) {
				ganadorP1 = true;
				iguales = true;
			}else if(p2>p1) {
				ganadorP1 = false;
				iguales= true;
			}else {
				continue;
			}
		}while(!iguales);
		return ganadorP1;
	}
	public static int generarRandom() {
		int numero = 0;
		
		numero = (int)(Math.random()*100);
		
		return numero;
	}
}
