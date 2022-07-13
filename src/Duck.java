/**
 * @author liutao
 */
public abstract class Duck {

    // 为行为接口类型声明两个引用变量，
    // 所有鸭子子类(在同一个包中)都继承他们

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    /**
     * 委托行为类
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 委托行为类
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
