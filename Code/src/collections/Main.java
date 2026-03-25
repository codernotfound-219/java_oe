package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    Student s1 = new Student("24cs001", "Gopal", 9);
    Student s2 = new Student("24cs002", "Govind", 8);
    Student s3 = new Student("24cs003", "Geeta", 7);

    studentArrayList.add(s1);
    studentArrayList.add(s2);
    studentArrayList.add(s3);
    System.out.println("ArrayList through collection helper");

    for (int i = 0; i < studentArrayList.size(); i++) {
      studentArrayList.get(i).display();
    }

    for (Student student : studentArrayList) {
      student.display();
    }

    HashMap<String, Student> studentHashMap = new HashMap<>();
    studentHashMap.put(s1.getRollNo(), s1);
    studentHashMap.put(s2.getRollNo(), s2);
    studentHashMap.put(s3.getRollNo(), s3);

    Student sRef = studentHashMap.get(s1.getRollNo());
    System.out.println(sRef.equals(s1));

    TreeSet<Student> studentTreeSet = new TreeSet<>();
    studentTreeSet.add(s3);
    studentTreeSet.add(s2);
    studentTreeSet.add(s3);
    studentTreeSet.add(s3);

    CollectionHelper.printCollection(studentArrayList);
    CollectionHelper.printCollection(studentTreeSet);

  }
}
