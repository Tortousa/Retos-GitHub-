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
public class Reto2 {
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		int ganador, contador1 = 0, contador2 = 0;
		String puntos1 = "Love", puntos2 = "Love";
		boolean juegoTerminado = false;

		System.out.println("PARTIDO DE TENIS");
		System.out.println("P1 -- P2");
		
		do{
			System.out.print("Inserta el ganador de la ronda(pulse 1 o 2): ");
			ganador = patata.nextInt();

			if(ganador == 1){
				contador1++;

				if(contador1 == 1){
					puntos1 = "15";
				}
				if(contador1 == 2){
					puntos1 = "30";
				}
				if(contador1 == 3){
					puntos1 = "40";
				}
				if(contador1 >= 4 && contador2 < 3){
					System.out.println("Ha ganado el P1");
					juegoTerminado = true;
					break;
				}
			}else if(ganador == 2){
				contador2++;

				if(contador2 == 1){
					puntos2 = "15";
				}
				if(contador2 == 2){
					puntos2 = "30";
				}
				if(contador2 == 3){
					puntos2 = "40";
				}
				if(contador2 >= 4 && contador1 < 3){
					System.out.println("Ha ganado el P2");
					juegoTerminado = true;
					break;
				}
			}
			if(puntos1.equals("40") && puntos2.equals("40")){
				System.out.println("Deuce");

				do{
					System.out.print("Inserta el ganador de la ronda(pulse 1 o 2): ");
					ganador = patata.nextInt();

					if(ganador == 1){
						contador1++;
		
						if(contador1 - contador2 == 1){
							puntos1 = "Ventaja P1";
							puntos2 = "40";
						}
						else if(contador1 - contador2 == 2){
							System.out.println("Ha ganado el P1");
							juegoTerminado = true;
							break;
						}
						else {
							puntos1 = "40";
							puntos2 = "40";
							System.out.println("Deuce");
						}
					}else if(ganador == 2){
						contador2++;
		
						if(contador2 - contador1 == 1){
							puntos1 = "40";
							puntos2 = "Ventaja P2";
						}
						else if(contador2 - contador1 == 2){
							System.out.println("Ha ganado el P2");
							juegoTerminado = true;
							break;
						}
						else {
							puntos1 = "40";
							puntos2 = "40";
							System.out.println("Deuce");
						}
					}
					System.out.println(puntos1 + " - " + puntos2);
					
				}while(true);
			}
			if(!juegoTerminado){
				System.out.println(puntos1 + " - " + puntos2);
			}

		}while(!juegoTerminado);
    }
}