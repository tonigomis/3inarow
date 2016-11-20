/**
 * Created by toni on 02/11/16.
 */
public class Ex5PerAProves {
    static String numero(int n) {
        int centenes = n / 100;
        n = n - centenes * 100;
        int desenes = n / 10;
        int unitats = n % 10;
        String d = getD(desenes);
        String u = n0(unitats);

        StringBuilder sb = new StringBuilder();
        if (centenes > 0) {
            if (centenes == 1) {
                sb.append("cent");
            } else {
                String c = n0(centenes);
                sb.append(c + "-cents");
            }
            if (unitats == 0 && desenes == 0) {
                return  sb.toString();
            }
            sb.append(" ");
        }
        if (desenes < 2) {
            sb.append(n0(n));
            return sb.toString();
        }
        if (desenes == 2) {
            if (unitats > 0) {
                sb.append(d + "-i-" + u);
            } else {
                sb.append(d);
            }
        } else {
            if (unitats > 0) {
                sb.append(d + "-" + u);
            } else {
                sb.append(d);
            }
        }
        return sb.toString();
    }

    private static String getD(int desenes) {
        switch (desenes) {
            case 2:
                return "vint";
            case 3:
                return "trenta";
            case 4:
                return "quaranta";
            case 5:
                return "cinquanta";
            case 6:
                return "seixanta";
            case 7:
                return "setanta";
            case 8:
                return "vuitanta";
            case 9:
                return "noranta";
            default:
                return "Impossible";
        }
    }

    static String n0(int n) {
        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "un";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "quatre";
            case 5:
                return "cinc";
            case 6:
                return "sis";
            case 7:
                return "set";
            case 8:
                return "vuit";
            case 9:
                return "nou";
            case 10:
                return "deu";
            case 11:
                return "onze";
            case 12:
                return "dotze";
            case 13:
                return "tretze";
            case 14:
                return "catorze";
            case 15:
                return "quinze";
            case 16:
                return "setze";
            case 17:
                return "desset";
            case 18:
                return "devuit";
            case 19:
                return "denou";
            default:
                return "Impossible";
        }
    }
}
