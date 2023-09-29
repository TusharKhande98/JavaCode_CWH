public class CWH_17_logical {
    public static void main(String[] args) {
    // CODE-I:-
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c){  // if 1 condition is false then whole thing is false in 'AND-&&' operator
            System.out.println("Right");
        }
        else{
            System.out.println("Wrong");
        }

    // CODE-II:-
        System.out.println("For Logical OR...");
        boolean aa = false;
        boolean bb = true;
        if (aa || bb){ // if 1 condition is true then whole thing is true in 'OR-||' operator (for false, both cond. have to be false)
            System.out.println("sahi hai bro");
        }
        else{
            System.out.println("galat hai bro");
        }
    // CODE-III:-
        System.out.println("For Logical NOT...");
        boolean ab = true;
        boolean bc = false;
        System.out.println("Not(ab) is ");
        System.out.println(!ab); // if its true, then !ab is false (it reversed the condition of true & false)
        System.out.println("Not(bc) is ");
        System.out.println(!bc);  // if its false, then !bc is true (i called NOT as an Inverter operator, which inversed the result)



    }
}
