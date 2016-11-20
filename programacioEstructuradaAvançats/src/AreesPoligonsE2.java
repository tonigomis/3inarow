import java.util.Scanner;

/**
 * Created by toni on 19/10/16.
 */
public class AreesPoligonsE2 {

    // Declaram les variables necessàries per a les diferents funcions

    static Scanner s = new Scanner(System.in);
    static double radio;
    static double area;
    static double base;
    static double altura;
    static double apotema;
    static double perimetre;
    static double nCostats;
    static double costat;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        try {
            int opt = -1;
            while (opt != 0) {
                System.out.print(" --------------------------------------------------------------------------- " +
                        "\n|| Aquest programa calcula les àrees de qualsevol mena de polígon regular. || \n" +
                        " --------------------------------------------------------------------------- \n" +
                        "1.- Calcular l'àrea d'un cercle.\n" + "2.- Calcular l'àrea d'un triangle\n" +
                        "3.- Calcular l'àrea d'un quadrat\n" + "4.- Calcular l'àrea de qualsevol altre polígon de " +
                        "n costats\n" + "0.- Sortir\n\n" + "Tria una de les següents opcions: ");
                opt = s.nextInt();
                switch (opt) {
                    case 1:
                        cercle();
                        break;
                    case 2:
                        triangle();
                        break;
                    case 3:
                        quadrat();
                        break;
                    case 4:
                        poligonRegular();
                        break;
                    case 0:
                        System.out.println("Adéu!");
                        break;
                    default:
                        System.out.println("Has d'escollir una opció vàlida!");
                }
            }
        } catch (Exception e) {
            System.out.println("S'ha produït un error");
        }
    }

    static double trunca(double area) {
        return Math.ceil(area * 100) / 100;
    }

    static void cercle() {
        System.out.print("Introduïu el ràdio del cercle: ");
        radio = s.nextDouble();
        if (radio <= 0) {
            System.out.println("Aquest número no pot ser més petit que zero!\n");
            return;
        }
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("L'àrea del cercle introduït és de " + trunca(area) + ".\n");
    }

    static void triangle() {
        System.out.print("Introduïu la base del triangle: ");
        base = s.nextDouble();
        System.out.print("Introduïu l'altura del triangle: ");
        altura = s.nextDouble();
        if (base <= 0 || altura <= 0) {
            System.out.println("Alerta! Aquests números no poden ser més petits que zero!\n");
            return;
        }
        area = (base * altura) / 2;
        System.out.println("L'àrea del triangle introduït és " + trunca(area) + ".\n");
    }

    static void quadrat() {
        System.out.print("Introduïu la longitud de la base: ");
        base = s.nextDouble();
        System.out.print("Introduïu l'altura del quadrat: ");
        altura = s.nextDouble();
        if (base <= 0 || altura <= 0) {
            System.out.println("Alerta! Aquests números no poden ser més petits que zero!\n");
            return;
        }
        area = base * altura;
        if (base == altura) {
            System.out.println("El quadrat introduït té una àrea de " + trunca(area) + ".\n");
        } else {
            System.out.println("El rectangle introduït té una àrea de " + trunca(area) + ".\n");
        }
    }

    static void poligonRegular() {
        System.out.print("Introdueix el número de costats del polígon: ");
        nCostats = s.nextDouble();
        System.out.print("Introdueix la longitud del costat: ");
        costat = s.nextDouble();
        if (nCostats <= 0 || costat <= 0) {
            System.out.println("Alerta! Aquests números no poden ser més petits que zero!\n");
            return;
        }
        perimetre = costat * nCostats;
        apotema = costat / (2 * Math.tan(Math.PI / nCostats));
        area = (perimetre * apotema) / 2;
        System.out.println("L'àrea del polígon regular de " + (int) nCostats + " costats és " + trunca(area) + ".\n");
    }
}
