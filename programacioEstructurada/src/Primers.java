/**
 * Created by toni on 05/10/16.
 */
public class Primers {
    static int count = 0;
    static int suma = 0;

    public static void main(String[] args) {

        for (int n = 1; count < 40; n++) {
            if (esPrimer(n)) {
                count++;
                suma += n;
                System.out.println(count + "--" + n + " ");
            }
        }
        System.out.println("Total: " + suma);
    }

    static boolean esPrimer(int n) {
        boolean primer = true;
        if (n > 3) {
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
