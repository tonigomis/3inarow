/**
 * Created by toni on 06/12/15.
 */
import java.util.Scanner;

public class Hora {
    public static void main(String[]args){
        int hora, minut, segon;
        Scanner S = new Scanner(System.in);
        System.out.print("Introduïu les hores: ");
        hora = S.nextInt();
        System.out.print("Introduïu els minuts: ");
        minut = S.nextInt();
        System.out.print("Introduïu els segons: ");
        segon = S.nextInt();

        if(hora < 24 && hora >= 0 && minut < 60 && minut >= 0 && segon < 60 && segon >= 0){
            segon +=1;

            if (segon == 60){
                minut += 1;
                segon = 0;
            }

            if (minut == 60){
                hora += 1;
                minut = 0;
            }

            if (hora == 24){
                hora = 0;
            }
            System.out.println(hora+":"+minut+":"+segon);

        } else {
            System.out.println("L'hora introduïda no és correcta");
        }

    }
}