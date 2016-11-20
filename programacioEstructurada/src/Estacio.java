/**
 * Created by toni on 06/10/16.
 */

import java.util.Scanner;

public class Estacio {

    //Variables de classe
    static Scanner s = new Scanner(System.in);
    static int dia, mes;
    static String nomDelMes;

    public static void main(String[] args) {
        System.out.println("Aquest programa determina a quina estació correspon una data concreta.");
        entrada();
        //Bucle per fer que torni a demanar els valors si s'introdueix una dada incorrecta
        while (!diaCorrecte()) {
            System.out.println("Introdueix una data vàlida!");
            entrada();
        }
        nomDelMes();
        quinaEstacio();
    }

    // Comprovació del rang de valors correctes de dia i mes
    static boolean diaCorrecte() {
        if ((mes == 1 && dia >= 1 && dia <= 31) || (mes == 2 && dia >= 1 && dia <= 28) ||
                (mes == 3 && dia >= 1 && dia <= 31) || (mes == 4 && dia >= 1 && dia <= 30) ||
                (mes == 5 && dia >= 1 && dia <= 31) || (mes == 6 && dia >= 1 && dia <= 30) ||
                (mes == 7 && dia >= 1 && dia <= 31) || (mes == 8 && dia >= 1 && dia <= 31) ||
                (mes == 9 && dia >= 1 && dia <= 30) || (mes == 10 && dia >= 1 && dia <= 31) ||
                (mes == 11 && dia >= 1 && dia <= 30) || (mes == 12 && dia >= 1 && dia <= 31)) {
            return true;
        }
        // Sempre hi ha algú que provarà aquest dia
        if (mes == 2 && dia == 29) {
            System.out.println("Ho has fet a posta!\nEl 29 de febrer només existeix en anys de traspàs. :)");
            return true;
        }
        return false;
    }

    // Introducció de valors
    static void entrada() {
        System.out.println("Introdueix el dia: (dd)");
        dia = s.nextInt();
        System.out.println("Introdueix el mes: (mm)");
        mes = s.nextInt();
    }

    //Impressió del resultat
    static void quinaEstacio() {
        if (esPrimavera()) {
            System.out.println("El dia " + dia + " del mes de " + nomDelMes + " és primavera.");
        } else if (esEstiu()) {
            System.out.println("El dia " + dia + " del mes de " + nomDelMes + " és estiu.");
        } else if (esTardor()) {
            System.out.println("El dia " + dia + " del mes de " + nomDelMes + " és tardor.");
        } else {
            System.out.println("El dia " + dia + " del mes de " + nomDelMes + " és hivern.");
        }
    }

    //Definició de rangs vàlids de dies segons l'estació
    static boolean esPrimavera() {
        return (mes == 4 || mes == 5) || (mes == 3 && dia >= 21) || (mes == 6 && dia <= 20);
    }

    static boolean esEstiu() {
        return (mes == 7 || mes == 8) || (mes == 6 && dia >= 21) || (mes == 9 && dia <= 20);
    }

    static boolean esTardor() {
        return (mes == 10 || mes == 11) || (mes == 9 && dia >= 21) || (mes == 12 && dia <= 20);
    }

    //Switch per transformar el mes introduït en lletres
    static String nomDelMes() {
        switch (mes) {
            case 1:
                nomDelMes = "Gener";
                break;
            case 2:
                nomDelMes = "Febrer";
                break;
            case 3:
                nomDelMes = "Març";
                break;
            case 4:
                nomDelMes = "Abril";
                break;
            case 5:
                nomDelMes = "Maig";
                break;
            case 6:
                nomDelMes = "Juny";
                break;
            case 7:
                nomDelMes = "Juliol";
                break;
            case 8:
                nomDelMes = "Agost";
                break;
            case 9:
                nomDelMes = "Setembre";
                break;
            case 10:
                nomDelMes = "Octubre";
                break;
            case 11:
                nomDelMes = "Novembre";
                break;
            case 12:
                nomDelMes = "Desembre";
                break;
        }
        return nomDelMes;
    }
}