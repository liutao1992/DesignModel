package Command;

/**
 * @author liutao
 * 所有遥控器命令都实现这个Command接口。
 * 此接口中包含了一个方法，也就是execute().
 * 命令封装了某个特定厂商类的一组动作，遥控器
 * 可以通过调用execute()方法，执行这些动作。
 */
public interface Command {
    /**
     * 执行
     */
    public void execute();

    /**
     * 撤销
     */
    public void undo();
}
