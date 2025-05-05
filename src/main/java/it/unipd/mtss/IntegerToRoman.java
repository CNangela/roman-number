////////////////////////////////////////////////////////////////////  
// Angela Canazza 2111030  
// Linor Sadè 2111942  
////////////////////////////////////////////////////////////////////  
package it.unipd.mtss;

/**
 * Hello world!
 *
 */
public class IntegerToRoman 
{
    public static String convert(int number) {
        if (number == 1){ return "I";}
        if (number == 2){return "II";}
        if (number == 3){return "III";}
        if (number == 4){return "IV";}
        if (number == 5){return "V";}
        if (number == 6){ return "VI";}
        return null;
    }
    
}
