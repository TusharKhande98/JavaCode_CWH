import java.util.Scanner; // for user enter

public class CWH_19_CH4_PS {
    public static void main(String[] args) {

//  Q1. direct solution...
        int a = 11;
        if(a==11){  // in question this line is written as "a=11" which is wrong syntax
            System.out.println("I am 11");
        }
        else{
            System.out.println("i am not 11 bro");
        }

//  Q2. find whether student pass or fail,if it requires total 40% & atleast 33% in each subject, Assume 3 subjects & marks as i/p from user
        byte p1, c2, m3;  //we i/p marks in range of below 100, so 'byte' also works here instead of 'int'
        Scanner mk = new Scanner(System.in); // system.in means we give reference of 'keyboard'

        System.out.println("Enter your marks in Physics");
        p1 = mk.nextByte();
        System.out.println("Enter your marks in Chemistry");
        c2 = mk.nextByte();
        System.out.println("Enter your marks in Maths");
        m3 = mk.nextByte();

        float avg =(p1 + c2 + m3)/3.0f; // for take result in float
        System.out.println("Your overall percentage is: " + avg);
        if(avg>=40 && p1>=33 && c2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, You have not been promoted! please try again");
        }

//  Q3. calculate income tax paid by employee to govt. as per follows slab:-
//      [slab, tax]--->[2.5-5L, 5%], [5-10L, 20%], [above 10L, 30%]
        Scanner tx = new Scanner(System.in);
        System.out.println("Enter your income in lakh: ");
        float tax =0;
        float income = tx.nextFloat();

        if(income<2.5){ // dosent matter if we dont write this if loop
            tax = tax + 0; // we apply no tax mention for below 2.5 lakhs rupee
        }
        else if(income>2.5f && tax<=5f){
            tax = tax + 0.05f * (income - 2.5f); // if income is 4.5l then 4.5-2.5=2, so we calculate 0.05 percent of 2 lakh here
        }
        else if(income>5f && tax<=10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Total tax paid by employee is: " + tax);

//  Q4. find day of the week given the no. (eg.- mon-1, tuesday-2... so on)
        // we used enhaced switch method in this code
        System.out.println("Enter your no.: ");
        Scanner dy = new Scanner(System.in);
        int day = dy.nextInt();
        // we used enhanced method of swith so here we dont need to "break" anywhere
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

//  Q.5 find whether user entered year is leap year or not?
        // do it yourself...

//  Q.6 find type of website from URL---> [.com=commercial web], [.org=organisatoin web], [.in= indian website]
        Scanner wb = new Scanner(System.in);
        System.out.println("Enter your web end: ");
        String website = wb.next();

        if(website.endsWith(".org")){
            System.out.println("This is a Organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        if(website.endsWith(".in")){
            System.out.println("This is a Indian website");
        }
    }
}
