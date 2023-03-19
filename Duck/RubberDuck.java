public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new Grounded();
    }

    public void display() {
        System.out.println("Tôi là vịt cao su");
    }
}