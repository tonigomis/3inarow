import java.util.Scanner;
/**
 * Created by toni on 24/10/16.
 */
public class ProvaE5 {
    static Scanner s = new Scanner(System.in);
    static int numero;
    static String cadena = "";
    static int buffer;

    public static void main(String[] args) {
        entrada();
        descomposa();
    }

    static void entrada() {
        System.out.println("Introdueix un número enter: ");
        cadena = s.nextLine();
        numero = Integer.parseInt(cadena);
        buffer = numero;
    }

    static void descomposa() {
        int unitat = numero % 10;
        numero = numero / 10;
        unitatAText(unitat);
        int desena = numero % 10;
        numero = numero / 10;
        desenaAText(desena);
        int centena = numero % 10;
        numero = numero / 10;
        centenaAText(centena);
        int miler = numero % 10;
        numero = numero / 10;
        milerAText(miler);
        if (buffer >= 10000) {
            int desenaMiler = numero % 10;
            numero = numero / 10;
            desenaMilerAText(10 + miler);
        }
        casosEspecials(unitat, desena, centena, miler);
    }

    static void casosEspecials(int unitat, int desena, int centena, int miler) {
        if (buffer >= 10000) {
            if (unitat == 0 && desena != 1) {
                System.out.println(desenaMilerAText(10 + miler) + milerAText(miler) + centenaAText(centena) + desenaAText(desena));
            } else if (desena == 1) {
                System.out.println(desenaMilerAText(10 + miler) + milerAText(miler) + centenaAText(centena) + desenaDeDeu(10 + unitat));
            } else if (desena == 2) {
                System.out.println(desenaMilerAText(10 + miler) + milerAText(miler) + centenaAText(centena) + desenaAText(desena) + "-i-" + unitatAText(unitat));
            } else {
                System.out.println(desenaMilerAText(10 + miler) + centenaAText(centena) + desenaAText(desena) + "-" + unitatAText(unitat));
            }
        } else if (buffer >= 2000) {
            if (unitat == 0 && desena != 1) {
                System.out.println(milerAText(miler) + "mil " + centenaAText(centena) + desenaAText(desena));
            } else if (desena == 1) {
                System.out.println(milerAText(miler) + "mil " + centenaAText(centena) + desenaDeDeu(10 + unitat));
            } else if (desena == 2) {
                System.out.println(milerAText(miler) + "mil " + centenaAText(centena) + desenaAText(desena) + "-i-" + unitatAText(unitat));
            } else if (miler == 1) {
                System.out.println(milerAText(miler) + centenaAText(centena) + desenaAText(desena) + "-" + unitatAText(unitat));
            } else {
                System.out.println(milerAText(miler) + "mil " + centenaAText(centena) + desenaAText(desena) + "-" + unitatAText(unitat));
            }
        }  else if (buffer >= 1000 && buffer < 2000) {
            if (unitat == 0 && desena != 1) {
                System.out.println(milerAText(miler) + centenaAText(centena) + desenaAText(desena));
            } else if (desena == 1) {
                System.out.println(milerAText(miler) + centenaAText(centena) + desenaDeDeu(10 + unitat));
            } else if (desena == 2) {
                System.out.println(milerAText(miler) + centenaAText(centena) + desenaAText(desena) + "-i-" + unitatAText(unitat));
            } else if (miler == 1) {
                System.out.println(milerAText(miler) + centenaAText(centena) + desenaAText(desena) + "-" + unitatAText(unitat));
            } else {
                System.out.println(milerAText(miler) + centenaAText(centena) + desenaAText(desena) + "-" + unitatAText(unitat));
            }
        } else {
            if (unitat == 0 && desena != 1) {
                System.out.println(centenaAText(centena) + desenaAText(desena));
            } else if (desena == 1) {
                System.out.println(centenaAText(centena) + desenaDeDeu(10 + unitat));
            } else if (desena == 2) {
                System.out.println(centenaAText(centena) + desenaAText(desena) + "-i-" + unitatAText(unitat));
            } else if (miler == 1) {
                System.out.println(centenaAText(centena) + desenaAText(desena) + "-" + unitatAText(unitat));
            } else {
                System.out.println(centenaAText(centena) + desenaAText(desena) + "-" + unitatAText(unitat));
            }
        }
    }

    static String unitatAText(int unitat) {
        switch (unitat) {
            case 0:
                return "zero";
            case 1:
                return "un";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "quatre";
            case 5:
                return "cinc";
            case 6:
                return "sis";
            case 7:
                return "set";
            case 8:
                return "vuit";
            case 9:
                return "nou";
            default:
                return "";
        }
    }

    static String desenaDeDeu(int desena) {
        switch (desena) {
            case 10:
                return "deu";
            case 11:
                return "onze";
            case 12:
                return "dotze";
            case 13:
                return "tretze";
            case 14:
                return "catorze";
            case 15:
                return "quinze";
            case 16:
                return "setze";
            case 17:
                return "desset";
            case 18:
                return "devuit";
            case 19:
                return "denou";
            default:
                return "";
        }
    }

    static String desenaAText(int desena) {
        switch (desena) {
            case 2:
                return "vint";
            case 3:
                return "trenta";
            case 4:
                return "quaranta";
            case 5:
                return "cinquanta";
            case 6:
                return "seixanta";
            case 7:
                return "setanta";
            case 8:
                return "vuitanta";
            case 9:
                return "noranta";
            default:
                return "";
        }
    }

    static String centenaAText(int centena) {
        switch (centena) {
            case 1:
                return "cent ";
            case 2:
                return "dos-cents ";
            case 3:
                return "tres-cents ";
            case 4:
                return "quatre-cents ";
            case 5:
                return "cinc-cents ";
            case 6:
                return "sis-cents ";
            case 7:
                return "set-cents ";
            case 8:
                return "vuit-cents ";
            case 9:
                return "nou-cents ";
            default:
                return "";
        }
    }

    static String milerAText(int miler) {
        switch (miler) {
            case 1:
                return "mil ";
            case 2:
                return "dos ";
            case 3:
                return "tres ";
            case 4:
                return "quatre ";
            case 5:
                return "cinc ";
            case 6:
                return "sis ";
            case 7:
                return "set ";
            case 8:
                return "vuit ";
            case 9:
                return "nou ";
            default:
                return "";
        }
    }

    static String desenaMilerAText(int Miler) {
        switch (Miler) {
            case 10:
                return "deu mil ";
            case 11:
                return "onze mil ";
            case 12:
                return "dotze mil ";
            case 13:
                return "tretze mil ";
            case 14:
                return "catorze mil ";
            case 15:
                return "quinze mil ";
            case 16:
                return "setze mil ";
            case 17:
                return "desset mil ";
            case 18:
                return "devuit mil ";
            case 19:
                return "denou mil ";
            default:
                return "";
        }
    }
}
/*
    static void inverteix() {
        for (int i = llarg-1; i >= 0 ; i--) {
            resultat += cadena.charAt(i);
        }
    }
*/
