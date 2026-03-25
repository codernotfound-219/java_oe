package collections;


public class Student implements Comparable {
  protected String name;
  protected String rollNo;
  protected int cg;

  public Student(String n, String r, int c) {
    this.name = n;
    this.rollNo = r;
    this.cg = c;
  }

  public String toString() {
    return ("Rollno=" + rollNo + ", name=" + name);
  }

  public void display() {
    System.out.println(this);
  }

  public String getRollNo() {
    return rollNo;
  }

  @Override
  public int compareTo(Object o) {
    return this.rollNo.compareTo(((Student) o).getRollNo());
  }
}
