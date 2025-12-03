public class Temperature {

    public double celsius;
    public double fahrenheit;
    public double kelvin;

    public Temperature(){
        this.celsius = 18.32;
    }


    public Temperature(double celsius){
        this.celsius=celsius;
    }
    public void printCelsius(){
        System.out.println(this.celsius + "C°");
    }

    public void printHotOrColdCelsius(){
        if (celsius > 24){
            System.out.println("It's hot");
        }else {
            System.out.println("It's freezing");
        }
    }
    public void calculateCelsiusToFahrenheit(){
        this.fahrenheit = this.celsius*9/5+32;
        System.out.println(this.celsius + " °C is "+ this.fahrenheit +" °F ");
    }

    public void calculateCelsiusToKelvin(){
        this.kelvin = this.celsius+273.15;
        System.out.println(this.celsius + " °C is "+ this.kelvin +" °K ");
    }


}
