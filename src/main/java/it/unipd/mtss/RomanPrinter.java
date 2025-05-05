////////////////////////////////////////////////////////////////////  
// Angela Canazza 2111030  
// Linor Sadè 2111942  
////////////////////////////////////////////////////////////////////  

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {

        String[][] asciiLetters = {
            { "  _____ ", " __      __", " __   __", "  _      "},
            { " |_   _|", " \\ \\    / /", " \\ \\ / /", " | |     ", },
            { "   | |  ", "  \\ \\  / / ", "  \\ V / ", " | |     ",},
            { "   | |  ", "   \\ \\/ /  ", "   > <  ", " | |     ",},
            { "  _| |_ ", "    \\  /   ", "  / . \\ ", " | |____ " },
            { " |_____|", "     \\/    ", " /_/ \\_\\", " |______|" }
        };
        
        StringBuilder asciiArt = new StringBuilder();


        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                int index = "IVXL".indexOf(c);
                if (index >= 0) {
                    asciiArt.append(asciiLetters[row][index]);
                }
            }
            asciiArt.append("\n");
        }

        return asciiArt.toString();
    }
}
