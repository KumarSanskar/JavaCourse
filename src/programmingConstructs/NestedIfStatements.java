package programmingConstructs;

public class NestedIfStatements {
    /*in this program we learn how to use nested if statement in java
     *
     * here if first condition evaluates to true then second condition is checked to produce an output.
     */

    public static void main(String[] args) {
        int number1 = 14, number2 = 23;
        if (number1 > 10) {
            if (number2 > 20) {
                System.out.println("Number1 is = " + number1 + " and " + "Number2 is = " + number2);
            }
        }

    }
}