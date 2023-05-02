package edu.examples.java_classes.input.command.impl;

import java.text.ParseException;
import java.util.Date;

import edu.examples.java_classes.input.Display;
import edu.examples.java_classes.input.InputTerminal;
import edu.examples.java_classes.input.MenuBuilder;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;

public class ConsoleFindItemByDate implements Command{


	private InputTerminal terminal = MenuBuilder.getInstance().getTerminal();
	NotebookLogic logic = new NotebookLogic();
	private Display display = MenuBuilder.getInstance().getDisplay();
	
	@Override
	public void execute() {
		
		Date date = null;
		try {
			date = terminal.inputDate();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		display.printNotes(logic.find(date));
				
	}


}
