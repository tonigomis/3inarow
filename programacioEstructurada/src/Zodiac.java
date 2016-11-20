import java.util.Scanner;

/**
 * Created by toni on 06/10/16.
 */
public class Zodiac {

    static String naixement, signe, nomDelMes;
    static int dia, mes;

    public static void main(String[] args) {
        entrada();

        /*Amb aquest bucle ens asseguram que les dades introduïdes són del tipus esperat i amb el format requerit. En
        cas contrari ens apareix un missatge d'error i se'ns sol·licita l'entrada de dades de nou.*/
        while (!diaCorrecte()) {
            System.out.println("La data introduïda no existeix!\nTorna-ho a provar: ");
            entrada();
        }
        System.out.println("Els nascuts el dia " + dia + " del mes de " + nomDelMes + " es troben sota el signe de " + signe + ".");
    }

    /* Cream un nou objecte de la classe Scanner, demanam a l'usuari una entrada que capturarem en la variable "naixement"
    * en format String per a simplificar-ne la introducció i reduïr-la a un sol input. */
    static void entrada() {

        // Cream un try - catch per evitar que es tanqui el programa de forma abrupta en cas d'error.
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Introdueix la data de naixement: (DD-MM)");
            naixement = s.nextLine();
            divideix();
            diaCorrecte();
            quinSigne();
            nomDelMes();
        } catch (Exception e) {
            System.out.println("Alerta, s'ha produït un error! Revisa els paràmetres introduïts.");
        }

        //Avaluació de dia correcte de forma recursiva (Evitada per precaució =P )
/*
        while (!diaCorrecte()) {
            System.out.println("La data introduïda no existeix!\nTorna-ho a provar: ");
            entrada();
        }*/
    }
     /*Aquesta funció agafa el valor de l'input i en discrimina les parts, convertint-les com a Integer en el valor
     de les variables "dia" i "mes".*/
    static void divideix() {
        String[] parts = naixement.split("-");
        dia = Integer.parseInt(parts[0]);
        mes = Integer.parseInt(parts[1]);
    }

    // Comprovació de la introducció valors correctes corresponents a dia i mes
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
     // La funció determina el valor de la variable "signe" que imprimirem.
    static void quinSigne() {
        if (dia >= 20 && mes == 3 || dia <= 19 && mes == 4) {
            signe = "Àries";
        } else if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
            signe = "Taure";
        } else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
            signe = "Gèminis";
        } else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
            signe = "Càncer";
        } else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
            signe = "Lleó";
        } else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
            signe = "Verge";
        } else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
            signe = "Balança";
        } else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
            signe = "Escorpí";
        } else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
            signe = "Sagitari";
        } else if (dia >= 22 && mes == 12 || dia <= 19 && mes == 1) {
            signe = "Capricorn";
        } else if (dia >= 20 && mes == 1 || dia <= 17 && mes == 2) {
            signe = "Aquari";
        } else {
            signe = "Peixos";
        }
    }

    //Switch per transformar el número de mes introduït en el seu nom
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
