package school;

public class Student { // {class Student is accessible to all packages}
  private String name; // {name is scoped to this file alone }
  // protected String name; {name is scoped to the current package}
  private String roll;
  private String branch;

  public Student(String name) {
    this.name = name;
  }

  // NOTE: Constructor Overloading
  public Student(String name, String roll, String branch) {
    this.name = name;
    this.roll = roll;
    this.branch = branch;
  }

  public void setRoll(String roll) {
    this.roll = roll;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String[] getDetails() {
    return new String[] { name, roll, branch };
  }
}
