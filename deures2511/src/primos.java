/**
 * Created by toni on 26/11/15.
 */
public class primos {
    public static void main(String[] args) {
        System.out.println("Llista de números primers: ");
        for (int n=1; n<100; n++) {
            int i;
            boolean primer = true;
            for (i=2; i<n; i++) {
                if (n % i == 0) {
                    primer = false;
                    break;
                }
            }
            if (primer) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
//        int i = 1;
//        int n = 100;
//        boolean primer = true;
//        while (n > i) {
//            System.out.println(i);
//            break;
//        }
//        for (i=2; i<n; i++) {
//            if (n % i == 0) {
//                primer = false;
//                i++;
//                continue;
//            }
//        }
//        if (primer) {
//            System.out.println("El número " + n + " és primer");
//
//            } else {
//            System.out.println("El número " + n + " no és primer");
//        }

    }
}
