package net.lixufei.weather;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {
    public float temperature;
    public float humidity;
    public float pressure;

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;

    }

    public void measureChanged () {
        setChanged();
        notifyObservers();
    }

    public void setMeasures (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measureChanged();
    }
}
