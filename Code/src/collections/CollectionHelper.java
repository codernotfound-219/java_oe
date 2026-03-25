package collections;

import java.util.Collection;

public class CollectionHelper {
  public static void printCollection(Collection<?> c) {
    if (c == null) return;
    for (Object o : c) {
      System.out.println(o);
    }
  }
}
