package patterns;

public class Singleton {
  private static Singleton singletonObj;    // A static variable holding the instantiation 
  private Singleton() {}                    // Private Constructor : cannot be instantiated outside this class

  public static Singleton getInstance() {   // static: invoke without creating an object
    if (singletonObj == null) {
      singletonObj = new Singleton();
    }

    return singletonObj;
  }

  // Additional Methods;
  public void print() {
    System.out.println("Singleton Exists as " + this); // this: displays object ref id as String
  }
}
