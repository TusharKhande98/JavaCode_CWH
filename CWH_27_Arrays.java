public class CWH_27_Arrays {
    public static void main(String[] args) {

        int [] mark =  {100,60,70,50,80};
        System.out.println(mark[0]);
        System.out.println(mark.length);

        float [] markf =  {98,60.4f,70,50.09f,80};
        System.out.println(markf[1]);
        System.out.println(markf.length);

        String [] students =  {"Flash", "Lucifer", "Arrow"};
        System.out.println(students[2]);
        System.out.println(students.length);

    // displaying array in simple way(naive way)
        int [] cgpa = {6,7,8,9,10};
        System.out.println("printing by Naive way");
        System.out.println(cgpa[1]);
        System.out.println(cgpa[2]);
        System.out.println(cgpa[3]);

    // displaying array in for loop now to make code better
        System.out.println("Here we print all students CGPA using for loop");
        for (int i=0; i<cgpa.length; i++){
            System.out.println(cgpa[i]);
        }
        System.out.println("Here we print all students CGPA in decrementing(reverse) order");
        for (int i=cgpa.length-1; i>0; i--){
            System.out.println(cgpa[i]);
        }
    // Displaying array with FOR-EACH LOOP
        System.out.println("printing using for-each loop(this loop introduce in new version of JAVA)");
        for (int element: cgpa){
            System.out.println(element); // but in this loop we cant get value of 'i' as above
        }
    }
}
