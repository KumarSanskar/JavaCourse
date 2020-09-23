package programmingConstructs;

import java.util.Scanner;

public class usingDoWhileLoop {
    /*
     *here we use do while loop to add user input numbers till zero is input by user.
     */

    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        Scanner scannerObject = new Scanner(System.in);


        do {
            System.out.println("input a number: ");
            number = scannerObject.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("sum= " + sum);
    }
}