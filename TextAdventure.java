package com.skillstorm.project1;

import java.util.Scanner;

public class TextAdventure extends Player {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
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
//		String player = in.next();
//		while (!player.equals("Stanley") || !player.equals("Sarah") || !player.equals("Tyler")) {
//			System.out.println("Please choose an existing character.");
//			player = in.next();
//		}
		String player = in.next();
		do {
			if (player.equalsIgnoreCase("Stanley") || player.equalsIgnoreCase("Sarah")
					|| player.equalsIgnoreCase("Tyler")) {
				break;
			} else {
				System.out.println("Please choose an existing character.");
				player = in.next();
			}
		} while (true);
	
		
		if(player.equalsIgnoreCase("Stanley")) {
			System.out.println(stanley.toString());
		}
		else if(player.equalsIgnoreCase("Tyler")) {
			System.out.println(tyler.toString());
		}
		else {
			System.out.println(sarah.toString());
		}

		///////////// FIX LOOP/////////////////////////////

		System.out.println("Time to begin your journey. We begin by the gingerbread tree.\n");

		Player.promptEnterKey();
/////////////////// SCENE 1 /////////////////////////////////
		System.out.println(scene1A());
		scene1Result();

		// if (Player.scene1Result().equalsIgnoreCase("B") ||
		// Player.scene1Result().equalsIgnoreCase("C")) {
		// System.out.println("Happiness is now: <3 <3");
		// } else {
		// System.out.println("Happiness: <3 <3 <3");
		// }

		Player.promptEnterKey();

		System.out.println("And away we go towards the Gumdrop Mountains\n");

		Player.promptEnterKey();

/////////////////// SCENE 2 /////////////////////////////////

		System.out.println(scene2A());
		System.out.println(scene2Result());

//		if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && result2.equalsIgnoreCase("B")
//				|| result2.equalsIgnoreCase("C")) {
//			System.out.println("Happiness is now: <3");
//		} else if (result1.equalsIgnoreCase("A") && result2.equalsIgnoreCase("B") || result2.equalsIgnoreCase("C")) {
//			System.out.println("Happiness is now: <3 <3");
//		} else if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && result2.equalsIgnoreCase("A")) {
//			System.out.println("Happiness is now: <3 <3");
//		} else {
//			System.out.println("Happiness: <3 <3 <3");
//
//		}
		Player.promptEnterKey();

/////////////////// SCENE 3 /////////////////////////////////

		System.out.println(scene3A());
		System.out.println(scene3Result());

		Player.promptEnterKey();

/////////////////// SCENE 4 /////////////////////////////////

		System.out.println(scene4A());
		System.out.println(scene4Result());

		Player.promptEnterKey();

/////////////////// SCENE 5 /////////////////////////////////

		System.out.println(scene5A());
		System.out.println(scene5Result());

//
//		if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && result2.equalsIgnoreCase("B")
//				|| result2.equalsIgnoreCase("C") && result3.equalsIgnoreCase("A") || result3.equalsIgnoreCase("B")) {
//			System.out.println("Happiness is now: <3");
//		} else if (result1.equalsIgnoreCase("A") && result2.equalsIgnoreCase("B") || result2.equalsIgnoreCase("C")) {
//			System.out.println("Happiness is now: <3 <3");
//		} else if (result1.equalsIgnoreCase("B") || result1.equalsIgnoreCase("C") && result2.equalsIgnoreCase("A")) {
//			System.out.println("Happiness is now: <3 <3");
//		} else {
//			System.out.println("Happiness: <3 <3 <3");
//		}
//
		in.close();

	}
}
