import java.util.Scanner;

public class CWH_18_Else_If {
    public static void main(String[] args) {
    // CODE-I:- if-else or if-elseif-else ladder
        int age1;
        System.out.println("Enter your current age : ");
        Scanner ag = new Scanner(System.in);
        age1 = ag.nextInt();

        if (age1>56){
            System.out.println("You are experienced");
        }
        else if(age1>46){
            System.out.println("You are semi experinced");
        }
        else if(age1>36){
            System.out.println("You are not to experinced");
        }
        else{
            System.out.println("You not experinced");
        }

    // CODE-II:- switch case statement
        int age2;
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age2 = sc.nextInt();

        switch(age2){
            case 18:
                System.out.println("You are going to become an Adult!");
                break; // if we dosen't break so at age-18 it prints below line also (which is for age-24)
            case 24:
                System.out.println("You are going to become join a job!");
                break;
            case 60:
                System.out.println("You are going to retired now!");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("this line print after every case, thats w write it outside of above bracket ");

    // CODE-III:- switch case using variable:-
        String var = "Lucifer";

        switch (var) {  // take ur arrow on 'switch' word & left click to see enhance option & its syntax
            case "Flash":
                System.out.println("Get a power from lightning");
                break;
            case "Lucifer":
                System.out.println("Meet you in Hell, cauz u choose Lucifer");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
    }
}
