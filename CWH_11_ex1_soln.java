import java.util.Scanner;
public class CWH_11_ex1_soln {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter yur physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter yur english marks : ");
        int english = scan.nextInt();
        System.out.println("Enter yur chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter yur mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter yur mechanics marks : ");
        int mechanics = scan.nextInt();

        float percentage = ((physics + english + chemistry + mathematics + mechanics)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);

    }
}
 
