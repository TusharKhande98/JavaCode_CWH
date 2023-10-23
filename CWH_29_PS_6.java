public class CWH_29_PS_6 {
    public static void main(String[] args) {

 // Q1. create an array of 5 floats & calculate their sum
float [] studentsMarks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
float summation = 0;
for (float element: studentsMarks){  // we can write anything instead of 'element;
    summation = summation + element;
}
        System.out.println("The value of sum is " + summation);

 // Q2. findout whether a given integer is present ion an array or not
        float [] findArray = {56.7f, 67.8f, 63.4f, 99.2f};
        float numb = 67.8f;
        boolean isInArray = false;  // first we declare that its not present, but in below loop
        for (float element: findArray){
            if(numb==element){ // if its present, so we make it true & then break it
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in array");
        }
        else {
            System.out.println("The value is not present in array");
        }

 // Q3. calculate avg marks from an array contaning ,arks of all students in physics using for loop
        float [] studentAvg = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float avgmk = 0;
        for (float avrage: studentAvg){
            avgmk = avgmk + avrage;
        }
        System.out.println("The value of average marks " + avgmk/studentAvg.length);

 // Q4. add 2 matrices of size 2x3
        int [][] mat1 = {{1, 2, 3},  // this matrix format contains "2-rows & 3-columns"
                        {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                        {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
        for (int i=0;i<mat1.length;i++){ // this loop runs 'row number of times'
            for (int j=0;j<mat1[i].length;j++){ // this loop runs 'column number of times'
                //System.out.format("setting value for i=%d and j=%d\n", i, j); // this line contain only extra work, dont add this to code(its only for chul)
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " "); // if we type 'println' instead print so all values print in a new line
            }                         // & write empty space also(" ") as above, cauz it create spaces between separate values
            System.out.println(""); // if we dont write this line, so all values are prints in a row not in a matrix format
        }

        // Q5. write program to reverse an array
        int z = Math.floorDiv(10, 2); // this java iunbuilt function gives us divisable value
        System.out.println(z); // we use it below, this was just a sample of mathfloordiv

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int l = arr.length;
        int ar = Math.floorDiv(l, 2);
        int temp; // we declare it to reverse arrays as we explain follow

        for (int i =0; i<ar; i++){ // this loop run upto half of array
            // now we swap a[i] with a[l-1-i] its a logic for swapping or reversing
// imagination.  // we made 1 temp box like |a| |b| |temp|
// point.    // store 'a' in temp---> |empty| |b| |a|
            // store 'b' in 1st box now---> |b| |empty| |a|
            // store 'a' in 2nd box now---> |b| |a| |empty|

            temp = arr[i]; // as line-63
            arr[i] = arr[l-i-1]; // as line-64
            arr[l-i-1] = temp; // as line-65, at this point array is reversed
         }
        for (int revElement: arr){ // we write revelement instead of element, this syntax means revelements in arr(our declared name for array)
            // System.out.println(revElement); // here it prints o/p values in new line(vrtically)
            System.out.print(revElement + " "); // this format print o/p in one line with some spaces
  // dont run both o/p lines together it makes o/p wrong, & dont show it correctly
        }   System.out.print("\n"); // this line i write to print next line for blow's code o/p

         // Q6. find maximum in an array
        int [] arry = {1, 21, 3, 455, 5, 34, 67};
        int max = 0;
        for (int motha: arry){
            if(motha > max){
                max = motha;
            }
        }
        System.out.println("the value of maximum element in this array is: "+ max);

         // Q7. find minimum element in array
        int [] arya = {1,-80,40,3,1,-7};
        System.out.println(Integer.MIN_VALUE);  // demo
        System.out.println(Integer.MAX_VALUE);  // for upto which value it stored
        int min = Integer.MAX_VALUE;
        for (int lahan: arya){
            if(lahan <  min){
                min = lahan;
            }
        }
        System.out.println("the value of minimum element in this array is: " + min);

        // Q8. find whether an array is sorted or not
        boolean isSorted = true;
        int [] arrm = {1,2,3,4,5};
        for (int i=0; i<arrm.length-1; i++){  // length-1 = cauz we compare 3 with 6, same 6-2,2-4,4-6,6-1, but remaning 1 dont have any no. on RHS so we write it
            if(arrm[i] > arrm[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The arraty is not sorted");
        }









    }
}
