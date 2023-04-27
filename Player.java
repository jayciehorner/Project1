package com.skillstorm.project1;

public class Player {
	private String name;
	private int smarts;
	private static String happiness;
	private int sweetTooth;

	public Player() {

	}

	public Player(String name, int smarts, String happiness, int sweetTooth) {
		this.name = name;
		this.smarts = smarts;
		Player.happiness = happiness;
		this.sweetTooth = sweetTooth;
	}

	@Override
	public String toString() {
		return "You have chosen " + this.name + ". Character stats: " + "\n" + "Smarts: " + this.smarts + "\n"
				+ "Happiness: " + Player.happiness + "\n" + "Sweet Tooth: " + this.sweetTooth;

	}

	public static void promptEnterKey() {
		System.out.println("Press \"ENTER\" to continue...");
		TextAdventure.in.nextLine();
		TextAdventure.in.nextLine();
	}

	/////////////////////// SCENE
	/////////////////////// 1////////////////////////////////////////////////////
	public static String scene1A() {
		return "You have reached the Peppermint Forest."
				+ " Would you like to:\n A. Stop and talk to Mr. Mint\n B. Eat a candy cane\n"
				+ " C. Keep walking in a hurry to Candy Castle";
	}

	public static void scene1Result() {
		String result = TextAdventure.in.next();
		do {
			if (result.equalsIgnoreCase("A")) {
				System.out.println(
						"You chose to stop and talk to Mr. Mint. He gave you some candy canes and warned you that Lord Licorice has been\n"
								+ "lurking about lately. You better be careful!");
				break;

			} else if ((result.equalsIgnoreCase("B"))) {
				System.out.println("You chose to eat a candy cane. While eating, you realized that you are stuck in\n "
						+ "one of Lord Licorice's traps and you can't move. After lots of effort, you manage to unstick\n"
						+ " yourself, but your happiness took a hit.\n");
				break;

			} else if (result.equalsIgnoreCase("C")) {
				System.out.println(
						"You hurry through Peppermint Forest without stopping. You decide to take a quick shortcut,\n"
								+ " but suddenly your feet are stuck. Lord Licorice has struck! After lots of effort, you manage to\n"
								+ " unstick yourself, but your happiness took a hit.\n");
				break;

			} else {
				System.out.println("Please choose a valid path.");
				TextAdventure.in.next();
				
			}
		} while (true);
	}

	/////////////////// SCENE 2
	/////////////////// /////////////////////////////////////////////////////////
	public static String scene2A() {
		return "As you approach the Gumdrop Mountains, you notice a sign that says 'Gumdrop Pass.'\n"
				+ " It seems to be a quicker way of getting through! Do you:\n A. Take Gumdrop Pass\n B. Take the normal"
				+ " route\n C. Stop in place and do not move until someone comes to help you";
	}

	public static String scene2Result() {
		String result = TextAdventure.in.next();
		if (result.equalsIgnoreCase("A")) {
			System.out.println("You breeze through Gumdrop Pass and continue your journey without issue");
		} else if ((result.equalsIgnoreCase("B"))) {
			System.out.println(
					"You take the normal route through Gumdrop Mountains. Suddenly your path is blocked by Jolly the Troll\n"
							+ "of Gumdrop Mountains. He takes the candy canes given to you by Mr. Mint and laughs at you. Eventually you\n"
							+ "wipe away the tears and muster up the courage to continue your journey, but your happiness has taken a hit.\n");
		} else if (result.equalsIgnoreCase("C")) {
			System.out.println(
					"You wait until someone comes to help you decide where to go. Nightfall comes and you haven't seen a\n"
							+ "single person. You try to go find someone for help, but find your feet stuck to the ground. Mean ol' Lord\n"
							+ "Licorice! After several hours in the dark you manage to unstick your feet and dredge onward.\n");
		} else if (!result.equalsIgnoreCase("A") || !result.equalsIgnoreCase("B") || !result.equalsIgnoreCase("C")) {
			System.out.println("Please choose a valid path.");
			TextAdventure.in.next();
		}
		return "Your happiness is now: " + happiness;
	}

	///////////////////////// SCENE 3 ///////////////////////////////////////
	public static String scene3A() {
		return "Your journey continues. Eventually you run into Gramma Nutt, who says you look famished, and offers to bring you back to\n"
				+ "Peanut Acres for a peanut butter sandwich. Do you: A. Continue on your journey, hungry, but without delay\n"
				+ "sandwich\n B. Go to Peanut Acres with Gramma Nutt and enjoy a peanut butter sandwich\n C. Pet her dog, NutterButter, and make polite\n"
				+ "conversation until she leaves";
	}

