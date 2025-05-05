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
            { "  _____ ", " __      __" },  // riga 1
            { " |_   _|", " \\ \\    / /" },  // riga 2
            { "   | |  ", "  \\ \\  / / " },  // riga 3
            { "   | |  ", "   \\ \\/ /  " },  // riga 4
            { "  _| |_ ", "    \\  /   " },  // riga 5
            { " |_____|", "     \\/    " }   // riga 6
        };
    
        StringBuilder asciiArt = new StringBuilder();
    
        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                int index = "IV".indexOf(c);
                if (index >= 0) {
                    asciiArt.append(asciiLetters[row][index]);
                }
            }
            asciiArt.append("\n");
        }
    
        return asciiArt.toString();
    }
}
