package _08_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String p = JOptionPane.showInputDialog("What kind of pet do you want?(Cat, Dog, Bird)");
		// 6. REPEAT steps 3 - 6 enough times to make your pet happy!
		while (true) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Happy Pet", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Play", "Food", "Water", "Groom" }, null);
//System.out.println(task);
			if (task == 0) {
				if(p.equalsIgnoreCase("cat")) {
				JOptionPane.showMessageDialog(null, "purr");
				}
				
				play();

			}
			if (task == 1) {
				food();

			}
			if (task == 2) {
				water();

			}
			if (task == 3) {
				groom();
			}
			if (happinessLevel >= 10) {
			JOptionPane.showMessageDialog(null, "Your pet loves you!");
				break;
			}
		}
//System.out.println(happinessLevel);
	}

	// 5. Use user input to call the appropriate method created in step 4.

	// 7. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	private static void play() {
		happinessLevel++;
	}

	private static void food() {
		happinessLevel++;
	}

	private static void water() {
		happinessLevel++;
	}

	private static void groom() {
		happinessLevel--;
	}

}