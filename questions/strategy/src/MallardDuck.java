// File: MallardDuck.java
import behaviors.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck() {
        // Initializing with a specific strategy
        flyBehavior = new FlyWithWings();
    }
}