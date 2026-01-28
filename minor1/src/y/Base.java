package y;

class Base {
  protected int a;
  protected int b;
  int c;

  Base(int a) {
    a = a;
    b = 0;
  }

  public void display() {
    System.out.println("BaseState: a= " +a+ ", b= " +b);
  }
};
