/**
 * Created by toni on 11/01/16.
 */

import java.util.Arrays;
import java.util.Scanner;


public class Vigenere {

    public static void main(String[]args){

        String message = "AVUI PLOU", password ="LICEU";
        encode(message,password);
        decode(message,password);
        System.out.println("Plaintext: " + (int)(' '));
    }

    public static String encode(String message, String password) {

        for (int i = 0; i < message.length(); i++){
            for (int j = 0; j < password.length(); j++){
                if( j == password.length()) {
                j = 0;
                }
            }
        }

        return message;
    }


    public static String decode(String message, String password){

        return message;
    }
}