package _03_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void maisn(String[] args) {

		// Ask the user how many nickels they have
String ns = JOptionPane.showInputDialog("How many nickels do you have?");
int n = Integer.parseInt(ns);
// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
String ds = JOptionPane.showInputDialog("How many dimes do you have?");
int d = Integer.parseInt(ds);

		// Ask the user how many quarters they have, and convert their answer
String qs = JOptionPane.showInputDialog("How many quarters do you have?");
int q = Integer.parseInt(qs);

String ps = JOptionPane.showInputDialog("How many pennies do you have?");
int p= Integer.parseInt(ps);
		// Calculate how much money the user has and save it in a double variable 
double m = (q*0.25) + (d*0.10) + (n*0.5) + (p*0.1);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have " + m + " dollars.");
	}
}

