/**
 * Created by toni on 04/10/16.
 */
public class Primers {
    public static void main(String[] args) {
        System.out.println("LLista de números primers: ");
        for (int n = 1; n < 100; n++) {
            if (esPrimer(n)) {
                System.out.println(n + " ");
            } else {
                System.out.println("-");
            }
        }
    }

    static boolean esPrimer(int n) {
        boolean primer = true;
        if (n > 3){
            if (n % 2 == 0 || n % 3 == 0) {
                primer = false;
            } else {
                for (int i = 5; i * i <= n; i += 2) {
                    if (n % i == 0) {
                        primer = false;
                        break;
                    }
                }
            }
        }
        return primer;
    }
}