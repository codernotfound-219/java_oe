package mythreads.oddeve;

public class PrinterThread extends Thread {
  private int id;
  private final int[] args; // the location to which its pointing to remains the same.
  // args[0] = 10000 is allowed in run time
  // args = new int[10] // this is disallowed

  // CREATING A SHARED VARIABLE BETWEEN OBJECTS OF THIS CLASS
  static int counter = 0;

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
    // args[1] = 1001; // this is allowed
    // args = new int[10] : not allowed


    // NOTE: Creating race condition
    // id.1 writes a shared variable
    // id.2 reads a shared variable
    // the variable has ambigious state (could be 100 or 0)
    if (id == 1) {
      PrinterThread.counter = 100;
    }
    
    if (id == 2) {
      System.out.println("Counter : " + PrinterThread.counter);
    }


    /*
      if (id == 1) {
        printOddNumbers();
      }

      if (id == 2) {
        printEvenNumbers();
      }
    */
  }
}
