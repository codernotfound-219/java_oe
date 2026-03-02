package mythreads.oddeve;

import java.util.List;

public class PrinterThread extends Thread {
  private int id;
  private boolean change;
  private final int[] args;

  public PrinterThread(int id, int start, int end) {
    this.id = id;
    change = false;
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

  public void getChangeStatus() {
    System.out.println("Thread :" +id + " : status = " + change);
  }

  @Override
  public void run() {
    args[1] = 1001;
    change = true;

    if (id == 1) {
      printOddNumbers();
    }

    if (id == 2) {
      printEvenNumbers();
    }
    getChangeStatus();
  }
}
