/**
 * Created by toni on 17/12/15.
 */
public class Rombo {
    public static void main(String[]args){
        rombe(5);
    }
    static void rombe(int diag){
        if(diag % 2 == 0){
            System.out.println("La diagonal ha de ser senar");

        }
        triangle1(diag);

        //diagonal d'enmig
        for(int i= 0; i < diag; i++){
            System.out.println("*");
        }
    }

    static void triangle1(int diag){
        for(int i = 1, e = diag/2; i < diag; i += 2){
            escriu(' ', e);
            escriu('*', i);
            System.out.println();
        }
    }

    static void triangle2(int diag){
        for(int i = 1, e = diag/2; i < diag; i += 2){
            escriu(' ', e);
            escriu('*', i);
            System.out.println();
        }
    }

    static void escriu(char c, int n) {
        for(int i = 0; i < n; ){

        }
    }
}
