package net.lixufei.weather;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
