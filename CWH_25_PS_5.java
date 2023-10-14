
public class CWH_25_PS_5 {
    public static void main(String[] args) {
        // Q.1 write program to print a pattern of '*'
        // code-i:-
        int e =4;
        for (int i=e; i>0; i--){
            for (int f=0; f<i; f++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // code-ii:-
        int q =6;
        for (int h=0; h<q; h++){
            for (int r=0; r<h; r++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Q.2 program to sum first n even nos. using while loop
        int sum = 0;
        int nth_even = 3;
        for(int i=0;i<=nth_even; i++){
            sum = sum + (2*i); // formula to generate even nos.
        }
        System.out.println("Sum of even nos. is: ");
        System.out.println(sum);

        // Q.3 program to print multiplication table of given no. 'n'
        int n =5;
        // for (int i=0; i<10; i++)---> goes from i=0 to i=9
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        // Q.4 program to print multiplication table of 10 in reverse order
        int m =10;
        for (int i=10; i>=1; i--){
            System.out.printf("%d X %d = %d\n", m, i, m*i);
        }
        // Q.5 program to find factorial of a given no. using FOR loop
        // DO IT YOUESELF...

        // Q.6 program to find factorial of a given no. using WHILE loop
        int fr = 5;
        int i = 1; // while multiplying dont write 'ZERO-0'
        int factorial = 1;
        while (i<=fr){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

        // Q.7 repeat Q1. with while loop, we do it with for loop already
        //  DO IT YOURSELF,...

        // Q.8 if we write a program in for loop, so can we write it with while & do-while also?
        // Ans---> YES (we done this in above code already)

        // Q.9 calculate sum of nos. occuring in multiplication table of '8'.

        int et =8;
        int sumOfTable = 0;
        for (int y=1; y<=10; y++){
            sumOfTable += et*y;
        }
        System.out.println(sumOfTable);

        // Q.9 How much time do while looop is executed?
        // Ans---> At least 1 time, cauz at entry time in loop  condtion is not checked...

        // Q.10 repeat Q2. with while loop, we do it with for loop already
        //  DO IT YOURSELF,...







    }
}
