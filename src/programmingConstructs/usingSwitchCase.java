package programmingConstructs;

import java.util.Scanner;

public class usingSwitchCase {
    public static void main(String[] args) {
        System.out.println("Please enter a day number from week: ");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        scanner.close();
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number input.";
        }
        System.out.println("The day is " + dayName);
    }

}
