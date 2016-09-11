package net.lixufei.weather;

public class ForecastDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    Subject subject;
    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("forecast weather display is :" + temperature + humidity);
    }
}
