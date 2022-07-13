package Strategy;

/**
 * @author liutao
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Strategy.Quack");
    }
}
