package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class RomanPrinterTest {
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

    @Test
    public void PrintTest3() {
        String expectedArt1 = 
            " __      __  _____   _____ \n" 
            + " \\ \\    / / |_   _| |_   _|\n" 
            + "  \\ \\  / /    | |     | |  \n" 
            + "   \\ \\/ /     | |     | |  \n" 
            + "    \\  /     _| |_   _| |_ \n" 
            + "     \\/     |_____| |_____|\n";
        String expectedArt2 = 
            " __      __  _____   _____   _____ \n" 
            + " \\ \\    / / |_   _| |_   _| |_   _|\n" 
            + "  \\ \\  / /    | |     | |     | |  \n" 
            + "   \\ \\/ /     | |     | |     | |  \n" 
            + "    \\  /     _| |_   _| |_   _| |_ \n" 
            + "     \\/     |_____| |_____| |_____|\n";
        String expectedArt3 = 
              "  _____  __   __\n" 
            + " |_   _| \\ \\ / /\n" 
            + "   | |    \\ V / \n" 
            + "   | |     > <  \n" 
            + "  _| |_   / . \\ \n" 
            + " |_____| /_/ \\_\\\n";
        String expectedArt4 = 
            " __   __\n" 
            + " \\ \\ / /\n" 
            + "  \\ V / \n" 
            + "   > <  \n" 
            + "  / . \\ \n" 
            + " /_/ \\_\\\n";
        assertEquals(expectedArt1, RomanPrinter.print(7));
        assertEquals(expectedArt2, RomanPrinter.print(8));
        assertEquals(expectedArt3, RomanPrinter.print(9));
        assertEquals(expectedArt4, RomanPrinter.print(10));
    }

    @Test
    public void PrintTest4() {
        String expectedArt1 = 
        " __   __ __      __\n" 
        + " \\ \\ / / \\ \\    / /\n" 
        + "  \\ V /   \\ \\  / / \n" 
        + "   > <     \\ \\/ /  \n" 
        + "  / . \\     \\  /   \n" 
        + " /_/ \\_\\     \\/    \n";
        String expectedArt2 = 
        " __   __  _____  __   __\n" 
        + " \\ \\ / / |_   _| \\ \\ / /\n" 
        + "  \\ V /    | |    \\ V / \n" 
        + "   > <     | |     > <  \n" 
        + "  / . \\   _| |_   / . \\ \n" 
        + " /_/ \\_\\ |_____| /_/ \\_\\\n";
        String expectedArt3 = 
         " __   __ __   __\n" 
        +" \\ \\ / / \\ \\ / /\n" 
        +"  \\ V /   \\ V / \n" 
        +"   > <     > <  \n" 
        +"  / . \\   / . \\ \n" 
        +" /_/ \\_\\ /_/ \\_\\\n";
        assertEquals(expectedArt1, RomanPrinter.print(15));
        assertEquals(expectedArt2, RomanPrinter.print(19));
        assertEquals(expectedArt3, RomanPrinter.print(20));
    }
    @Test
    public void PrintTest5() {
        String expectedArt1 =
         " __   __ __   __ __   __\n"
         +" \\ \\ / / \\ \\ / / \\ \\ / /\n"
         +"  \\ V /   \\ V /   \\ V / \n"
         +"   > <     > <     > <  \n"
         +"  / . \\   / . \\   / . \\ \n"
         +" /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n";
        String expectedArt2 =
         " __   __  _      \n"
         +" \\ \\ / / | |     \n"
         +"  \\ V /  | |     \n"
         +"   > <   | |     \n"
         +"  / . \\  | |____ \n"
         +" /_/ \\_\\ |______|\n";
        String expectedArt3 =
         "  _      \n"
         +" | |     \n"
         +" | |     \n"
         +" | |     \n"
         +" | |____ \n"
         +" |______|\n";
        assertEquals(expectedArt1, RomanPrinter.print(30));
        assertEquals(expectedArt2, RomanPrinter.print(40));
        assertEquals(expectedArt3, RomanPrinter.print(50));
    }
    @Test
    public void PrintTest6() {
        String expectedArt1 =
          "  _       __   __\n"
         +" | |      \\ \\ / /\n"
         +" | |       \\ V / \n"
         +" | |        > <  \n"
         +" | |____   / . \\ \n"
         +" |______| /_/ \\_\\\n";
        String expectedArt2 =
          "  _       __   __ __   __\n"
         +" | |      \\ \\ / / \\ \\ / /\n"
         +" | |       \\ V /   \\ V / \n"
         +" | |        > <     > <  \n"
         +" | |____   / . \\   / . \\ \n"
         +" |______| /_/ \\_\\ /_/ \\_\\\n";
        String expectedArt3 =
         "  _       __   __ __   __ __   __\n"
        +" | |      \\ \\ / / \\ \\ / / \\ \\ / /\n"
        +" | |       \\ V /   \\ V /   \\ V / \n"
        +" | |        > <     > <     > <  \n"
        +" | |____   / . \\   / . \\   / . \\ \n"
        +" |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n";
        String expectedArt4 =
         " __   __   _____ \n"
         +" \\ \\ / /  / ____|\n"
         +"  \\ V /  | |     \n"
         +"   > <   | |     \n"
         +"  / . \\  | |____ \n"
         +" /_/ \\_\\  \\_____|\n";
        String expectedArt5 =
         "   _____ \n"
        +"  / ____|\n"
        +" | |     \n"
        +" | |     \n"
        +" | |____ \n"
        +"  \\_____|\n";
        assertEquals(expectedArt1, RomanPrinter.print(60));
        assertEquals(expectedArt2, RomanPrinter.print(70));
        assertEquals(expectedArt3, RomanPrinter.print(80));
        assertEquals(expectedArt4, RomanPrinter.print(90));
        assertEquals(expectedArt5, RomanPrinter.print(100));
    }
    @Test
    public void PrintTest7() {
        String expectedArt1 =
         "   _____    _____ \n"
        +"  / ____|  / ____|\n"
        +" | |      | |     \n"
        +" | |      | |     \n"
        +" | |____  | |____ \n"
        +"  \\_____|  \\_____|\n";
        String expectedArt2 =
         "   _____    _____    _____ \n"
        +"  / ____|  / ____|  / ____|\n"
        +" | |      | |      | |     \n"
        +" | |      | |      | |     \n"
        +" | |____  | |____  | |____ \n"
        +"  \\_____|  \\_____|  \\_____|\n";
        String expectedArt3 =
         "   _____   _____  \n"
        +"  / ____| |  __ \\ \n"
        +" | |      | |  | |\n"
        +" | |      | |  | |\n"
        +" | |____  | |__| |\n"
        +"  \\_____| |_____/ \n";
        String expectedArt4 =
         "  _____  \n"
        +" |  __ \\ \n"
        +" | |  | |\n"
        +" | |  | |\n"
        +" | |__| |\n"
        +" |_____/ \n";
        assertEquals(expectedArt1, RomanPrinter.print(200));
        assertEquals(expectedArt2, RomanPrinter.print(300));
        assertEquals(expectedArt3, RomanPrinter.print(400));
        assertEquals(expectedArt4, RomanPrinter.print(500));
    }
    @Test
    public void PrintTest8() {
        String expectedArt1 =
        "  _____     _____ \n"
        +" |  __ \\   / ____|\n"
        +" | |  | | | |     \n"
        +" | |  | | | |     \n"
        +" | |__| | | |____ \n"
        +" |_____/   \\_____|\n";
        String expectedArt2 =
         "  _____     _____    _____ \n"
        +" |  __ \\   / ____|  / ____|\n"
        +" | |  | | | |      | |     \n"
        +" | |  | | | |      | |     \n"
        +" | |__| | | |____  | |____ \n"
        +" |_____/   \\_____|  \\_____|\n";
        String expectedArt3 =
         "  _____     _____    _____    _____ \n"
        +" |  __ \\   / ____|  / ____|  / ____|\n"
        +" | |  | | | |      | |      | |     \n"
        +" | |  | | | |      | |      | |     \n"
        +" | |__| | | |____  | |____  | |____ \n"
        +" |_____/   \\_____|  \\_____|  \\_____|\n";
        String expectedArt4 =
         "   _____   __  __ \n"
        +"  / ____| |  \\/  |\n"
        +" | |      | \\  / |\n"
        +" | |      | |\\/| |\n"
        +" | |____  | |  | |\n"
        +"  \\_____| |_|  |_|\n";
        String expectedArt5 =
         "  __  __ \n" 
        +" |  \\/  |\n" 
        +" | \\  / |\n" 
        +" | |\\/| |\n" 
        +" | |  | |\n" 
        +" |_|  |_|\n";
        assertEquals(expectedArt1, RomanPrinter.print(600));
        assertEquals(expectedArt2, RomanPrinter.print(700));
        assertEquals(expectedArt3, RomanPrinter.print(800));
        assertEquals(expectedArt4, RomanPrinter.print(900));
        assertEquals(expectedArt5, RomanPrinter.print(1000));
    }
    }