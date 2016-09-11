package net.lixufei.weather;

import java.util.*;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    float temperature;
    float humidity;

    public CurrentConditionsDisplay (Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable observable, Object object) {
        if(observable instanceof WeatherData) {
            this.temperature = ((WeatherData) observable).getTemperature();
            this.humidity = ((WeatherData) observable).getHumidity();
        }
        display();
    }

    public void display() {
        System.out.println("Current weather display is :" + temperature + humidity);
    }
}
