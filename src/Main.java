import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int line;
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to convert Fahrenheit to Celcius(1) or to Kelven(2): " );
        line = in.nextInt();

        //this is F to C
        if (line == 1) {

            double math;
            Scanner up = new Scanner(System.in);
            System.out.print("Eneter in a value to convert to Celcius: " );
            math = up.nextDouble();
            System.out.println( math + " in Celcius is " + (math - 32)* 5/9);
        }



    }
}