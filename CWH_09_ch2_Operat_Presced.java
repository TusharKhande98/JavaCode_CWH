public class CWH_09_ch2_Operat_Presced {
    public static void main(String[] args) {
        // Precedance & Associativity
        int a = 6*5-34/2;
// Highest precedance goes to * and /. then its evaluated on basis of left to right associativity.
//        = 30-34/2 first mult. then div.
//        =  30-17 =13

        int b = 60/5-34*2;
//      = 12-34*2 first div. then mult.
//      = 12-68  =-56

        System.out.println(a);
        System.out.println(b);

// how to write a value from mathematical formula
// eg.- [1] x-y/2, [2] b*b-4ac/c, [3] v*v-u*u, [4] a*b-d

        // this is formula-1
        int x = 6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);

        // this is formula-2 (we use a=p, b=q, c=r)cauz we already use a,b,c in above code
        int p = 5;
        int q = 1;
        int r = 4;
        int t = (q*q - 4*p*r)/(2*p);
        System.out.println(t);

 // refer Precedance & Associativity rule for exam question

    }
}
