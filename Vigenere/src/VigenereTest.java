import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by toni on 11/01/16.
 */
public class VigenereTest {
    @Test
    public void VigenereTest(){
        assertEquals("BCD", Vigenere.encode("ABC", "AAA"));
    }

}