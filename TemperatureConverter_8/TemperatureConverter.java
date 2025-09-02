package TemperatureConverter_8;

public class TemperatureConverter {
    private double temperature;

    public TemperatureConverter() {
    }

    public TemperatureConverter(double temperature) {
        this.temperature = temperature;
    }

    public double toFahrenheit() {
        return this.temperature * (9.0 / 5.0) + 32;
    }

    public double toCelcius() {
        return (this.temperature - 32) * (5.0 / 9.0);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "TemperatureConverter [temperature=" + temperature + "]";
    }
}
