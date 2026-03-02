package mythreads;
import mythreads.oddeve.PrinterThread;

public class Main {
  public static void main(String[] args) {
    PrinterThread th1 = new PrinterThread(1, 1, 101);
    PrinterThread th2 = new PrinterThread(2, 1, 101);

    th1.start();
    th2.start();
  }
}
