
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new CannotQuack();
        flyBehavior = new Grounded();
    }

    public void display() {
        System.out.println("Tôi là một con vịt mồi nhử.");
    }
}