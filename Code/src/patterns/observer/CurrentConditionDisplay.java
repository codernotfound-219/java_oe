package patterns.observer;
import patterns.observer.interfaces.*;

public class CurrentConditionDisplay implements DisplayElement, Observer {
  private float temp;
  private float humidity;
  private WeatherData weatherData;

  public CurrentConditionDisplay(WeatherData w) {
    this.weatherData = w;
    weatherData.addObserver(this);
  }

  public void display() {
    System.out.println("Current conditions: " + temp + "˚C and " + humidity + "% humid");
  }

  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    display();
  }
}
