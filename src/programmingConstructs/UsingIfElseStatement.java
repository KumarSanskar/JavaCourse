package programmingConstructs;

import java.util.Scanner;

public class UsingIfElseStatement {
    /*
     * here we make a simple program which checks for the number to be even or odd using if else block.
     */
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scannerObject = new Scanner(System.in);
        int checkNumber = scannerObject.nextInt();
        if (checkNumber % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}
