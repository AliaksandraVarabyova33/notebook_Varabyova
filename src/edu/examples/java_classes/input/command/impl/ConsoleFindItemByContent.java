package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.Display;
import edu.examples.java_classes.input.InputTerminal;
import edu.examples.java_classes.input.MenuBuilder;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;

public class ConsoleFindItemByContent implements Command {

	private InputTerminal terminal = MenuBuilder.getInstance().getTerminal();
	private NotebookLogic logic = new NotebookLogic();
	private Display display = MenuBuilder.getInstance().getDisplay();
	
	@Override
	public void execute() {
		
		String content = terminal.inputContent();
		
		display.printNotes(logic.find(content));
				
	}

}
