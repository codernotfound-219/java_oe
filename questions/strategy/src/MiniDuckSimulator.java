// File: MiniDuckSimulator.java
import behaviors.FlyNoWay;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        System.out.print("Mallard initial: ");
        mallard.performFly();

        // Manual Intervention: Change behavior at runtime
        System.out.println("--- Duck gets injured ---");
        mallard.setFlyBehavior(new FlyNoWay());

        System.out.print("Mallard now: ");
        mallard.performFly();
    }
}