public class CWH_22_CH5_do_while {
    public static void main(String[] args) {

    // CODE-I:-
         int b =0;
         do{ // without checking '0' loop starts
             System.out.println(b);
             b++;
         }while (b<5); // & prints 0,1,2,3,4

    // CODE-II:-
        int y =10;
        do{ // loop is directly start without checking above value
            System.out.println(y);
            b++;
        }while (y<5); // it prints '10' even after cond is false cause, it starts then compare values

    // CODE-III:-
        int c =0;
        do{
            System.out.println(c);
            c += 3;
        }while (c<22);



    }
}
