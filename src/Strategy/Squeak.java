package Strategy;

/**
 * @author liutao
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Strategy.Squeak");
    }
}
