import java.awt.*;
import java.util.Locale;

public class CWH_15_PS3 {
    public static void main(String[] args) {

//  Q1. Program to convert a string to lowercase
        String dude = "IRON man";
        dude = dude.toLowerCase(); // it converts string to lower
        System.out.println(dude); // here it shows converted string

//  Q2. Program to replace spacec with underscores(_)
        String alpha = "I repeat Over & out";
        alpha = alpha.replace(" ", "_"); // strings are immutable, but here it represents new format of 'alpha' string with some changes
        System.out.println(alpha);

//  Q3. Program to fill a letter template which looks as---> letter = "Dear<|name|>, thanks a lot"
//      replace <|name|> with a string(means some name)
        String letter = "Dear <|name|>, thanks a lot"; // we write <|name|> in special format to change only the word present in this format
        letter = letter.replace("<|name|>", "arjun");
        System.out.println(letter);

//  Q4. Program to detect double & triple spaces in a string
        String myString = "This strings  contains   double & triple spaces";
        System.out.println(myString.indexOf("  ")); // it gives 12 at o/p for finding double spaces
        System.out.println(myString.indexOf("   ")); // it gives 22 at o/p for finding triple spaces
        System.out.println(myString.indexOf("    ")); // it gives '-1' cauz there is no four spaces we gives in line

//  Q5. Program to print in format letters(line by line) in line using escape sequence:-
//      myletter = "Dear harry, This JAVA course is nice thanks"
        String format1 = "Dear harry, This JAVA course is nice thanks";
        System.out.println(format1); // it prints it in one line as it is

        String format2 = "Dear harry, \nThis JAVA course is nice. \nThanks";
        System.out.println(format2); // here it prints in different lines

        String format3 = "Dear harry, \n\tThis JAVA course is nice. \n\tThanks";
        System.out.println(format3); // here it prints in different lines & spaces(tab) also



    }
}
