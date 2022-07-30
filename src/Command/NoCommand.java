package Command;

/**
 * @author liutao
 * NoCommand对象是一个空对象(null object)的例子。当你不想返回一个有意义的对象时，
 * 空对象就很有用。客户也可以将处理的null的责任转移给空对象。举例来说，遥控器不可能
 * 一出厂就设置有意义的命令对象。所以提供了NoCommand对象作为替代品，当调用它的execute
 * 方法时，这种对象什么事情都不做。
 *
 * 在许多设计模式中，都会看到空对象的使用。甚至有些时候，空对象本身也被视为是一种设计模式。
 *
 */
public class NoCommand implements Command {

	@Override
	public void execute() { }

	@Override
	public void undo() {

	}
}
