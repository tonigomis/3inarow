/**
 * Created by toni on 02/12/15.
 */
public class sumaPrimers {
    public static void main(String[]args){
        int resultat = 0;
        System.out.println("Llista dels 40 primers números primers: ");
        for (int comptador = 1, n = 1; comptador <= 40; n ++){

            boolean primer = true;
//
            if (n > 3) {
                if (n % 2 == 0 || n % 3 == 0){
                    primer = false;

                } else {
                    for (int i = 5; i * i <= n; i+=2){

                        if (n % i == 0) {
                            primer = false;
                            break;
                        }
                    }

                }

            }

            if (primer) {
                System.out.print(n + " ");
                comptador++;
                resultat = resultat + n;
            }
        }
        System.out.println();
        System.out.println("La suma dels primers 40 números primers és igual a: " + resultat);
    }
}