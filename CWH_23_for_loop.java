// for loop

public class CWH_23_for_loop {
    public static void main(String[] args) {
    // CODE-I:-
       for (int sv=0; sv<=130; sv +=13){
           System.out.println(sv);
       }

    // CODE-II:- odd no. logic-1
        for (int od=1; od<=10; od += 2){
            System.out.println(od);
        }
    // CODE-III:- odd no. logic-2
        int n = 20;
        for (int i=11; i<n; i += 2){
            System.out.println(i);
        }

    // CODE-IV:- decremented for loop
        for(int r=5; r>=-2; r--){
            System.out.println(r);
        }

        for(int dc=20; dc!=0; dc -=2){
            System.out.println(dc);
        }
    }
}
