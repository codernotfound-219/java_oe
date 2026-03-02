package mythreads;

public class CounterThread extends Thread {
  private int id;
  public CounterThread(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread id: " + id);
    }
  }

  public static void main(String[] args) {
    CounterThread th1 = new CounterThread(1);
    CounterThread th2 = new CounterThread(2);

    th1.start();
    th2.start();
  }
}
