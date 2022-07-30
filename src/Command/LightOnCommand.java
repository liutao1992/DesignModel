package Command;

/**
 * @author liutao
 * 利用Command接口，每个动作都被实现成一个简单的命令对象。
 * 命令对象持有对一个厂商类的实例的引用，并实现了execute()方法。
 * 这个方法会调用厂商类实例的一个或多个方法，完成特定行为。
 * 在这个例子中，有两个类，分别打开电灯与关闭电灯。
 */
public class LightOnCommand implements Command{
    Light light;

    /**
     * 构造器被传入了某个电灯（比方说：客厅的电灯），以便让这个命令控制，
     * 然后记录在实例变量中。一旦调用execute(),就由这个电灯对象成为接收者，负责接受请求。
     * @param light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 这个execute()方法调用接收对象（我们正在控制的电灯）on的方法
     */
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
