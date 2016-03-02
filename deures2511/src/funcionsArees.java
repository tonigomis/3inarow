import java.util.Scanner;
import java.lang.Math;

/**
 * Created by toni on 14/12/15.
 */


public class funcionsArees {

    public static void main(String[] args) {
        int a;
        Scanner S = new Scanner(System.in);
        do {
            System.out.println("1. Calcular l'àrea d'un cercle");
            System.out.println("2. Calcular el perímetre i l'àrea d'un polígon regular");
            System.out.println("\n0. Sortir");
            System.out.print("Escolliu una opció: ");
            a = S.nextInt();
        } while (a > 2);

        switch (a){
        case 0: break;
        case 1: funcionsArees.areaCercle();
            break;
        case 2: funcionsArees.areaPoligon();
            break;
        }
    }

    static void areaPoligon() {

        Scanner S = new Scanner(System.in);

        System.out.print("Introduïu el número de costats del polígon regular: ");
        double nCostats = S.nextDouble();
        System.out.print("Introduïu el valor del costat del polígon regular: ");
        double costat = S.nextDouble();
        double perimetre = costat * nCostats;
        double apotema = costat / (2 * Math.tan(Math.PI / nCostats));
        double area = (perimetre * apotema) / 2;
        System.out.println("El perímetre del polígon és " + perimetre + ", i la seva àrea és " + area + " metres quadrats");
    }

    static void areaCercle() {

        Scanner S = new Scanner(System.in);

        System.out.print("Introduïu el ràdio del cercle en metres: ");
        double radio = S.nextDouble();
        double area = (Math.PI * Math.pow(radio,2));
        System.out.println("L'àrea del cercle és "+area+" metres quadrats");

    }
}