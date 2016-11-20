/**
 *
 * Aquesta classe serveix per demostrar els tipus de dades "primitius",
 * els que estan suportats directament per JAVA, amb els seus valors mínims i màxims
 *
 */
public class MaxValues {
    public static void main(String[] args) {
        // Valor numèric (amb signe) de 8 bits
        byte b;
        b = 127;
        b = -128;

        // Valor numèric (amb signe) de 16 bits;
        short s;
        s = 32767;
        s = -32768;

        // Valor numèric (amb signe) de 32 bits
        int i;
        i = 2147483647;
        i = -2147483648;

        // Valor numèric (amb signe) de 64 bits
        long l;
        l = 9223372036854775807L;
        l = -9223372036854775808L;

        // Representa un valor booleà (cert o fals)
        boolean bl;
        bl = true;
        bl = false;

        // Representa un caràcter UNICODE (16bits)
        char c;
        c = 0;
        c = 65535;
        c = 'a';

        // Floats i doubles: representen quantitats amb "punt flotant"
        // poden representar quantitats molt altes, però perdem precisió.
        float f = 1.5E15F;
        double d = 4.65;

        // Strings. La longitud de la cadena és de l'ordre de 2^31 caràcters
        // El tipus "String" no és un tipus "primitiu", però és estàndard en JAVA
        String str = "This is JAVA";
    }
}
