package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.Display;
import edu.examples.java_classes.input.MenuBuilder;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;

public class ConsoleShowAllNotes implements Command{
	
	NotebookLogic logic = new NotebookLogic();
	private Display display = MenuBuilder.getInstance().getDisplay();
	
	@Override
	public void execute() {
		
		display.printNotes(logic.allNotes());
				
	}

}
