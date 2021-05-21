package takingInput;

import java.util.Scanner;

public class UsingScanner {
    /*
     *here we demonstrate how to take input from user by Scanner class and print output.
     */
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        java.util.Scanner scannerObject = new java.util.Scanner(System.in);
        String inputName = scannerObject.nextLine();

        System.out.println("The name is: " + inputName);
    }
}
