package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	/*
     * 5. Create your own exception by making a new class called
     * NegativeNumberException that extends Exception.
     * 
     * 6. Add a method to your exception called scaryPopup that creates a
     * JOptionPane Message Dialog telling the user they have triggered a
     * critical error in their computer.
     */
public void scarypop() {
	JOptionPane.showMessageDialog(null, "You have triggered a critical error in your computer. Restart will began when window is closed");
}
   
}
