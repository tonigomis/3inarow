/**
 * Created by toni on 18/01/16.
public class RetallsVigenere {
    String sortida = "";
    char[] passwordEquals = new char[message.length()];
    char[] Msg = message.toUpperCase().toCharArray();
    int cont = 0;
    for (int c = 0; c < message.length(); c++) {
        if (message.charAt(c) == ' ') {
            c++;
        }
        passwordEquals[c] = password.charAt(cont);
        cont++;
        if (cont == password.length()) {
            cont = 0;
        }
    }
    int x = 0, y = 0, z;
    for (int c = 0; c < message.length(); c++) {
        if (message.charAt(c) == ' ') {
            sortida += " ";
            c++;
        }
    }
}*/
