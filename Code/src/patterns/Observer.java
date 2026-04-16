package patterns;
import patterns.observer.WeatherData;
import patterns.observer.CurrentConditionDisplay;

public class Observer {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);

    weatherData.setMeasurements(31, 71, 1);
    weatherData.removeObserver(ccd);
    weatherData.setMeasurements(33, 64, 1);
    weatherData.addObserver(ccd);
    weatherData.setMeasurements(50, 12, 1);
  }
}
