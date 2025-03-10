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
        String array[] = new String[2];

        for(int i = 0; i < array.length; i++){
            array[i] = pedirString("Inserta una opcion (piedra, papel, tijera, lagarto o spock): ");
        }
        
        mostrarArray(array);
        
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

    public static void mostrarArray(String[] array){
        for (String i : array) {
            System.out.print(i + " ");
        }
    }

    public int victoria(String[] array){
        int contadorP1 = 0, contadorP2 = 0;

        for(int i = 0; i < array.length; i++){
            if(array[0].equalsIgnoreCase(array[1])){
                contadorP1++;
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("piedra") && array[1].equalsIgnoreCase("tijera")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("piedra") && array[1].equalsIgnoreCase("papel")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("piedra") && array[1].equalsIgnoreCase("lagarto")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("piedra") && array[1].equalsIgnoreCase("spock")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("papel") && array[1].equalsIgnoreCase("piedra")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("papel") && array[1].equalsIgnoreCase("tijera")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("papel") && array[1].equalsIgnoreCase("lagarto")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("papel") && array[1].equalsIgnoreCase("spock")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("tijera") && array[1].equalsIgnoreCase("piedra")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("tijera") && array[1].equalsIgnoreCase("papel")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("tijera") && array[1].equalsIgnoreCase("lagarto")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("tijera") && array[1].equalsIgnoreCase("spock")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("lagarto") && array[1].equalsIgnoreCase("piedra")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("lagarto") && array[1].equalsIgnoreCase("papel")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("lagarto") && array[1].equalsIgnoreCase("tijera")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("lagarto") && array[1].equalsIgnoreCase("spock")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("spock") && array[1].equalsIgnoreCase("piedra")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("spock") && array[1].equalsIgnoreCase("papel")) {
                contadorP2++;
            } else if(array[0].equalsIgnoreCase("spock") && array[1].equalsIgnoreCase("tijera")) {
                contadorP1++;
            } else if(array[0].equalsIgnoreCase("spock") && array[1].equalsIgnoreCase("lagarto")) {
                contadorP2++;
            }
        }
    }
}
