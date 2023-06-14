// strings...

import java.util.Scanner;

public class CWH_13_string {
    public static void main(String[] args) {

//  CODE-I:-
        String lightning = new String("DEVIL");
        System.out.print(lightning);
// in aboe  we write print instead of 'println' so next o/p also attach with this o/p without gap in line as below we see

        System.out.println("The name is: ");
        System.out.println(lightning);

// 2 more methods to print in java:-
      // below format is method-1 (we learn this syntax in C language(refer notes
        int qq = 6;
        float cc = 5.713247f;
        System.out.printf("The value of a qq is %d and value of cc is %7.2f", qq,cc);
//// line 20&28 is same, but in above line we wrote "%7.2f",
//   means it create 7 spaces in o/p line & shows only 2 decimal after value, see at o/p this difference (its important)

 //  eigther use printf or format while run this code, both line cant show output at one time
        // below format is method-2
        int xt = 23;
        float yz = 38.77f;
        System.out.format("The value of a xt is %d and value of yz is %f", xt,yz);

//  CODE-II:-
        Scanner fa = new Scanner(System.in);
        String aq = fa.next(); // this syntax takes only 1 word from entered line in string at o/p
        System.out.println(aq);

        Scanner sc = new Scanner(System.in);
        String dl = sc.nextLine(); // this syntax takes whole entered line in a string at o/p
        System.out.println(dl);

    }
}
