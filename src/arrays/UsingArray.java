package arrays;

import java.util.Arrays;

public class UsingArray {
    public static void main(String[] args) {
        /*
         * here we learn how to initialize and declare a 1-d array as well as print it.
         */
        int[] arrayName = new int[]{1, 2, 3, 4, 5, 6};   // this is declaration as well as initialization.
        System.out.println(Arrays.toString(arrayName)); // here we use Arrays.toString(args) to print the array otherwise it will print hashcode.


        int[] rollNumber = {1, 2, 3, 4, 5, 6}; // this is another way of declaring an initializing an array.
        System.out.println(Arrays.toString(rollNumber));

        /*
         * here we learn how to initialize an declare a multidimensional array i.e. 2-d array.
         */

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.println(a[i][j]);
//
//            }
//
//       }

        for (int[] inner : a) {
            for (int data : inner) {
                System.out.println(data);


            }

        }
    }
}
