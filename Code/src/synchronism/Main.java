package synchronism;

public class Main {
  public static void main(String[] args) {
    SharedData sd = new SharedData(0);
    CounterManipulatingThread th1 = new CounterManipulatingThread(1, sd);
    CounterManipulatingThread th2 = new CounterManipulatingThread(2, sd);

    th1.start();
    th2.start();

    try {
      th1.join(); 
      th2.join();
    } catch (InterruptedException e) {
      System.out.println("Unexpected Interrupt: " + e.getMessage());
    }

    th1.display();
    th2.display();
  }
}
