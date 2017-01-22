package com.softserve.edu.firsthomework.task2;

import java.io.IOException;

/**
 * The application that compares two envelopes and determines which can fit in another envelope
 *
 * @author Alex
 * @version 1.0
 */

public class App {
	ConsoleHelper helper = new ConsoleHelper();
	
	public static void main(String[] args) throws IOException {
		new App().run();
	}
	
	/**
	 * Method for run application.
	 * This method is called all methods for the implementation of the program
	 */
	private void run() {
		Envelope envelope;
		Envelope secondEnvelope;
		
		while (true) {
			try {
				envelope = new Envelope(helper.readFromConsole("Please enter size of envelope" +
						"\nPlease enter side a:")
						, helper.readFromConsole("\nPlease enter side b:"));
				envelope.calculateAreaOfEnvelope();
				
				secondEnvelope = new Envelope(helper.readFromConsole("Please enter size of " +
						"envelope\nPlease enter side a:")
						, helper.readFromConsole("\nPlease enter side b:"));
				secondEnvelope.calculateAreaOfEnvelope();
				
				//Calculate and print result of compare envelopes
				Boolean result = envelope.compareEnvelope(secondEnvelope.getAreaOfEnvelope());
				if (result){
					helper.printMessage("This envelope can fit in the main envelope");
				} else {
					helper.printMessage("This envelope can't fit in the main envelope");
				}
				
				if (! helper.exit(helper.readFromConsole("\nDo you want check envelop again? " +
						"Y/ N"))) {
					return;
				}
			} catch (NumberFormatException e) {
				helper.sayUserAboutError(e);
			} catch (IOException e) {
				helper.sayUserAboutError(e);
			}
		}
	}
}
