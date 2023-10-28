public class CWH_31_methods {
    // if we have a program with repeated logic, so use this method technique
// here we create a logic function, then use it as a 1 line in our code
    static int logic(int x, int y){  // 'static' word is important to write here in code
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;  // a variables's copy goes to x inside above logic
        int b = 7;  // b variables's copy goes to y inside above logic
        int c;
        c = logic(a, b); // these line calls a logic & gives answer

        int aa = 2;
        int bb = 1;
        int cc;
        cc = logic(aa, bb);
        System.out.println(c);
        System.out.println(cc);








    }
}
