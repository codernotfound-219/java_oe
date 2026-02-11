package shape;

public class Circle extends Shape {
  private float radius;
  public Circle(String name, float radius) {
    super(name);
    this.radius = radius;
  }

  public float calculateArea() {
    return 3.14f * radius * radius;
  }
}
