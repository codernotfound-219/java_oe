import shape.*;

public class Main {
  public static void main(String[] args) {
    Shape[] arr = new Shape[2];
    arr[0] = new Circle("CircleAlpha", 5);
    arr[1] = new Rectangle("RectangleBeta", 5, 5);

    for (Shape sh : arr) {
      System.out.println("Area of " + sh.getName() + ": " + sh.calculateArea());
    }
  }
}
