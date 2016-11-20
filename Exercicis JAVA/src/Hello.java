/**
 * Created by toni on 27/09/16.
 */

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        boolean estiu;
        Scanner s = new Scanner(System.in);
/*        System.out.println("Introdueix el dia: ");
        int dia = s.nextInt();
        System.out.println("Introdueix el mes: ");
        int mes = s.nextInt();

        estiu = ((mes == 6 && dia >= 21) || (mes == 7 || mes == 8) || (mes == 9 && dia <=21));
        System.out.println("El " + dia + " del " + mes + " pertany a l'estiu?: " + estiu);*/


        System.out.println("Quina nota? ");
        int nota = s.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("Introdueix una nota vàlida");
        }
        String ss = (nota >= 5 && nota <= 10) ? "Aprovat" : "Suspès";
        System.out.println(ss);
    }
}