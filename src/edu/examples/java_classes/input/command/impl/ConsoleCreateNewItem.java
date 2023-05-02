package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.InputTerminal;
import edu.examples.java_classes.input.MenuBuilder;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;

public class ConsoleCreateNewItem implements Command{
	
	private InputTerminal terminal = MenuBuilder.getInstance().getTerminal();
	NotebookLogic logic = new NotebookLogic();
	
	@Override
	public void execute() {
		
		
		String title = terminal.inputTitle();
		String content = terminal.inputContent();
		
		logic.add(title, content);
				
	}
	

}
