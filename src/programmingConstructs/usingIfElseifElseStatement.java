package programmingConstructs;

import java.util.Scanner;

public class usingIfElseifElseStatement {
    /*
     *here we check that whether a number is positive, negative or equal to zero.
     */
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scannerObject = new Scanner(System.in);
        int inputNumber = scannerObject.nextInt();

        if (inputNumber > 0) {
            System.out.println("Number is Positive.");
        } else if (inputNumber < 0) {
            System.out.println("number is Negative.");
        } else {
            System.out.println("Number is zero.");
        }
    }
}
