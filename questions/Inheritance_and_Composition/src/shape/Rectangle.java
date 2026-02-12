package shape;

public class Rectangle extends Shape {
  private float length;
  private float breadth;

  public Rectangle(String name, float length, float breadth) {
    super(name);
    this.length = length;
    this.breadth = breadth;
  }

  public float calculateArea() {
    return length * breadth;
  }
}
