package net.lixufei.weather;

public class StaticsDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    Subject subject;
    public StaticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("statics weather display is :" + temperature + humidity);
    }
}
