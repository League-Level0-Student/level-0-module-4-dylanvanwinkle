package _04_test_scores;

import javax.swing.JOptionPane;

public class TestScore {
	public static void main(String[] args) {
		String tss = JOptionPane.showInputDialog("What is your test score");
		double ts = Double.parseDouble(tss);
		if (ts >= 90) {
			JOptionPane.showMessageDialog(null, "Thats amazing!!!");
		} else if (ts < 90 && ts >= 80) {
			JOptionPane.showMessageDialog(null, "Good Job.");
		} else {
			JOptionPane.showMessageDialog(null, "Ok.");
		}
	}

}
