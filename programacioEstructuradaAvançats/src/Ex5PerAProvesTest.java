import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by toni on 02/11/16.
 */
public class Ex5PerAProvesTest {

    @Test
    public void testNumero() throws Exception {
        assertEquals("zero", Ex5PerAProves.numero(0));
        assertEquals("tres", Ex5PerAProves.numero(3));
        assertEquals("cinc", Ex5PerAProves.numero(5));
        assertEquals("dotze", Ex5PerAProves.numero(12));
        assertEquals("vint", Ex5PerAProves.numero(20));
        assertEquals("vint-i-un", Ex5PerAProves.numero(21));
        assertEquals("vint-i-set", Ex5PerAProves.numero(27));
        assertEquals("trenta-set", Ex5PerAProves.numero(37));
        assertEquals("quaranta", Ex5PerAProves.numero(40));
        assertEquals("noranta-nou", Ex5PerAProves.numero(99));
        assertEquals("cent", Ex5PerAProves.numero(100));
        assertEquals("cent dos", Ex5PerAProves.numero(102));
        assertEquals("cinc-cents un", Ex5PerAProves.numero(501));
        assertEquals("nou-cents", Ex5PerAProves.numero(900));
        assertEquals("nou-cents vint", Ex5PerAProves.numero(920));
        assertEquals("nou-cents noranta-nou", Ex5PerAProves.numero(999));

    }
}