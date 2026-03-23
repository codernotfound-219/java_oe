package datastructures;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Student o1 = new Student("23CSB001", "Gopal");
    Student o2 = new Student("23CSB001", "Gopal");

    Student o3 = o2;

    boolean isO2EqualO1 = o2.equals(o1);
    boolean isO3EqualO2 = o3.equals(o2);
    System.out.println("Is O1 Equal 02: " + isO2EqualO1);
    System.out.println("Is O2 Equal 03: " + isO3EqualO2);

    ArrayList<Student> list = new ArrayList<Student>();
    list.add(o1);
    list.add(o2);
    list.add(o3);

    for (Student s : list) {
      System.out.println("Roll: " + s.getRoll());
    }
  }
}
