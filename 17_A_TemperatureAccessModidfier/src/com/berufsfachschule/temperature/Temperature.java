package com.berufsfachschule.temperature;

public class Temperature {

    private double celsius;
    private float kelvin;
    private final double ABSOLUTE_ZERO_CELSIUS = -273.15;

    public Temperature(float kelvin){this.kelvin=kelvin;}
    public Temperature(double celsius){
        this.celsius=celsius;
    }
    public void printCelsius(){
        System.out.println(this.celsius + "C°");
    }
    public Temperature(){
    }

    public void printHotOrColdCelsius(){
        if (celsius > 24){
            System.out.println("It's hot");
        }else {
            System.out.println("It's freezing");
        }
    }
    public void getCelsiusToFahrenheit(){
        System.out.println(this.celsius*1.8+32 +" Fahrenheit");

    }
    public void getCelsiusToKelvin(){
        System.out.println(this.celsius+273.15 +" Kelvin");
    }
    //getter
    public double getCurrentCelsius(){
        return this.celsius;
    }
    //setter
    public void setCurrentCelsius(double celsius){
        this.celsius = celsius;
    }

    //number 20
    public void getKelvinToCelsius(){
        System.out.println(this.kelvin-ABSOLUTE_ZERO_CELSIUS +" Crad");
    }



}
