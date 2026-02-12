public class SalesPerson extends Employee {
  public SalesPerson(String name) {
    super(name);
  }

  public boolean takeOrder() {
    System.out.println("Order taken");
    return true;
  }

  public void collectPayment() {
    System.out.println("Paymennt collected");
  }
}
