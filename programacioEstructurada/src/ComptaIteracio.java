/**
 * Created by toni on 09/10/16.
 */
public class ComptaIteracio {
    public static void main(String[] args) {

        // Aquest bucle es reprodueix de forma infinita perquè just quan deixa de complir-se la primera condició
        // s'incrementa el valor de "i" i fa impossible de complir la segona i arribar al break que acabaria
        // el bucle infinit. Si if == 10 fos if >= 10 hauria fet 11 iteracions.
        int i = 0;
        while (true) {
            i ++;
            if (i < 10)
                continue;
            i ++;
            if (i == 15)
                break;
        }
    }
}
