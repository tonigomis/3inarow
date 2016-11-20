/**
 * Created by toni on 22/09/16.
 */

import java.util.Scanner;

public class ArrelQuadrada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i = 0;
        while ((i+1)*(i+1) <= x) {
            i++;
        }
        System.out.println(i);
    }
}
