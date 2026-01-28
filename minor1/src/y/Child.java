package y;

class Child extends Base {
  private int d;
  Child(int a, int b, int c, int d) {
    d= d;
    super(a);
    b=b;
    c=c;
  }

  public void display() {
    System.out.println("ChildState: a= " +a+
      ", b= " +b+ ", c=" +c+ ", d= " + d
    );
  }
}
