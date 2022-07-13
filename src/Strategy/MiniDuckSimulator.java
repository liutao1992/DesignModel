package Strategy;

/**
 * @author liutao
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // 这里会调用MallardDuck继承来的
        // performQuack(),performFly()方法
        // 进而委托给该对象的quackBehavior、flyBehavior处理
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
