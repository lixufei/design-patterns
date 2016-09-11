package net.lixufei.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    public List<Observer> observers;
    public float temperature;
    public float humidity;
    public float pressure;
    public WeatherData () {
        this.observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int observerIndex = observers.indexOf(0);
        if (observerIndex > 0) {
            observers.remove(o);
        }
    }

    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measureChanged () {
        notifyObservers();
    }

    public void setMeasures (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measureChanged();
    }
}
