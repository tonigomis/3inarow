/**
 * Created by toni on 25/02/16.
 */
public class Printer {
    // Constructor: accepta un String amb la representació de tot l'alfabet
    // Hi haurà 27 lletres en total, separades per un espai en blanc.

    private String alphabet;
    private int contador;

    public static void main(String[] args) {


    }

    public Printer(String alphabet) {
        this.alphabet = alphabet;

    }

    // Mètode render: accepta un String amb el text a representar i torna
    // també un String amb el text en forma d'ASCII Art.
    // Només es consideren les lletres majúscules de la A a la Z. Les
    // minúscules es passen a majúscules, i els altres caràctes es tradueixen
    // a «?» (manco l'espai en blanc).

    public String render(String text) {
        text = text.toUpperCase();
        String resultat = "";
        alphabet.substring(108,110);

        return null;
    }
}
