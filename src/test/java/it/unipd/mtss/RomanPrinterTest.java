package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import it.unipd.mtss.RomanPrinter;
import it.unipd.mtss.IntegerToRoman;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {

    private static MockedStatic<IntegerToRoman> mockedConverter;

    @BeforeClass
    public static void setUpMock() {
        // Inizializza il mock statico una sola volta
        mockedConverter = Mockito.mockStatic(IntegerToRoman.class);

        // Simula i comportamenti del convertitore
        mockedConverter.when(() -> IntegerToRoman.convert(1)).thenReturn("I");
        mockedConverter.when(() -> IntegerToRoman.convert(2)).thenReturn("II");
        mockedConverter.when(() -> IntegerToRoman.convert(3)).thenReturn("III");
        mockedConverter.when(() -> IntegerToRoman.convert(4)).thenReturn("IV");
        mockedConverter.when(() -> IntegerToRoman.convert(5)).thenReturn("V");
        mockedConverter.when(() -> IntegerToRoman.convert(6)).thenReturn("VI");
    }
	
			@AfterClass
			public static void tearDownMock() {
	    mockedConverter.close();
		}

    @Test
    public void PrintTest1() {
        String expectedArt1 = 
         "  _____ \n"
        +" |_   _|\n"
        +"   | |  \n"
        +"   | |  \n"
        +"  _| |_ \n"
        +" |_____|\n";
        String expectedArt2 = 
         "  _____   _____ \n"
        +" |_   _| |_   _|\n"
        +"   | |     | |  \n"
        +"   | |     | |  \n"
        +"  _| |_   _| |_ \n"
        +" |_____| |_____|\n";
        String expectedArt3 = 
         "  _____   _____   _____ \n"
        +" |_   _| |_   _| |_   _|\n"
        +"   | |     | |     | |  \n"
        +"   | |     | |     | |  \n"
        +"  _| |_   _| |_   _| |_ \n"
        +" |_____| |_____| |_____|\n";
        assertEquals(expectedArt1, RomanPrinter.print(1));
        assertEquals(expectedArt2, RomanPrinter.print(2));
        assertEquals(expectedArt3, RomanPrinter.print(3));
    }

    @Test
    public void PrintTest2() {
        String expectedArt1 = 
         "  _____  __      __\n" 
        + " |_   _| \\ \\    / /\n" 
        + "   | |    \\ \\  / / \n" 
        + "   | |     \\ \\/ /  \n" 
        + "  _| |_     \\  /   \n" 
        + " |_____|     \\/    \n";
        
        String expectedArt2 = 
        " __      __\n" 
        + " \\ \\    / /\n" 
        + "  \\ \\  / / \n" 
        + "   \\ \\/ /  \n" 
        + "    \\  /   \n" 
        + "     \\/    \n";
        
        String expectedArt3 = 
          " __      __  _____ \n" 
        + " \\ \\    / / |_   _|\n" 
        + "  \\ \\  / /    | |  \n" 
        + "   \\ \\/ /     | |  \n" 
        + "    \\  /     _| |_ \n" 
        + "     \\/     |_____|\n";
    
        assertEquals(expectedArt1, RomanPrinter.print(4));
        assertEquals(expectedArt2, RomanPrinter.print(5));
        assertEquals(expectedArt3, RomanPrinter.print(6));
    }

    
    }