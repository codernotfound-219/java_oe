package other;

public class MyInteger { // If not public, the main would not be able to access it.
  private int value;

  // Constructor
  public MyInteger(int a) {
    this.value = a;
  }

  public void add(int a) {
    value += a;
  }

  public int get() {
    return value;
  }

  public int factorial() {
    /*
     * ??
     * int mul = 1, dup = this.value;
     * 
     * while (dup != 0) {
     * mul *= dup;
     * dup--;
     * }
     * 
     * return mul;
     */

    int mul = 1;
    if (value < 0) {
      System.out.println("Invalid value: integer's value is less than zero");
      return -1;
    }

    for (int i = 1; i <= value; i++)
      mul *= i;
    return mul;
  }
}
