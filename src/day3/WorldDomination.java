package day3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		JOptionPane.showMessageDialog(null, "yes");
		JOptionPane.showInputDialog("can you write code?");

		// 2. If they say "yes", tell them they will rule the world.
		JOptionPane.showMessageDialog(null, "you rule the World");
		// 3. Otherwise, wish them good luck washing dishes.
		JOptionPane.showMessageDialog(null, "good luck washing the dishes");
		JOptionPane.showMessageDialog(null, "I don't want to");
		JOptionPane.showMessageDialog(null, "too bad");
		JOptionPane.showMessageDialog(null, ":(");

	}
}
