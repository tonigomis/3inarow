/**
 * Created by toni on 05/10/16.
 */
public class Multiples {

    public static void main(String[] args) {
        for (int i = 5, count = 0; count < 30; i += 5) {
            if (i % 3 == 0) continue;
            count++;
            System.out.println(count + " : " + i);
        }
    }
}
