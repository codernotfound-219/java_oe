package synchronism;

public class SharedData {
  private int counter;

  public SharedData(int c) {
    this.counter = c;
  }

  public synchronized void increment() { // If increment is called then only it is run. (Decrement cannot be run simulatenously)
    this.counter++;
  }

  public synchronized void decrement() { // Only decrement will be run and not increment.
    this.counter--;
  }

  public void display() {
    System.out.println("Counter : " + counter);
  }
}
