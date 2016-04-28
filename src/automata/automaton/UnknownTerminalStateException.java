package automata.automaton;

public class UnknownTerminalStateException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "No terminal state";
	}
}
