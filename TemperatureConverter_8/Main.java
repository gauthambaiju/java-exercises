package TemperatureConverter_8;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter(100);
        System.out.println(tc);
        System.out.println(tc.toFahrenheit());
        System.out.println(tc.toCelcius());
    }
}
