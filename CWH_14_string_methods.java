import java.util.Locale;

public class CWH_14_string_methods {
    public static void main(String[] args) {
        String barry = "FLASH-bhau";
        System.out.println(barry);

        int kiti_hay = barry.length();
        System.out.println(kiti_hay);

        String hell = "LUCIFER";
        String defg= hell.toLowerCase(); // it makes upper case to lower
        System.out.println(hell);

        String lower = barry.toUpperCase(); // it makes lower case to upper
        System.out.println(lower);

        String nonTrimedString = "      BRO     ";
        System.out.println(nonTrimedString); // here it prints spaces in o/p as above
        System.out.println(nonTrimedString.trim());  // here it dosen't prints spaces, after trim function

        System.out.println(hell.substring(3)); // it returns string at o/p from 3rd position to end position
        System.out.println(hell.substring(1)); // it returns UCIFER

        System.out.println(hell.substring(0,4)); // it gives 'LUCI', in this we can specify start & end both index/position
        System.out.println(hell.substring(2,5));  // it gives 'CIF' only

        System.out.println(barry.replace('F', 'S')); // here it replaces the words
        System.out.println(barry.replace("ASH", "IPS"));
        System.out.println(barry.replace("ASH", "LUTTER"));

        System.out.println(hell.startsWith("LUCI")); // it checks the name starts with 'LUCI' or not
        System.out.println(hell.startsWith("luci")); // it returns a boolian value 'true' or 'false'

        System.out.println(hell.endsWith("FER")); // it checks the name ends with 'FER' or not
        System.out.println(hell.endsWith("fer")); // gives false here...

        System.out.println(hell.charAt(3));  // it gives positional letter in word, here 'I' is on 3rd position
        System.out.println(hell.charAt(6));

        String king = "Morningstar";
        System.out.println(king .indexOf("Mor"));  // it gives a no. of from where this word/letter starts in string
        System.out.println(king .indexOf("ar"));
        System.out.println(king.indexOf("ning"));

        System.out.println(king.indexOf("r", 4));  // it sips first 'r', cauz we give command to search after position-4
        System.out.println(king.indexOf("fer", 4)); // it returns "-1", cauz there is no pair like this in string

        System.out.println(king.lastIndexOf("r")); // it gives location of last "r" (not first)
        System.out.println(king.lastIndexOf("r", 9)); // it serach location of "r" before 9th position, which is '2'

        System.out.println(hell.equals("Morningstar"));  // it's not equal so it gives "false"
        System.out.println(hell.equals("LUCIFER")); // it gives true, string is equal...
        System.out.println(hell.equals("lucifer")); // it gives false, cauz this string is in lowercase

        System.out.println(hell.equalsIgnoreCase("LucIfer")); // it ignores case of string & gives "TRUE" in output if word is correct


//   ESCAPE SEQUENCE:- how to write (",\,\t[use for tab/space]) code without error

    //    System.out.println("I am escape sequence " double quotte"); *we get error in this line*
        System.out.println("I am escape sequence \" double quotte");
        System.out.println("I am escape sequence \\ double quotte");
        System.out.println("I am escape sequence\tof space");


    }
}
