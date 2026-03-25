package collections;

import java.util.ArrayList;

// TODO:
// Class: Student Generating Thread -> extends thread
// one thread generates student (roll -> CS)
// the other thread generates student (roll -> CH)

public class SharedData {
  private ArrayList<Student> list;

  public SharedData(ArrayList<Student> ls) {
    this.list = ls;
  }

  public synchronized void addToArrayList(Student s) { // If increment is called then only it is run. (Decrement cannot be run simulatenously)
    this.list.add(s);
  }

  public int getTotalStudents() {
    return list.size();
  }

  public void display() {
    CollectionHelper.printCollection(this.list);
  }
}
