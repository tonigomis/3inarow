import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by toni on 04/02/16.
 */
public class BigNumberTest {
    @Test
    public void test() {
// Aquests tests són obligatoris passar-los per aprovar la pràctica

        /////////////////////////////////////////////////////////
        // Sumes Simples
        /////////////////////////////////////////////////////////
        BigNumber b1, b2;
        b1 = new BigNumber("2");
        b2 = new BigNumber("02");
        assertEquals(b1, b2);
        assertEquals(new BigNumber("4"), b1.add(b2));

        b1 = new BigNumber("12");
        b2 = new BigNumber("34");
        assertEquals(new BigNumber("46"), b1.add(b2));

        b1 = new BigNumber("00022");
        b2 = new BigNumber("090");
        assertEquals(new BigNumber("112"), b1.add(b2));

        /////////////////////////////////////////////////////////
        // Sumes Complexes
        /////////////////////////////////////////////////////////
        b1 = new BigNumber("567456234578945345234234456");
        b2 = new BigNumber("456235768978078934523523452345456");
        assertEquals(new BigNumber("456236336434313513468868686579912"), b1.add(b2));

        /////////////////////////////////////////////////////////
        // Sumes Complexes
        /////////////////////////////////////////////////////////
        b1 = new BigNumber("567456234578945345234234456");
        b2 = new BigNumber("456235768978078934523523452345456");
        assertEquals(new BigNumber("456236336434313513468868686579912"), b1.add(b2));

        /////////////////////////////////////////////////////////
        // Restes Simples
        /////////////////////////////////////////////////////////
        b1 = new BigNumber("60");
        b2 = new BigNumber("010");
        assertEquals(new BigNumber("50"), b1.sub(b2));

        b1 = new BigNumber("34535233");
        b2 = new BigNumber("04533453");
        assertEquals(new BigNumber("30001780"), b1.sub(b2));

        /////////////////////////////////////////////////////////
        // Restes Complexes
        /////////////////////////////////////////////////////////
        b1 = new BigNumber("45634563456565555557854564223429999886785678912");
        b2 = new BigNumber("0000000000000000000000000000000000000000000000000000000000011");
        assertEquals(new BigNumber("45634563456565555557854564223429999886785678901"), b1.sub(b2));

        b1 = new BigNumber("45634563456565555557854564223429999886785678912");
        b2 = new BigNumber("789789797979454534534534567867823489898899");
        assertEquals(new BigNumber("45633773666767576103320029688862132063295780013"), b1.sub(b2));

        b1 = new BigNumber("45634563456565555557854564223429999886785678912");
        b2 = new BigNumber("789789797979454534534534567867823489898899");
        assertEquals(new BigNumber("45633773666767576103320029688862132063295780013"), b1.sub(b2));

        /////////////////////////////////////////////////////////
        // Comparacions
        /////////////////////////////////////////////////////////
        b1 = new BigNumber("2");
        b2 = new BigNumber("02");
        assertEquals(b1, b2);

        b1 = new BigNumber("345345234523452352345");
        b2 = new BigNumber("000000000000000345345234523452352345");
        assertEquals(b1, b2);

        b1 = new BigNumber("56");
        b2 = new BigNumber("000000000000000000000000000000056");
        assertEquals(0, b1.compareTo(b2));

        b1 = new BigNumber("456456345634563456345634556785678567856783456345634563456567456745674567");
        b2 = new BigNumber("456456345634563456345634556785678567856783456345634563456567456745674567");
        assertEquals(0, b1.compareTo(b2));

        b1 = new BigNumber("456456345634563456345634556785678567856783456345634563456567456745674561");
        b2 = new BigNumber("456456345634563456345634556785678567856783456345634563456567456745674567");
        assertEquals(-1, b1.compareTo(b2));

        b1 = new BigNumber("556456345634563456345634556785678567856783456345634563456567456745674561");
        b2 = new BigNumber("456456345634563456345634556785678567856783456345634563456567456745674567");
        assertEquals(1, b1.compareTo(b2));

        b1 = new BigNumber("556456345634563456345634556785678567856783456345634563456567456745674561");
        b2 = new BigNumber("556456345634563456345634556783678567856783456345634563456567456745674561");
        assertEquals(1, b1.compareTo(b2));

        b1 = new BigNumber("000556456345634563456345634556785678567856783456345634563456567456745674561");
        b2 = new BigNumber("556456345734563456345634556783678567856783456345634563456567456745674561");
        assertEquals(-1, b1.compareTo(b2));

       //Tests originals
        b1 = new BigNumber("12");
        b2 = new BigNumber("12");
        assertEquals(true, b1.equals(b2));

        b1 = new BigNumber("12");
        b2 = new BigNumber("13");
        assertEquals(false, b1.equals(b2));

        b1 = new BigNumber("62");
        b2 = new BigNumber("0000000062");
        assertEquals(true, b1.equals(b2));

        b1 = new BigNumber("25");
        b2 = new BigNumber("23");
        assertEquals(new BigNumber("48"), b1.add(b2));

        b1 = new BigNumber("62");
        b2 = new BigNumber("0000000062");
        assertEquals(b1, b2);

        b1 = new BigNumber("34534523449508909823498756345340958029384");
        b2 = new BigNumber(b1);
        assertEquals(b1, b2);

        b1 = new BigNumber("342234234123423576789423422323123412341234");
        b2 = new BigNumber("3245234789789234234123784567892349789456");
        assertEquals(new BigNumber("345479468913212811023547206891015762130690"), b1.add(b2));

        b1 = new BigNumber("32456789567456786783453");
        b2 = new BigNumber("2345664556756713");
        assertEquals(new BigNumber("32456787221792230026740"), b1.sub(b2));

/*        b1 = new BigNumber("3457845646485642345641234534564561231563153");
        b2 = new BigNumber("456423123486481523156485312348648641231234864312341563");
        assertEquals(new BigNumber("1578240710503108871000974645825969302622584878648924684207547892743224646500723770841832141228139"), b1.mult(b2)); */

        b1 = new BigNumber("00135");
        b2 = new BigNumber("136");
        assertEquals(-1, b1.compareTo(b2));
        assertEquals(1, b2.compareTo(b1));

        b1 = new BigNumber("35");
        b2 = new BigNumber("35");
        assertEquals(0, b2.compareTo(b1));

        b1 = new BigNumber("135467845634556778909546345234534534512335");
        b2 = new BigNumber("135467845634556778909546345234534534512332");
        assertEquals(1, b1.compareTo(b2));
        assertEquals(-1, b2.compareTo(b1));

/*        b1 = new BigNumber("56734564576346234567567834534565675674567");
        b2 = new BigNumber("9999999999999999463499999999999999999");
        assertEquals(new BigNumber("5673"), b1.div(b2)); */
    }

}