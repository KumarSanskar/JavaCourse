package takingInput;

import java.util.Scanner;

public class UsingScanner {
    /*
     *here we demonstrate how to take input from user by Scanner class and print output.
     */
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        // for single input we can use this .
        // java.util.Scanner scannerObject = new java.util.Scanner(System.in);
        Scanner scannerObject = new Scanner(System.in);
        // for taking multiple input using one object e.i scannerObject .
        String inputName = scannerObject.nextLine();
        // int number = scannerObject.nextInt();
        System.out.println("The name is: " + inputName);
    }
}
