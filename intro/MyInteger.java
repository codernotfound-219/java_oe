class MyInteger {
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

  // Starting Point
  // The JVM looks for this specific signature to start the program.
  // NOTE: 'static' means this method belongs to the class itself,
  // not a specific object. It allows the program to run without
  // creating a 'new MyInteger()' first.

  public static void main(String[] args) {
    MyInteger myInt = new MyInteger(5);

    int[] array = new int[5]; // Declaration: an array of 5 integers
    for (int i = 0; i < 5; i++) {
      array[i] = i + myInt.get();
    }

    System.out.println("Value of myInt: " + myInt.get());
    System.out.println("Factorial of myInt: " + myInt.factorial());

    for (int i = 0; i < 5; i++) {
      System.out.println("Val " + i + ": " + array[i]);
    }
  }
}
