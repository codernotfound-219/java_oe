package synchronism;

public class SharedData {
  private int counter;

  public SharedData(int c) {
    this.counter = c;
  }

  public void increment() {
    this.counter++;
  }

  public void decrement() {
    this.counter--;
  }

  public void display() {
    System.out.println("Counter : " + counter);
  }
}
