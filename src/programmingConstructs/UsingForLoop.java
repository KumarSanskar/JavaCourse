package programmingConstructs;

import java.util.Scanner;

public class UsingForLoop {
    public static int NUMBER_ITERATIONS = 5;

    /*
     *here we demonstrate the of use the for loop for printing input name five times.
     */
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner scannerObject = new Scanner(System.in);
        String studentName = scannerObject.next();

        for (int NUMBER_ITERATORS = 0; NUMBER_ITERATORS < 5; NUMBER_ITERATORS++) {
            System.out.println("Your name is: " + studentName);

        }
    }
}

