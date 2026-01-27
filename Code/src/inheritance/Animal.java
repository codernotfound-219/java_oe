package inheritance;
import java.util.Random;

public abstract class Animal {
  protected boolean hasBackbone;
  protected String typeOfFood;
  private String name;

  private String code;
  private void createCode() {
    Random rand = new Random();
    this.code = name + rand.nextInt(100);
  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getCode() {
    if (code == null) {
      this.createCode();
    }
    return code;
  }

  abstract void display(); // ABSTRACT METHOD
}

/*
 * import java.util.Random;
 * private String code;
 * private void createCode() {
 * Random rand = new Random();
 * this.code = name + rand.nextInt(100);
 * }
 * 
 * public String getCode() {
 * return this.code;
 * }
 * 
 */
