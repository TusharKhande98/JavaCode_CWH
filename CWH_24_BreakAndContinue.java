// Break and continue using loops...

public class CWH_24_BreakAndContinue {
    public static void main(String[] args) {
    // CODE-I:- Break in for loop
        for (int i=0; i<5;i++) {
            System.out.println(i);
            System.out.println("Java is great");

            if(i==2){
                System.out.println("loop is breaked here");
                break;
            }
        }
        System.out.println("loop ends if u remove 'break' then it continues upto 5 times");

    // CODE-II:- Break in while loop
        int n=0;
        while (n<5) {
            System.out.println(n);
            System.out.println("JAVA is majboori bro");

            if (n == 2) {
                System.out.println("loop is breaked here");
                break;
            }
            n++;
        }
        System.out.println("Khatam tata good bye gaya");

    // CODE-III:- Break in do-while loop
        int w=0;
        do {
            System.out.println(w);
            System.out.println("python karna padega fir se bro");

            if (w == 2) {
                System.out.println("loop barbaad ho gaya");
                break;
            }
            w++;
        }while (w<5);
        System.out.println("khatam ho gaya, ab bol na 'upshabd'");

    // CODE-IV:- Continue in for loop
        for(int l=0; l<=4;l++) {
          if(l==2){
                System.out.println("loop-2 is escape & continue it to 3rd directly becauze of 'continue'");
                continue;
            }
            System.out.print(l); // our no.& statement print in 1 line, cauze we write 'print' instead 'println'
            System.out.println(" Jai Maharashtra");
        }

    // CODE-V:- Continue in do-while loop
        int h=0;
        do {
            h++; // it iterates then loop starts, so '5' also included cauz of increment firstly
            if (h==4) {
                System.out.println("loop barbaad ho gaya");
                continue;
            }
            System.out.println(h);
            System.out.println("python karna padega fir se bro");
        }while (h<5);
    }
}
