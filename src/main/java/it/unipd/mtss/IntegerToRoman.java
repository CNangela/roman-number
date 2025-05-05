////////////////////////////////////////////////////////////////////  
// Angela Canazza 2111030  
// Linor Sadè 2111942  
////////////////////////////////////////////////////////////////////  
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        String[] romanLetters = {"X", "IX", "V", "IV", "I" };
        int[] values = {10, 9, 5, 4, 1 };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(romanLetters[i]);
            }
        }

        return result.toString();
    }
}