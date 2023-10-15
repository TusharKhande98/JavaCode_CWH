// Que.--->why to use array?
// Ans --> accesing elements in array is faster

public class CWH_26_Arrays {
    public static void main(String[] args) {
    // we have to store marks of 5 students
        int [] marks = new int[5]; // here it allocates a meomory to store marks of 5 students
    // it takes 20 bytes to store 5 elements (0, 1,2,3,4 these are 5 elements)
        marks[0] =100;
        marks[1] =60;
        marks[2] =70;
        marks[3] =80;
        marks[4] =90; // if we write 'marks[4] =40' again, so '40' is overwrite at o/p instead '80'
        System.out.println(marks[4]);

    /* there are 3 ways to declare arrays:-
        1. int[] marks; ---> Declaration
           marks = new int[5]; --> memory allocation

        2. int[] marks = new int[5]; --> Declaration + memory allocaiton

        3. int[] marks = {100,60,70,50,80} --> Declare + initialize
    */
    // now we see third type from above:-
        int [] mark =  {100,60,70,50,80};
        System.out.println(mark[1]);


    }
}
