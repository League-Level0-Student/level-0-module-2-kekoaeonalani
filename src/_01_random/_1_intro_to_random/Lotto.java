package _01_random._1_intro_to_random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto {
public static void main(String[] args) {
	
	Random randomMaker = new Random();
	String s = "";
	for(int i=0;i<6;i++) {
	int randomNumber = randomMaker.nextInt(100);
	s = s + randomNumber + " ";
	
}
	JOptionPane.showMessageDialog(null,  s);
}
}
