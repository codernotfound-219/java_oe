class Singleton {
  private static Singleton object;          // PRIVATE: prevent external code from modifying the instance
                                            // STATIC: one common object for belongs to the entire class 
  private Singleton() {}                    // PRIVATE CONSTRUCTOR: only this class can invoke it.

  public static Singleton getInstance() {   // PUBLIC: this method is to be accessed outside the class
                                            // STATIC: to call a normal method, u need the object first. (but its not initialised yet). So static method.
    if (object == null) {
      object = new Singleton();
    }

    return object;
  }
}
