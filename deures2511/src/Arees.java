/**
 * Created by toni on 10/12/15.
 */
import java.lang.Math;
import java.util.Scanner;

public class Arees {
    public static void main(String[]args){

        int a;
        double radio;
        double area;
        double base;
        double altura;
        double costat;
        double nCostats;
        double perimetre;
        double apotema;

        Scanner S = new Scanner(System.in);

        do {
            System.out.println("1. Calcular l'àrea d'un cercle");
            System.out.println("2. Calcular l'àrea d'un triangle");
            System.out.println("3. Calcular l'àrea d'un quadrat");
            System.out.println("4. Calcular el perímetre i l'àrea d'un polígon regular");

            System.out.print("Escolliu una opció: ");
            a = S.nextInt();
        } while (a > 4);

        switch (a) {
            case 1:
                System.out.print("Introduïu el ràdio del cercle en metres: ");
                radio = S.nextDouble();
                area = (Math.PI * Math.pow(radio,2));
                System.out.println("L'àrea del cercle és "+area+" metres quadrats");
                break;
            case 2:
                System.out.print("Introduïu la base del triangle: ");
                base = S.nextDouble();
                System.out.print("Introduïu l'altura del triangle: ");
                altura = S.nextDouble();
                area = (base * altura) / 2;
                System.out.println("L'àrea del triangle és "+area+" metres quadrats");
                break;
            case 3:
                System.out.print("Introduïu el valor del costat del quadrat: ");
                costat = S.nextDouble();
                area = costat * costat;
                System.out.println("L'àrea del quadrat és: "+area+" metres quadrats");
                break;
            case 4:
                System.out.print("Introduïu el número de costats del polígon regular: ");
                nCostats = S.nextDouble();
                System.out.print("Introduïu el valor del costat del polígon regular: ");
                costat = S.nextDouble();
                perimetre = costat * nCostats;
                apotema = costat / (2 * Math.tan(Math.PI/nCostats));
                area = (perimetre * apotema) / 2;
                System.out.println("El perímetre del polígon és "+perimetre+", i la seva àrea és "+area+" metres quadrats");
                break;
        }
    }
}