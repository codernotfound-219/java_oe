package quack;

public class Squeek implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I squeek");
    }
}