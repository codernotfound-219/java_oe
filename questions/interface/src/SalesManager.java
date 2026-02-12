public class SalesManager extends SalesPerson implements Manage {
  public SalesManager(String name) {
    super(name);
  }
  
  public boolean authorize() {
    System.out.println("Auth successful");
    return true;
  }

  public static void main(String[] args) {
    SalesManager a = new SalesManager("Sara");

    if (!a.takeOrder()) {
      System.out.println("Could not take order");
      return;
    }

    if (!a.authorize()) {
      System.out.println("Could not authorize");
      return;
    }

    System.out.println("Payment collected by: " + a.getName());
  }
}
