/**
 * Created by toni on 15/10/16.
 */
public class Ex5 {
    static Turtle t = new Turtle(800,800);
    public static void main(String[] args) {

        // Defineix les variables
        int numQuadres = 10;
        int costat = 30;
        int increment = costat;
        int angle = 90;
        int x = 0;
        int y = 0;

        // Crida la funció per incrementar els quadres, passant els paràmetres que necessitam
        creixQuadre(numQuadres, costat, increment, angle, x, y);
        // Pinta el canvas
        t.show();
    }
    // Aquesta funció dibuixa una figura donades la longitud del costat i l'angle
    static void pintaQuadre(int costat, int angle){
        for (int i = 0; i < 4; i++) {
            t.forward(costat);
            t.turnLeft(angle);
        }
    }

    /* Aquesta funció serveix per posicionar el quadre inicial, dibuixar-lo cridant l'anterior funció, calcular
       l'increment del costat i modificar la posició inicial de cada nou quadre per fer que siguin concèntrics. */
    static void creixQuadre(int numQuadres, int costat, int increment, int angle, int x, int y) {
        for (int i = 0; i < numQuadres; i++) {

            // Posició inicial
            t.goTo(x,y);
            // Quadre inicial
            pintaQuadre(costat, angle);
            // Increment del costat
            costat += increment;
            // Recàlcul de la posició de 'x' i de 'y'
            x += increment/2;
            y -= increment/2;
        }
    }
}