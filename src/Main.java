import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int line;
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to convert Fahrenheit to Celsius(1) or to Kelvin(2): " );
        line = in.nextInt();

        //this is F to C
        if (line == 1) {

            double math;
            Scanner up = new Scanner(System.in);
            System.out.print("Enter in a value to convert to Celsius: " );
            math = up.nextDouble();

            System.out.printf( math + "F in Celsius is " + (Math.round(math - 32)* 5/9));
        }

        else if (line == 2) {
            double math2;
            Scanner down = new Scanner(System.in);
            System.out.println("Enter in a value to convert Fahrenheit to Kelvin: ");
            math2 = down.nextDouble();
            System.out.println(math2 + "F" + " in Kelvin is " + (Math.round(math2 - 32)* 5/9 +273.15));
        }

        else  {
            System.out.println("Please choose valid number!");

        }



    }
}