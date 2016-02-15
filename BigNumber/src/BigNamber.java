/**
 * Created by toni on 04/02/16.
 */
public class BigNamber {
    public static void main(String[] args) {
    }
}
class BigNumber {
    String contenidor;

    //Constructor1
    public BigNumber(String s) {
        contenidor = s;

        int noCero = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0') {
                noCero = i;
                break;
            }
        }
        contenidor = s.substring(noCero);
    }

    //Constructor2
    public BigNumber(BigNumber b) {
        this.contenidor = b.contenidor;
    }

    //Suma


    // Mira si dos objectes BigNumber són iguals

    public boolean equals(Object o) {
        BigNumber b = (BigNumber) o;

        /* return (this.contenidor.equals(b.contenidor));*/

        if (this.contenidor.equals(b.contenidor)) {
            return true;
        }
        return false;
    }

    //Add String

    BigNumber add(BigNumber other) {
        String resultat = "";
        String s1 = this.contenidor;
        String s2 = other.contenidor;
        int carry = 0;

        if (s1.length() < s2.length()) {
            String t = s1;
            s1 = s2;
            s2 = t;
        }

        int addZero = s1.length() - s2.length();
        String t = "";
        for (int i = 0; i < addZero; i++) {
            t += "0";
        }
        t += s2;

        for (int i = s1.length() - 1; i >= 0; i--) {
            int n1 = (char) (s1.charAt(i) - '0');
            int n2 = (char) (t.charAt(i) - '0');
            if (n1 + n2 + carry > 9) {
                resultat += (n1 + n2 + carry) - 10;
                carry = 1;
            } else {
                resultat += (char) ('0' + (n1 + n2 + carry));
                carry = 0;
            }
        }
        if (carry == 1) {
            resultat += 1;
        }
        return new BigNumber(reverse(resultat));
    }

    // Substract String

    BigNumber sub(BigNumber other) {
        String resultat = "";
        String s1 = this.contenidor;
        String s2 = other.contenidor;
        int carry = 0;
        if (s1.length() < s2.length()) {
            String t = s1;
            s1 = s2;
            s2 = t;
        }

        int addZero = s1.length() - s2.length();
        String t = "";
        for (int i = 0; i < addZero; i++) {
            t += "0";
        }
        t += s2;

        for (int i = s1.length() - 1; i >= 0; i--) {
            int n1 = (char) (s1.charAt(i) - '0');
            int n2 = (char) (t.charAt(i) - '0');
            if ((n1 < (n2 + carry))) {
                resultat += (n1 + 10) - (n2 + carry);
                carry = 1;
            } else {
                resultat += (char) ('0' + (n1 - (n2 + carry)));
                carry = 0;
            }
        }
        if (carry == 1) {
            resultat += 1;
        }
        return new BigNumber(reverse(resultat));
    }

    //Compare String
    public int compareTo(BigNumber other) {
        String s1 = this.contenidor;
        String s2 = other.contenidor;
        int i;

        if (s1.length() > s2.length()) {
            return 1;
        } else if (s1.length() < s2.length()){
            return -1;
        }

        for (i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }

    // Multiply String
    BigNumber mult(BigNumber other) {
        String s1 = this.contenidor;
        String s2 = other.contenidor;

        int[] nums = new int[s1.length()+s2.length()];

        for (int i = 0; i < s2.length(); i++) {
            int carry = 0;
            int a = s2.charAt(s2.length() -i -1) - '0';
            for (int j = 0; j < s1.length(); j++) {
                int b = s1.charAt(s1.length() -1 -j) -'0';
                nums [i + j] += a * b + carry;
                carry = nums [i + j] / 10;
                nums [i + j] %= 10;
            }
            nums [i + s1.length()] += carry;
            
        }
        return other;
    }

    //Reverse String

    String reverse(String s) {
        String resultat = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            resultat += s.charAt(i);
        }
        return resultat;
    }

    //To String

    public String toString() {
        return this.contenidor;
    }
}