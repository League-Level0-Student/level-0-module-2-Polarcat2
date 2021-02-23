//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog("What do you want to ask me");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random ran = new Random();
	int randomChoice = ran.nextInt(3 - 0 + 1) + 1;
	
	// 4. If the random number is 0
	if (randomChoice == 0) {
	// -- tell the user "Yes"
		JOptionPane.showMessageDialog(null, "Yas");
	// 5. If the random number is 1
	}    if (randomChoice == 1) {
	// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "Nah");
	// 6. If the random number is 2
    }    if (randomChoice == 2) {
	// -- tell the user "Maybe you should ask Google?"
    	JOptionPane.showMessageDialog(null, "Maybe you should ask google");
	// 7. If the random number is 3
    }    if (randomChoice ==3)  {
	// -- write your own answer
    	JOptionPane.showMessageDialog(null, "I don't know, go bother someone else.");
    }
}
}