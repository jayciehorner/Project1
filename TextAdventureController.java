package com.skillstorm.project1;

import java.util.Scanner;

public class TextAdventureController extends Player {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String happiness = "<3 <3 <3";

		Player stanley = new Player("Stanley", (int) 1, (String) "<3 <3 <3", (int) 5);
		Player sarah = new Player("Sarah", (int) 5, (String) "<3 <3 <3", (int) 3);
		Player tyler = new Player("Tyler", (int) 4, (String) "<3 <3 <3", (int) 1);

		System.out.println(
				"Greetings from Candy Land! In a world of candy and sunshine, it sure is a difficult road to the Candy Castle.\n"
						+ "Roll the dice to make your way through Peppermint Forrest, Gumdrop Mountains, and so much more!\n"
						+ "Be careful to avoid the sticky licorice traps laid by mean ol' Lord Licorice. Arrive happily at Candy Castle and win!");
		//////// Make instructions more clear ///////////
		System.out.println("");
		System.out.println("Choose your character! Stanley, Sarah, or Tyler.");
		String player = in.next();
//
//		while (true) {
//
//			if (player.equalsIgnoreCase("Stanley")) {
//				System.out.println(stanley);
//			} else if (player.equalsIgnoreCase("Sarah")) {
//				System.out.println(sarah);
//			} else if (player.equalsIgnoreCase("Tyler")) {
//				System.out.println(tyler);
//			} else {
//				System.out.println("Please choose a valid character.");
//				in.next();
//				// continue;
//			}
//			break;
//		}
		
		 while((player.equalsIgnoreCase("Stanley") || player.equalsIgnoreCase("Sarah") || player.equalsIgnoreCase("Tyler"))) {//error message
		        if (in.next().equalsIgnoreCase("Stanley")){
		        	System.out.println(stanley);
		        } else if (in.next().equalsIgnoreCase("Sarah")){
		        	System.out.println(sarah);
		        } else if (in.next().equalsIgnoreCase("Tyler")) {
		        	System.out.println(tyler);
		        } else {
		        	 System.out.println("Please chose a valid player");
				        in.next();
		        
		        }
		    }

		System.out.println("Time to begin your journey. " + "We begin by the gingerbread tree.\n");

		Player.promptEnterKey();

		System.out.println("You have reached the Peppermint Forest."
				+ " Would you like to:\n A. Stop and talk to Mr. Mint\n B. Eat a candy cane\n"
				+ " C. Keep walking in a hurry to Candy Castle");

		String result1 = in.next();
		if (result1.equalsIgnoreCase("A")) {
			System.out.println(
					"You chose to stop and talk to Mr. Mint. He gave you some candy canes and warned you that Lord Licorice has been\n"
							+ "lurking about lately. You better be careful!");
		} else if (result1.equalsIgnoreCase("B")) {
			System.out.println("You chose to eat a candy cane. While eating, you realized that you are stuck in\n "
					+ "one of Lord Licorice's traps and you can't move. After lots of effort, you manage to unstick\n"
					+ " yourself, but your happiness took a hit.\n");
		} else if (result1.equalsIgnoreCase("C")) {
			System.out.print(
					"You hurry through Peppermint Forest without stopping. You decide to take a quick shortcut,\n"
							+ " but suddenly your feet are stuck. Lord Licorice has struck! After lots of effort, you manage to\n"
							+ " unstick yourself, but your happiness took a hit.\n");

		}
		if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && player.equalsIgnoreCase("Stanley")) {
			System.out.println("Happiness is now: <3 <3");
		} else {
			System.out.println("Happiness: <3 <3 <3");
		}

		Player.promptEnterKey();

		System.out.println("And away we go towards the Gumdrop Mountains\n");

		Player.promptEnterKey();

		System.out.println("As you approach the Gumdrop Mountains, you notice a sign that says 'Gumdrop Pass.'\n"
				+ " It seems to be a quicker way of getting through! Do you:\n A. Take Gumdrop Pass\n B. Take the normal"
				+ " route\n C. Stop in place and do not move until someone comes to help you");
		String result2 = in.next();
		if (result2.equalsIgnoreCase("A")) {
			System.out.println("You breeze through Gumdrop Pass and continue your journey without issue");
		} else if (result2.equalsIgnoreCase("B")) {
			System.out.println(
					"You take the normal route through Gumdrop Mountains. Suddenly your path is blocked by Jolly the Troll\n"
							+ "of Gumdrop Mountains. He takes the candy canes given to you by Mr. Mint and laughs at you. Eventually you\n"
							+ "wipe away the tears and muster up the courage to continue your journey, but your happiness has taken a hit.\n");
		} else if (result2.equalsIgnoreCase("C")) {
			System.out.print(
					"You wait until someone comes to help you decide where to go. Nightfall comes and you haven't seen a\n"
							+ "single person. You try to go find someone for help, but find your feet stuck to the ground. Mean ol' Lord\n"
							+ "Licorice! After several hours in the dark you manage to unstick your feet and dredge onward.\n");
		}
		if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && result2.equalsIgnoreCase("B")
				|| result2.equalsIgnoreCase("C")) {
			System.out.println("Happiness is now: <3");
		} else if (result1.equalsIgnoreCase("A") && result2.equalsIgnoreCase("B") || result2.equalsIgnoreCase("C")) {
			System.out.println("Happiness is now: <3 <3");
		} else if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && result2.equalsIgnoreCase("A")) {
			System.out.println("Happiness is now: <3 <3");
		} else {
			System.out.println("Happiness: <3 <3 <3");

		}
		Player.promptEnterKey();

		System.out.println(
				"Your journey continues. Eventually you run into Gramma Nutt, who says you look famished, and offers to bring you back to\n"
						+ "Peanut Acres for a peanut butter sandwich. Do you: A. Continue on your journey, hungry, but without delay\n"
						+ "sandwich\n B. Go to Peanut Acres with Gramma Nutt and enjoy a peanut butter\n C. Pet her dog, NutterButter, and make polite\n"
						+ "conversation until she leaves");

		String result3 = in.next();
		if (result3.equalsIgnoreCase("A")) {
			System.out.println(
					"You politely decline Gramma Nutt and continue your journey. You realize your feet are stuck! Lord Licorice laid a trap. After many hours,\n"
							+ "you break free, tired and sad.");
		} else if (result3.equalsIgnoreCase("B")) {
			System.out.println(
					"You follow Gramma Nutt to Peanut Acres, where she makes you the best peanut butter sandwich you've ever had. Thats when you remember \n"
							+ "that you're allergic to nuts. You wake up to Gramma Nutt reviving you with an Epipen. Now you have to buy another $700 Epipen and your thigh\n"
							+ "hurts. This makes you sad.");
		} else if (result3.equalsIgnoreCase("C")) {
			System.out.print(
					"You pet NutterButter and continue talking to Gramma Nutt for some time. She warns you about Gloppy, the Goo of Chocolate Swamp. You heed her\n"
							+ "warnings and continue your journey to Candy Castle.");
		}

		{

		}

		if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && result2.equalsIgnoreCase("B")
				|| result2.equalsIgnoreCase("C") && result3.equalsIgnoreCase("A") || result3.equalsIgnoreCase("B")) {
			System.out.println("Happiness is now: <3");
		} else if (result1.equalsIgnoreCase("A") && result2.equalsIgnoreCase("B") || result2.equalsIgnoreCase("C")) {
			System.out.println("Happiness is now: <3 <3");
		} else if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && result2.equalsIgnoreCase("A")) {
			System.out.println("Happiness is now: <3 <3");
		} else {
			System.out.println("Happiness: <3 <3 <3");
		}

	}
}