package Section6;

public class ReadingInput {
    public static void main(String[] args) {

        //user wrapper class to change the type of the string to the wrapper class
        int year=2024;
        String userDate = "1990";
        int dateOfBrith = Integer.parseInt(userDate);
        System.out.println("age = " + (year - dateOfBrith));


        /*
        Different ways of user inputs
        System.in (complex)

        System.console (does not work with IDE due to auto configs of it)

        Command Line Arguments (String[] args. Passing arguments for it)

        Scanner (common way)
         */

        /*
            Try catch block are used for predictable errors of a code.
            Within the try block if an error occurs the catch block will handle the error.
         */

    }
}
