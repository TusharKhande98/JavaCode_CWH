public class CWH_28_multi_dim_array {
    public static void main(String[] args) {
        int [] marks; // its a 1-D array
        int [] [] flats; // ita a 2-D array

        flats = new int [2][3]; // assume 2-->Ground Floor & 3-->House no.
        flats[0][0] = 101;
        flats[0][1] = 102;  //--->ground floor & 1st house
        flats[0][2] = 103;
        flats[1][0] = 201;  // 201 is no. of house
        flats[1][1] = 202;
        flats[1][2] = 203;  //--->1st floor & 2nd house

    // Displaying 2-D array (for loop)
        System.out.println("Here we printing 2-D array using for loop");
        for (int i=0; i<flats.length; i++){ // by my logic it counts ground
            for (int j=0; j<flats[i].length; j++) { // & this nested loop counts house
                System.out.print(flats[i][j]); // here it saved ground & house & generate house no.
                System.out.print(" "); // after 1 house no. it adds a gap & start loop again to print 2nd house no.

            }
            System.out.println(""); // it prints 'floor-1' in new line by above same process
        }





    }
}
