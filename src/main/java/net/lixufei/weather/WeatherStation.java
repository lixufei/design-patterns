package net.lixufei.weather;

public class WeatherStation {
    public static void main (String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        currentConditionsDisplay.display();
        weatherData.setMeasures(23, 24, 100);
    }
}
