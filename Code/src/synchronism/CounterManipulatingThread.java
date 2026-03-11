package synchronism;

public class CounterManipulatingThread extends Thread {
  private int id;
  private SharedData sharedData;

  public CounterManipulatingThread(int id, SharedData sd) {
    this.id = id;
    this.sharedData = sd;
  }

  public void display() {
    sharedData.display();
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      if (id == 1) {
        sharedData.increment();
      }

      if (id == 2) {
        sharedData.decrement();
      }
    }
  }
}
