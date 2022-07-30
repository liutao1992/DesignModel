package Command;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}

	@Override
	public void undo() {

	}
}
