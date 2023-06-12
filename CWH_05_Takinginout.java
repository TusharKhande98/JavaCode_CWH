import java.util.Scanner;

public class CWH_05_Takinginout {
    public static void main(String[] args) {
        System.out.println("write 'sout & press enter' we get this syntax typed.\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");  // enter int
        int a = sc.nextInt();
        System.out.println("Enter number 2");  // enter int
        int b = sc.nextInt();
        System.out.println("Enter number 3");  // enter float
        float c = sc.nextFloat();
        System.out.println("Enter number 4");  // enter float
        float d = sc.nextFloat();

        int sum = a+ b;           // it do sum of int
        float addition = c+ d;    // it do addition of float nos.

        System.out.println("sum of the integer numbers is: ");   // it gives o/p in int value from below line
        System.out.println(sum);
        System.out.println("addition of the float numbers is: ");  // it gives o/p in float value from below line
        System.out.println(addition);
// below line is extra for understanding that syntax above code is completed already

        String str = sc.next(); //this syntax print only 1 word from inputed line
        System.out.println(str);
        String rst = sc.nextLine(); //this syntax print whole line;
        System.out.println(rst);
        // I get some error while compile those above 4-5 lines, solve it later

//        boolean b1 = sc.hasNextInt(); // this gives true or false after type a no. is it 'int' or not
//        System.out.println(b1);

    }
}
