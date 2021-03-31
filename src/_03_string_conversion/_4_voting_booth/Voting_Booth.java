package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {

public static void main(String[] args) {
	
String Age = JOptionPane.showInputDialog("How old are you (in years)");
	int AgeAsInt = Integer.parseInt(Age);
	if (AgeAsInt>=18) {
		JOptionPane.showMessageDialog(null, "Who do you think the president should be?");}
	else if (AgeAsInt<18) {
		JOptionPane.showMessageDialog(null, "We don't care about what you think.");}
	}
} 