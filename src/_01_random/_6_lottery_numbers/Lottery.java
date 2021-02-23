package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		Random ran = new Random();
	int num1 = ran.nextInt(60) + 1;
	
	JOptionPane.showMessageDialog(null, "Your lotery numbers are: " + num1);
	}

}
