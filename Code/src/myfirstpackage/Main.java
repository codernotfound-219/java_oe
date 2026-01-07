package myfirstpackage;
import other.MyInteger;
import patterns.Singleton;

class Main {
  public static void main(String[] args) { // this fn needs to be public for JVM to call it
    // Student
    Student std1 = new Student("Jargon");
    std1.setRoll("F57");
    std1.setBranch("ECE");
    String[] details1 = std1.getDetails();

    System.out.println("Student 1: ");
    for (String s : details1) {
      System.out.println(s);
    }

    // MyInteger
    MyInteger myInt = new MyInteger(5);
    int[] array = new int[5]; // Declaration: an array of 5 integers
    for (int i = 0; i < 5; i++) {
      array[i] = i + myInt.get();
    }

    System.out.println("Value of myInt: " + myInt.get());
    System.out.println("Factorial of myInt: " + myInt.factorial());

    for (int i = 0; i < 5; i++) {
      System.out.println("Val " + i + ": " + array[i]);
    }
   
    // Singleton
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

    obj1.print();
    obj2.print();
  }
}
