package printingToConsoleOutput;

public class UsingPrintf {
    public static void main(String[] args) {

        /*here we declare two variables studentName in String data-type and presentAge in int .
         *
         *       used for => format specifier
         *
         *       int, short, byte, long => %d
         *       float, double => %f
         *       char => %c
         *       String => %s
         *       hashcode => %h
         *       newline or form feed => \n
         *       tab => \t
         *       backspace => \b
         *       backlash => \\
         *       carriage return => \r
         *       line feed => \f
         */
        String studentName = "Ram";
        int presentAge = 12;

        System.out.printf("The name is %s and his age is %d.", studentName, presentAge);

    }
}
