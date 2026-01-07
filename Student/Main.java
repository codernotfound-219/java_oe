import school.Student;

public class Main { // Main is accessible to all packages
  public static void main(String[] args) { // this fn needs to be public for JVM to call it
    Student std1 = new Student("Jargon");
    std1.setRoll("F57");
    std1.setBranch("ECE");

    Student std2 = new Student("Jardoig", "R23", "EEE");
    String[] details1 = std1.getDetails();
    String[] details2 = std2.getDetails();

    System.out.println("Student 1: ");
    for (String s : details1) {
      System.out.println(s);
    }

    System.out.println("\nStudent 2: ");
    for (String s : details2) {
      System.out.println(s);
    }
  }

}
