package net.lixufei.weather;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class WeatherStation {

    private static Logger logger = Logger.getLogger(WeatherStation.class);

    public static void main (String[] args) {
//        BasicConfigurator.configure();

//        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        weatherData.setMeasures(23, 24, 100);
//        weatherData.setMeasures(23, 24, 123.0f);

        logger.debug("This is debug message.");
        logger.info("This is info message.");
        logger.error("This is error message.");
    }
}
