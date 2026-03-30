package collections;

import java.util.Random;

public class StudentGeneratingThread extends Thread {
  private int id;
  private final SharedData sd;
  private String branchPrefix;
  private int totalStudents;

  private static final String[] FIRST_NAMES = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Heidi",
      "Ivan", "Judy" };
  private static final String[] LAST_NAMES = { "Smith", "Jones", "Williams", "Brown", "Davis", "Miller", "Wilson",
      "Moore", "Taylor", "Anderson" };

  public StudentGeneratingThread(int id, SharedData sd, String bp, int n) {
    this.id = id;
    this.sd = sd;
    this.branchPrefix = bp;
    this.totalStudents = n;
  }

  public void display() {
    sd.display();
  }

  private String generateName() {
    Random rnd = new Random();
    String first_name = FIRST_NAMES[rnd.nextInt(FIRST_NAMES.length)];
    String last_name = LAST_NAMES[rnd.nextInt(LAST_NAMES.length)];
    return first_name + " " + last_name;
  }

  @Override
  public void run() {
    for (int i = 0; i < totalStudents; i++) {
      Random rnd = new Random();
      int cg = rnd.nextInt(51) + 50;
      String name = generateName();

      if (id == 1) {
        Student s = new Student(name, branchPrefix + Integer.toString(i + 1), cg);
        sd.addToArrayList(s);
      }

      if (id == 2) {
        Student s = new Student(name, branchPrefix + Integer.toString(i + 1), cg);
        sd.addToArrayList(s);
      }
    }
  }
}
