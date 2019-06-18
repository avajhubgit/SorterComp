package test.java;

import main.java.sortercomp.ParseLamb;
import main.java.sortercomp.ParseLambUtils;
import main.java.sortercomp.ParseWithOutLamb;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ParseLambTest {

    @Test
    public void extractNumberWithLambda() {
        ParseLamb parseLamb = new ParseLamb();
        assertEquals("", "", parseLamb.extractNumberFromString(""));
        assertEquals("", "0123456789.", parseLamb.extractNumberFromString("0123456789."));
        assertEquals("", "78025679", parseLamb.extractNumberFromString("78x025K67z9"));

        assertEquals("", "", parseLamb.extractNumberFromString("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("", "64081951237", parseLamb.extractNumberFromString("a6bc4d0efg81hij9klm5n1opqr2stu3vw7xyz"));
        assertEquals("", "6408195.1237", parseLamb.extractNumberFromString("a6bc4d0efg81hij9klm5n.1opqr2stu3vw7xyz"));

        assertEquals("", "", parseLamb.extractNumberFromString("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals("", "9510624378", parseLamb.extractNumberFromString("A9B51C0D6E2FGHIJ4KLMNOPQ3RSTU7VWX8YZ"));
        assertEquals("", "95106243.78", parseLamb.extractNumberFromString("A9B51C0D6E2FGHIJ4KLMNOPQ3RSTU.7VWX8YZ"));
    }

    @Test
    public void extractNumberWithOutLambda() {
        ParseWithOutLamb parseWithoutLamb = new ParseWithOutLamb();
        assertEquals("", "", parseWithoutLamb.extractNumberFromString(""));
        assertEquals("", "0123456789", parseWithoutLamb.extractNumberFromString("0123456789"));
        assertEquals("", "78025679", parseWithoutLamb.extractNumberFromString("78x025K67z9"));
        assertEquals("", "95720398571345892867080", parseWithoutLamb.extractNumberFromString("95720398571-345892867080-"));

        assertEquals("", "", parseWithoutLamb.extractNumberFromString("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("", "64081951237", parseWithoutLamb.extractNumberFromString("a6bc4d0efg81hij9klm5n1opqr2stu3vw7xyz"));
        assertEquals("", "6408195.1237", parseWithoutLamb.extractNumberFromString("a6bc4d0efg81hij9klm5n.1opqr2stu3vw7xyz"));

        assertEquals("", "", parseWithoutLamb.extractNumberFromString("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals("", "9510624378", parseWithoutLamb.extractNumberFromString("A9B51C0D6E2FGHIJ4KLMNOPQ3RSTU7VWX8YZ"));
        assertEquals("", "95106243.78", parseWithoutLamb.extractNumberFromString("A9B51C0D6E2FGHIJ4KLMNOPQ3RSTU.7VWX8YZ"));
    }


    @Test
    public void lambdaAndStreamTest() {
        assertEquals("", "nullnullnullnullnullnull", ParseLambUtils.flatMapStreamString(new String[2][3]));
        assertEquals("", "a6bc4d0efg81hij9klm5n1opqr2stu3vw7xyz",
                ParseLambUtils.flatMapStreamString(new String[][]{{"a6b", "c4d", "0ef", "g81"}, {"hij", "9kl", "m5n", "1op"}, {"qr2", "stu", "3vw", "7xyz"}}));

        assertEquals(0L, ParseLambUtils.countEmptyStringInList(Arrays.asList()));
        assertEquals(2L, ParseLambUtils.countEmptyStringInList(Arrays.asList("", "")));
        assertEquals(2L, ParseLambUtils.countEmptyStringInList(Arrays.asList("", "893576jkdasfg", "", "jkahlYHJGKHJ")));

        ParseLambUtils.showFiveRandomNumbers();
        ParseLambUtils.showSquareNumbers();
    }

}
