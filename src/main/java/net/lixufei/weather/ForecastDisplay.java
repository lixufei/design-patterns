package net.lixufei.weather;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    float temperature;
    float humidity;
    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable obs, Object obj) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }
        display();
    }

    public void display() {
        System.out.println("forecast weather display is :" + temperature + humidity);
    }
}
