package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Hello Wold");
		String name;
		name = JOptionPane.showInputDialog("what is your name?");
		JOptionPane.showMessageDialog(null, "Hi" + name);

	}

}
