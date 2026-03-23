package datastructures;

public class Student {
  protected String roll;
  protected String name;

  public Student(String r, String n) {
    this.roll = r;
    this.name = n;
  }

  public String getName() {
    return name;
  }

  public String getRoll() {
    return roll;
  }
}
