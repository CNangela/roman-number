////////////////////////////////////////////////////////////////////  
// Angela Canazza 2111030  
// Linor Sadè 2111942  
////////////////////////////////////////////////////////////////////  
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 500) {
            throw new IntegerToRomanConversionException("Il numero deve essere compreso tra 1 e 500");
        }

        String[] romanLetters = { "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        //e modifico anche :
        if (number < 1 || number > 500) {
            throw new IntegerToRomanConversionException("Errore: conversione non supportata");
        }        

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