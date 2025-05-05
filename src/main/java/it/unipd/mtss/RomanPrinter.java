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
        String[][] asciiI = {
            {"  _____ "},
            {" |_   _|"},
            {"   | |  "},
            {"   | |  "},
            {"  _| |_ "},
            {" |_____|"}
        };

        StringBuilder asciiArt = new StringBuilder();

        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                if (c == 'I') {
                    asciiArt.append(asciiI[row][0]);
                }
            }
            asciiArt.append("\n");
        }

        return asciiArt.toString();
    }
}
