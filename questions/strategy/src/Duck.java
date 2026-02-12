import behaviors.*;
import quack.QuackBehavior;

public abstract class Duck {
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public void setFlyBehavior(FlyBehavior fb) {
    this.flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    this.quackBehavior = qb;
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }
}
