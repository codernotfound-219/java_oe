package mythreads.oddeve;

import java.util.List;

public class PrinterThread extends Thread {
  private int id;
  private final int[] args;

  public PrinterThread(int id, int start, int end) {
    this.id = id;
    args = new int[2];
    args[0] = start;
    args[1] = end;
  }

  private void printOddNumbers() {
    for (int i = args[0]; i < args[1]; i++) {
      if ((i & 1) == 1) {
        System.out.println("Odd: " + i);
      }
    }
  }

  private void printEvenNumbers() {
    for (int i = args[0]; i < args[1]; i++) {
      if ((i & 1) == 0) {
        System.out.println("Even: " + i);
      }
    }
  }

  @Override
  public void run() {
    if (id == 1) {
      printOddNumbers();
    }

    if (id == 2) {
      printEvenNumbers();
    }
  }
}
