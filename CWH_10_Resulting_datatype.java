public class CWH_10_Resulting_datatype {
    public static void main(String[] args) {
        byte x =5;
        int y =6;
        short z = 8;
        int a = y+ z;
        float b = 6.54f + x;
        System.out.println(b);  // refer notes to understand it

// Increment & Decrement Operators ( + and -)
        int i = 56;
        System.out.println(i++); // here it increment but not print new value
        System.out.println(i); // it prints incremented value
        System.out.println(++i);
        System.out.println(i);

 //  i++ this format first use the value value then increment it
 //  i++ this format first increment value then use it

    // quiz example:-
    int v = 7;
    int w = ++v * 8;
    System.out.println(w);
    char ch ='a';
    System.out.println(++ch);

    }
}
