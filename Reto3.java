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
        String contraseña;
        boolean check = false;

        do{
            contraseña = pedirString("Inserta una contraseña: ");

            if(longitudContraseña(contraseña) == true){
                check = true;
            }
        }while(!check);


        
    }
    public static String pedirString(String enunciado){
        String contraseña = "";

        System.out.print(enunciado);
        contraseña = patata.nextLine().trim();

        return contraseña;
    }
    public static boolean longitudContraseña(String contraseña){
        boolean check = false;
        for(int i = 0; i < contraseña.length(); i++){
            if(i>=8 && i<=16){
                return true;
            }else{
                return false;
            }
        }
        return check;
    }
}
