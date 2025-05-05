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
    public void testEccezioneInferiore() {
        try {
            IntegerToRoman.convert(0);
            fail("Eccezione attesa non lanciata");
        } catch (IntegerToRomanConversionException e) {
            assertEquals("Il numero deve essere compreso tra 1 e 50", e.getMessage());
        }
    }

    @Test
    public void testEccezioneSuperiore() {
        try {
            IntegerToRoman.convert(51);
            fail("Eccezione attesa non lanciata");
        } catch (IntegerToRomanConversionException e) {
            assertEquals("Il numero deve essere compreso tra 1 e 50", e.getMessage());
        }
    }

}