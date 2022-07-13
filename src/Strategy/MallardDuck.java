package Strategy;

/**
 * @author liutao
 */

public class MallardDuck extends Duck{

    public MallardDuck() {
        // MallardDuck继承了Duck，所以具有flyBehavior与quackBehavior实例变量
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
