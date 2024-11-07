/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */

import java.util.Scanner;

public class Reto3 {
    
    public static Scanner patata = new Scanner(System.in);
    
    public static void main(String[] args) {
        String contraseña = ""
            
        do{
            contraseña = pedirString("Inserta una contraseña: ");

            if(longitud(contraseña) != true){
                System.out.println("Contraseña no cumple los parametros. Vuelve a intentarlo.");
            }else{
                System.out.println("Tu contraseña es: " + contraseña);
                break;
            }
            /*if(){

            }
            */
        }while(true);    
    }
    public static String pedirString(String enunciado){
        String contraseña = "";

        System.out.print(enunciado);
        contraseña = patata.nextLine().trim();

        return contraseña;
    }
    public static boolean longitud(String contraseña){
        for(int i = 1; i < contraseña.length(); i++){
            if(i > 7 && i < 17){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean conMayusculas(String contraseña){
        
    }
    public static boolean conNumeros(String contraseña){
        
    }
    public static boolean conSimbolos(String contraseña){
        
    }
}
