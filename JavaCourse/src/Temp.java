import java.util.Scanner;
public class Temp {


    public int convertFarenheitToCelcius(int F) {
        int convertedTemp = (F - 32) * 5/9;
        return convertedTemp;
    }

    public int convertCelciusToFarenheit(int C) {
        int convertTemp = ((C * 9/5) + 32);
        return convertTemp;
    }

}
