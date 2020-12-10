package structural.bridge;

public abstract class Program {

	protected Developer developer;

	protected Program(final Developer developer) {
		this.developer = developer;
	}

	public abstract void developProgram();
}
