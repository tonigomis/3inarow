/**
 * Created by toni on 09/10/16.
 */
public class ForToWhile {
    public static void main(String[] args) {
/*        int a, b;
        for( a=0,b=0; a < 7; a++,b+=2 ) {
            System.out.println("a " + a);
            System.out.println("b " + b);
        }*/
        int a = 0, b = 0;
        while (a < 7) {
            System.out.println("a " + a);
            System.out.println("b " + b);

            a++;
            b += 2;
        }
    }
}
