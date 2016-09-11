package net.lixufei.weather;

import javax.security.auth.Subject;
import java.util.Observable;
import java.util.Observer;

public class StaticsDisplay implements Observer, DisplayElement {
    Observable observable;
    float temperature;
    float humidity;
    public StaticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    //obs 为什么会是WeatherData 的一个实例,因为Observable 中update方法传的第一个参数为this表明是Observable对象,而WeatherData又继承了Observable
    public void update(Observable obs, Object obj) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }
        display();
    }

    public void display() {
        System.out.println("statics weather display is :" + temperature + humidity);
    }
}
