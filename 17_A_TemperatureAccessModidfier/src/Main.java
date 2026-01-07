import com.berufsfachschule.temperature.Temperature;

public class Main {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(-5.37);
        temp1.printCelsius();
        System.out.println(temp1);   // output after nr. 6: com.berufsfachschule.temperature.Temperature@12edcd21
        // The main class can't see a private from another class
        temp1.getCelsiusToFahrenheit();
        temp1.getCelsiusToKelvin();
        //Number 10 I don't care and don't think so
        Temperature temp2 = new Temperature(10.5);
        temp2.printCelsius();
        temp2.getCelsiusToKelvin();
        temp2.getCelsiusToFahrenheit();
        Temperature temp3 = new Temperature(0);
        temp3.getCelsiusToFahrenheit();//32
        temp3.getCelsiusToKelvin();//273.15

    }
}