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
		
		int p1, p2, player1 = 0, player2 = 0;
		String finalizar;
		boolean check = false;
		
		System.out.println("P1 - P2");

		do {
			p1 = generarRandom();
			p2 = generarRandom();

			System.out.println(p1 + " / " + p2);
				
			if(ganador(p1, p2) == true){
				player1 += 15;
			}else{
				player2 += 15;
			}

			if(player1 > 30){
				player1 -= 5;
			}else if(player2 > 30){
				player2 -= 5;
			}
			
			if(player1 > 40){
				player1 = Integer.parseInt("Deuce");
			}else if(player2 > 40){
				player2 = Integer.parseInt("Deuce");
			}

			System.out.println(player1 + " - " + player2);

			System.out.print("\nPulse cualquier tecla para jugar la siguiente ronda (fin: N): ");
			finalizar = patata.nextLine().trim();
			
			if(finalizar.equalsIgnoreCase("N")) {
				System.out.println("Se cancela el partido");
				break;
			}
		}while(!check);
	}
	public static boolean ganador(int p1, int p2) {
		while(true){
			if(p1>p2) {
				return true;
			}else if(p1<p2) {
				return false;
			}else{
				p1 = generarRandom();
				p2 = generarRandom();
			}
		}
	}
	public static int generarRandom() {
		return (int)(Math.random()*100);
	}
}
