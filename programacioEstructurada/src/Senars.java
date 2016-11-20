/**
 * Created by toni on 04/10/16.
 */
public class Senars {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 200; i+=2) {
            System.out.println(i);
            count++;
            if (count == 100) break;
        }
    }
}
