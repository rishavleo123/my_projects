import java.util.Scanner;

public class TempDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which would you like to compare to: ");
        System.out.println("1. Fahrenheit -> Celsius");
        System.out.println("2. Celsius -> Fahrenheit");
        int ans = in.nextInt();
        Temp code = new Temp();

        if (ans==1) {

            System.out.println("What is the fahrenheit temperature");
            int fTemp = in.nextInt();

            System.out.println(code.convertFarenheitToCelcius(fTemp));

        }
        else {

            System.out.println("What is the celsius temperature");
            int cTemp = in.nextInt();
            System.out.println(code.convertCelciusToFarenheit(cTemp));

        }

    }
}
