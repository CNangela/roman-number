package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {

    @Test
    public void testConvert1() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvert2() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvert3() {
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvert4() {
        assertEquals("XV", IntegerToRoman.convert(15));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvert5() {
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XXXI", IntegerToRoman.convert(31));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLV", IntegerToRoman.convert(45));
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvert6() {
        assertEquals("LX", IntegerToRoman.convert(60));
        assertEquals("LXX", IntegerToRoman.convert(70));
        assertEquals("LXXX", IntegerToRoman.convert(80));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCI", IntegerToRoman.convert(91));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvert7() {
        assertEquals("CC", IntegerToRoman.convert(200));
        assertEquals("CCC", IntegerToRoman.convert(300));
        assertEquals("CCCIX", IntegerToRoman.convert(309));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("CDI", IntegerToRoman.convert(401));
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvert8() {
        assertEquals("DC", IntegerToRoman.convert(600));
        assertEquals("DCC", IntegerToRoman.convert(700));
        assertEquals("DCCC", IntegerToRoman.convert(800));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("CMI", IntegerToRoman.convert(901));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void testEccezioneInferiore() {
        try {
            IntegerToRoman.convert(0);
            fail("Eccezione attesa non lanciata");
        } catch (IntegerToRomanConversionException e) {
            assertEquals("Il numero deve essere compreso tra 1 e 1000", e.getMessage());
        }
    }

    @Test
    public void testEccezioneSuperiore() {
        try {
            IntegerToRoman.convert(1001);
            fail("Eccezione attesa non lanciata");
        } catch (IntegerToRomanConversionException e) {
            assertEquals("Il numero deve essere compreso tra 1 e 1000", e.getMessage());
        }
    }

}