	public static String scene3Result() {
		String result = TextAdventure.in.next();
		if (result.equalsIgnoreCase("A")) {
			System.out.println(
					"You politely decline Gramma Nutt and continue your journey. You realize your feet are stuck! Lord Licorice laid a trap. After many hours,\n"
							+ "you break free, tired and sad.");
		} else if ((result.equalsIgnoreCase("B"))) {
			System.out.println(
					"You follow Gramma Nutt to Peanut Acres, where she makes you the best peanut butter sandwich you've ever had. Thats when you remember \n"
							+ "that you're allergic to nuts. You wake up to Gramma Nutt reviving you with an Epipen. Now you have to buy another $700 Epipen and your thigh\n"
							+ "hurts. This makes you sad.");
		} else if (result.equalsIgnoreCase("C")) {
			System.out.println(
					"You pet NutterButter and continue talking to Gramma Nutt for some time. She warns you about Gloppy, the Goo of Chocolate Swamp. You heed her\n"
							+ "warnings and continue your journey to Candy Castle.");
		} else if (!result.equalsIgnoreCase("A") || !result.equalsIgnoreCase("B") || !result.equalsIgnoreCase("C")) {
			System.out.println("Please choose a valid path.");

		}

		return "Your happiness is now: " + happiness;
	}

	///////////////////// SCENE 4 ///////////////////////////////
	public static String scene4A() {
		return "You approach the Lollipop Woods, home of the lollipop fairies. Still hungry, you debate sneaking a lick at a lollipop tree. Do you:\n A. Lick a lollipop tree\n"
				+ "B. Keep on your route to Candy Castle\nC. Make friends with the local lollipop fairies";
	}

	public static String scene4Result() {

		String result = TextAdventure.in.next();
		if (result.equalsIgnoreCase("A")) {
			System.out.println(
					"You decide to take a quick lick of a lollipop tree. Even though it's not too cold oujt, your tongue gets stuck like its a "
							+ "lightpost in the dead of winter. Unsticking your tongue is painful and time consuming. You end the ordeal even sadder.");
		} else if ((result.equalsIgnoreCase("B"))) {
			System.out.println(
					"You keep to your route...and immediately get stuck in one of Lord Licorice's traps. After several hours you unstick yourself, "
							+ "but your happiness takes a hit.");
		} else if (result.equalsIgnoreCase("C")) {
			System.out.println(
					"You walk around for a while greeting the lollipop fairies. They give you extra lollipops for your journey and warn you about"
							+ " Gloppy the Goo of Chocolate Swamp.");
		} else if (!result.equalsIgnoreCase("A") || !result.equalsIgnoreCase("B") || !result.equalsIgnoreCase("C")) {
			System.out.println("Please choose a valid path.");

		}

		return "Your happiness is now: " + happiness;
	}
	///////////////////////// SCENE 5
	///////////////////////// /////////////////////////////////////////////////

	public static String scene5A() {
		return "You arrive at Chocolate Swamp. The chocolate looks tempting, but you're not sure if you should stray from the path this close to Candy Castle. Do you:\nA. "
				+ "Drink some chocolate and then continue on your journey\nB. Avoid the chocolate swamp and keep going\nC. Go for a swim in the chocolate!";
	}

	public static String scene5Result() {

		String result = TextAdventure.in.next();
		if (result.equalsIgnoreCase("A")) {
			System.out.println(
					"You decide to drink some of the chocolate swamp water. As you reach down, Gloppy the Goo of Chocolate Swamp grabs your arm"
							+ " and pulls you in! You manage to escape the swamp, but as Gloppy laughs at you, you feel your happiness take a hit.");
		} else if ((result.equalsIgnoreCase("B"))) {
			System.out.println(
					"You walk to continue your journey when you realize someone is blocking your path! Gloppy the Goo of Chocolate Swamp "
							+ "blocks the way to the castle as he pushes you into the swamp. Crying and coated in chocolate, you manage to get out of the swamp,"
							+ " but your happiness has taken a hit.");
		} else if (result.equalsIgnoreCase("C")) {
			System.out.println(
					"You jump in the chocolate and enjoy a delicious and refreshing swim. After some fun, you leave Chocolate Swamp and continue"
							+ " your journey to Candy Castle.");
		} else if (!result.equalsIgnoreCase("A") || !result.equalsIgnoreCase("B") || !result.equalsIgnoreCase("C")) {
			System.out.println("Please choose a valid path.");

		}

		return "Your happiness is now: " + happiness;
	}

}
