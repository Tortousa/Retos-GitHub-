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
        String passwd = "";
            
        do{
            passwd = pedirString("Inserta una contraseña: ");

            if(longitud(passwd) != true || conMayusculas(passwd) != true || conNumeros(passwd) != true || conSimbolos(passwd) != true){
                System.out.println("Contraseña no cumple los parametros. Vuelve a intentarlo.");
            }
            else{
                System.out.println("Tu contraseña es: " + passwd);
                break;
            }
        }while(true);    
    }
    public static String pedirString(String enunciado){
        String passwd = "";

        System.out.print(enunciado);
        passwd = patata.nextLine().trim();

        return passwd;
    }
    public static boolean longitud(String passwd){
        return passwd.length() >= 8 && passwd.length() <= 16;
    }
    public static boolean conMayusculas(String passwd){
        for(int i = 0; i < passwd.length(); i++){
            if(Character.isUpperCase(passwd.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean conNumeros(String passwd){
        for(int i = 0; i < passwd.length(); i++){
            if(Character.isDigit(passwd.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean conSimbolos(String passwd){
        for(int i = 0; i < passwd.length(); i++){
            if(!Character.isDigit(passwd.charAt(i)) && !Character.isLetter(passwd.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
