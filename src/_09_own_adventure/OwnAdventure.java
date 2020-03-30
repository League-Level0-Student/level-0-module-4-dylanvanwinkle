package _09_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You are playing a game.");
		String a = JOptionPane.showInputDialog("Go left or right?");
		if (a.equalsIgnoreCase("right")) {
			JOptionPane.showMessageDialog(null, "You win!");
		}
		if (a.equalsIgnoreCase("left")) {
			String s = JOptionPane.showInputDialog("Go left or right?");

			if (s.equalsIgnoreCase("right")) {
				JOptionPane.showInputDialog("You lose.");
			}
			else if (s.equalsIgnoreCase("left")) {
					JOptionPane.showMessageDialog(null, "You win!");
				
			}
		}
	}
}