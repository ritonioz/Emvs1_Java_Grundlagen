import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    Temperature temp1 = new Temperature();
        System.out.println(temp1.celsius);

        Temperature temp2 = new Temperature(42.22);
        System.out.println(temp2.celsius);
        temp2.printCelsius();

        System.out.println("Print in your temperature");
        Temperature temp3 = new Temperature(scanner.nextDouble());
        temp3.printCelsius();
        temp3.printHotOrColdCelsius();
        temp3.calculateCelsiusToFahrenheit();
        temp3.calculateCelsiusToKelvin();



    }
}