package net.lixufei.weather;

public class WeatherStation {
    public static void main (String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasures(23, 24, 100);
        weatherData.setMeasures(23, 24, 123.0f);
    }
}
