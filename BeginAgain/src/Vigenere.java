/**
 * Created by toni on 18/04/16.
 */
public class Vigenere {

    public static String encode(String message, String password) {
        message = avaluaTypo(message);
        password = avaluaTypo(password);
        String solucio = "";
        int j = 0;
        for (int i = 0; i < message.length(); i++) {
            if (esEspecial(message.charAt(i))) {
                solucio += message.charAt(i);
                continue;
            }
            int messageBrut = charaNum(message.charAt(i));
            int passBrut = charaNum(password.charAt(j));
            int resposta = messageBrut + passBrut;
            solucio += numaChar(resposta);
            j++;
            if (j >= password.length()) j = 0;
        }
        return solucio;
    }

    public static String decode(String message, String password) {
        message = avaluaTypo(message);
        password = avaluaTypo(password);
        String descodificat = "";
        int j = 0;
        for (int i = 0; i < message.length(); i++) {
            if (esEspecial(message.charAt(i))) {
                descodificat += message.charAt(i);
                continue;
            }
            int messageBrut = charaNum(message.charAt(i));
            int passBrut = charaNum(password.charAt(j));
            int resposta = messageBrut - passBrut;
            descodificat += decNumaChar(resposta);
            j++;
            if (j >= password.length()) j = 0;
        }
        return descodificat;
    }

    public static String avaluaTypo(String message) {
        char caracter;
        String codificat = "";
        for (int i = 0; i < message.length(); i++) {
            caracter = message.charAt(i);
            if (message.charAt(i) >= 65 && message.charAt(i) <= 90) {
                codificat += String.valueOf(caracter);
                continue;
            } else if (message.charAt(i) == ' ') {
                caracter = ' ';
            } else if (message.charAt(i) >= 97 && message.charAt(i) <= 122) {
                caracter -= 32;
            } else if (message.charAt(i) >= 224 && message.charAt(i) <= 230 || message.charAt(i) >= 192 && message.charAt(i) <= 198) {
                caracter = 'A';
            } else if (message.charAt(i) >= 232 && message.charAt(i) <= 235 || message.charAt(i) >= 200 && message.charAt(i) <= 203) {
                caracter = 'E';
            } else if (message.charAt(i) >= 236 && message.charAt(i) <= 239 || message.charAt(i) >= 204 && message.charAt(i) <= 207) {
                caracter = 'I';
            } else if (message.charAt(i) >= 242 && message.charAt(i) <= 246 || message.charAt(i) >= 210 && message.charAt(i) <= 214) {
                caracter = 'O';
            } else if (message.charAt(i) >= 249 && message.charAt(i) <= 252 || message.charAt(i) >= 217 && message.charAt(i) <= 220) {
                caracter = 'U';
            }
            codificat += String.valueOf(caracter);
        }
        return codificat;
    }

    public static int charaNum(char c) {
        int num = 1 + (c - 'A');
        return num;
    }

    public static char numaChar(int r) {
        if (r > 26) r -= 26;
        char c = (char) ('A' + (r - 1));
        return c;
    }

    public static char decNumaChar(int y) {
        if (y <= 0) y += 26;
        char c = (char) ('A' + (y - 1));
        return c;
    }

    public static boolean esEspecial(char w) {
        return (w < 65 || w > 90);
    }
}
