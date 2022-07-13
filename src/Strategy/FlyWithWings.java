package Strategy;

/**
 * @author liutao
 */
public class FlyWithWings implements FlyBehavior{

    /**
     * 这是飞行行为的实现,给会飞的鸭子用
     */
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
