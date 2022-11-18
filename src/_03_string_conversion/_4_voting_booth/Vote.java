package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Vote {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Enter your age.");
		int ageInt = Integer.parseInt(age);
		if( ageInt >= 18 ) {
			JOptionPane.showMessageDialog(null, "Who do you think should be the next President?");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are too young for anybody to care about what you think polliticaly.");
		}
	}

}
