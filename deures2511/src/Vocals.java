/**
 * Created by toni on 09/12/15.
 */

import java.util.Scanner;

public class Vocals {
    public static void main(String[]args){
        int comptador = 0;
        Scanner S = new Scanner(System.in);
        String paraula;
        System.out.println("Introduïu una paraula:");
        paraula = S.next();
        System.out.println("La paraula inserida és: "+paraula);
        for(int x = 0; x < paraula.length(); x++){
            if((paraula.charAt(x) == 'a') || (paraula.charAt(x) == 'e') || (paraula.charAt(x) == 'i') || (paraula.charAt(x) == 'o') || (paraula.charAt(x) == 'u')) {
                comptador++;
            }
        }
        System.out.println("La paraula " + paraula + " conté " + comptador + " vocals");
    }

}
