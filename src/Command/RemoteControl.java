package Command;

/**
 * @author liutao
 * RemoteControl 管理一组命令对象。每个按钮都有一个命令对象。每当按下按钮，就调用相应的
 * xxButtonWasPushed()方法,间接造成该命令的execute()方法被调用
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        // 在构造器中，只需实例化并初始化这两个开关的数组
        onCommands = new Command[7];
        offCommands = new Command[7];

        // 这里之所以预先指定成NoCommand对象，
        // 是为了避免每次都检查某个插槽都加载了命令
        // 比如说在onButtonWasPushed方法中，我们
        // 可能需要这样的代码：
        // if (onCommands[slot] != null) {
        //    onCommands[slot].execute();
        // }

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * setCommand 有三个参数，分别是插槽的位置，开的命令、关的命令.
     * 这些命令记录在开关数组中对应插槽位置，已提供稍后使用
     * @param slot
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuff.toString();
    }
}
