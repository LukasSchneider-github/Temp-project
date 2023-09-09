//This tells the computer that a scanner is being used
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //it's Int because only will integers will be typed
        int line;
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to convert Fahrenheit to Celsius(1) or to Kelvin(2): " );
        line = in.nextInt();

        //this is F to C
        if (line == 1) {
            //its double because we could have numbers like 1.22 or .444
            double math;
            Scanner up = new Scanner(System.in);
            System.out.print("Enter in a value to convert to Celsius: " );
            math = up.nextDouble();
            System.out.printf( math + "F in Celsius is " + (Math.round(math - 32)* 5/9));
        }
        //this is F to K
        // == means equal to
        else if (line == 2) {
            double math2;
            Scanner down = new Scanner(System.in);
            System.out.println("Enter in a value to convert Fahrenheit to Kelvin: ");
            math2 = down.nextDouble();
            //Math.round rounds my answer so we don't get .7777777
            System.out.println(math2 + "F" + " in Kelvin is " + (Math.round(math2 - 32)* 5/9 +273.15));
        }

        //This else will stop someone from entering an option not 1 or 2
        else  {
            System.out.println("Please choose valid number!");

        }



    }

    static void printNames(String name1, String name2) {
        System.out.println(name1 + " and " + name2);
    }
}