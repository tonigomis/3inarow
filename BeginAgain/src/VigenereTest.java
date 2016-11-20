import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by toni on 18/04/16.
 */
public class VigenereTest {
    @Test
    public void VigenereTest() {

        //T1 test
        assertEquals("BCD", Vigenere.encode("ABC", "AAA"));
        assertEquals("AAA", Vigenere.encode("ZZZ", "AA"));
        assertEquals("ZZZ", Vigenere.encode("YYY", "A"));

        //T2 test
        assertEquals("CPM VFE", Vigenere.encode("BEN FET", "AKYP"));
        assertEquals("MEXN KXXX", Vigenere.encode("AVUI PLOU", "LICEU"));
        assertEquals("YQ USNCT WK WYWEWMF", Vigenere.encode("El camió és vermell", "terra"));

        //T3 test
        assertEquals("PJ DGWWCBLJGRP VNP OFL", Vigenere.encode("La constatació del fet", "diari"));
        assertEquals("UA PNVJW, RKT OXHCLOKPDJ YU SSEEQA XRD 16", Vigenere.encode("El debat, que continuarà el proper dia 16", "política"));
        assertEquals("QAFJE C DUWYSXBZU UJIUMITFCULGS WFT BQHK YORTTFNBYGSLM", Vigenere.encode("Podem i Ciutadans protagonitzen els pocs enfrontaments", "albert"));
        assertEquals("RMW IDM UBR UXMADMVRX RTTWLMNMQWWX", Vigenere.encode("Els qui han coincidit especialment", "Madrid"));
        assertEquals("LA INFWZINJ LOTQA MS FLRKSWUBI", Vigenere.encode("El ministre també ha reconegut", "govern"));
        assertEquals("(PP QXUWF RFD F BKLCKAX) J ZXO EQ USWLVBD (FUWGEJA FMK TRSQSFFMU)", Vigenere.encode("(no estem per a assajos) i hem de prestar (atenció als aprenents)", "balears"));

        //T4 test
        assertEquals("ABC", Vigenere.decode("BCD", "AAA"));
        assertEquals("ZZZ", Vigenere.decode("AAA", "AA"));
        assertEquals("YYY", Vigenere.decode("ZZZ", "A"));

        //T5 test
        assertEquals("BEN FET", Vigenere.decode("CPM VFE", "AKYP"));
        assertEquals("AVUI PLOU", Vigenere.decode("MEXN KXXX", "LICEU"));
        assertEquals("EL CAMIO ES VERMELL", Vigenere.decode("YQ USNCT WK WYWEWMF", "terra"));

        //T6 test
        assertEquals("LA CONSTATACIO DEL FET", Vigenere.decode("PJ DGWWCBLJGRP VNP OFL", "diari"));
        assertEquals("EL DEBAT, QUE CONTINUARA EL PROPER DIA 16", Vigenere.decode("UA PNVJW, RKT OXHCLOKPDJ YU SSEEQA XRD 16", "política"));
        assertEquals("PODEM I CIUTADANS PROTAGONITZEN ELS POCS ENFRONTAMENTS", Vigenere.decode("QAFJE C DUWYSXBZU UJIUMITFCULGS WFT BQHK YORTTFNBYGSLM", "albert"));
        assertEquals("ELS QUI HAN COINCIDIT ESPECIALMENT", Vigenere.decode("RMW IDM UBR UXMADMVRX RTTWLMNMQWWX", "Madrid"));
        assertEquals("EL MINISTRE TAMBE HA RECONEGUT", Vigenere.decode("LA INFWZINJ LOTQA MS FLRKSWUBI", "govern"));
        assertEquals("(NO ESTEM PER A ASSAJOS) I HEM DE PRESTAR (ATENCIO ALS APRENENTS)", Vigenere.decode("(PP QXUWF RFD F BKLCKAX) J ZXO EQ USWLVBD (FUWGEJA FMK TRSQSFFMU)", "balears"));

    }
}