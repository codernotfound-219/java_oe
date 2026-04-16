package patterns.observer;
import java.util.ArrayList;
import java.util.List;

import patterns.observer.interfaces.*;

public class WeatherData implements Subject {
  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  public void addObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float t, float h, float p) {
    this.temperature = t;
    this.humidity = h;
    this.pressure = p;

    measurementsChanged();
  }
}
