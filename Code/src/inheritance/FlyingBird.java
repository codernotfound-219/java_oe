package inheritance;

public class FlyingBird extends Bird {
  private int altitude;
  private int wingspan;

  public FlyingBird (String name, boolean canFly, String typeOfFood, int altitude, int wingspan) {
    super(name, canFly, typeOfFood);
    this.altitude = altitude;
    this.wingspan = wingspan;
  }

  public void display() {
    // System.out.println(String.format(
    //   "Animal::Bird::FlyingBird::name=%s, typeOfFood=%s, hasBackbone=%b, canFly=%b, hasFeathers=%b, altitude=%d, wingspan=%d",
    //   this.getName(), typeOfFood, hasBackbone, canFly, hasFeathers, altitude, wingspan
    // ));

    super.display();
    System.out.println(String.format(", altitude=%d, wingspan=%d", altitude, wingspan));
  }
}
