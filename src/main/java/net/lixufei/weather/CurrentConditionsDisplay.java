package net.lixufei.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    Subject subject;
    public CurrentConditionsDisplay (Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current weather display is :" + temperature + humidity);
    }
}
