/*
 * Crea un programa que calcule quien gana más partidas al piedra, papel, tijera, lagarto, spock.
 * El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * La función recibe un listado que contiene pares, representando cada jugada.
 * El par puede contener combinaciones de "🗿" (piedra), "📄" (papel), "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * Ejemplo:
 * - Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
*/
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        
    }
    
    public static String pedirString(String enunciado){
        Scanner patata = new Scanner(System.in);
        String texto = "";

        try{
            System.out.print(enunciado);
            texto = patata.nextLine().trim();
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        
        return texto;
    }
}