////////////////////////////////////////////////////////////////////  
// Angela Canazza 2111030  
// Linor Sadè 2111942  
////////////////////////////////////////////////////////////////////  
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 50) {
            throw new IntegerToRomanConversionException("Il numero deve essere compreso tra 1 e 50");
        }

        String[] romanLetters = { "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 50, 40, 10, 9, 5, 4, 1 };

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