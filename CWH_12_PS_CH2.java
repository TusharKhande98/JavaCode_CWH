import javax.management.MBeanAttributeInfo;

import java.util.Scanner;

// this above function is used when we want to take user defined no. from user

public class CWH_12_PS_CH2 {
    public static void main(String[] args) {

//  Q.1 what is the result of--->  a = 7/4 * 9/2.

        float aw = 7/4 * 9/2; // it gives wrong output, cauz operation is calulated in int values here
        System.out.println(aw);
        float av = 7/4f * 9/2F; // now it gives correct output, cauz we declare this value as 'float'
        System.out.println(av);

//  Q.2 write program to encrypt a grade by adding '8' to it, Decrypt it to show the correct grade
//    its just like a secret word(eg.- marks), if we want to tell only to 1 person, so other cant understand it

        char grade = 'B'; // imagine its a grade that we got in class
//      grade = grade + 8; // if we write like this so we get 1 problem, if we do arithmatic operation in char & int we get 'int' in o/p
//  we solve this problem by typecasting
        grade =  (char)(grade + 8); // we convert this value into a character format
        System.out.println(grade); // here we get 'J'(B+8=j [alphabetically]) in output which is not a grade

//  now we decrypt that grade
        grade =  (char)(grade - 8);
        System.out.println(grade);

//  Q.3 use comparison operator to find given no. is greater or not that user's entered no.

        Scanner sc = new Scanner(System.in);
        int aq = sc.nextInt();
        System.out.println(aq>8); // it gives true or false at o/p

 // input value for above after run, then below's code will run

//  Q.4 write given expression in java program:- v*v-u*u/2as

        int v = 23;
        int u = 12;
        int a = 9;
        int s = 2;

        int form = (v*v - u*u)/(2*a*s);
        System.out.println(form);

//  Q.4 find value of expression:- int x=7 & int a = 7*49/7 + 35/7
        // we can do this in one line as below cauz its a simple calculation

        System.out.println(7*49/7+35/7);

    }
}
