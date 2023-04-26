package com.skillstorm.project1;
import java.util.Scanner;
public class Player {
	private String name;
	private int smarts;
	private String happiness;
	private int sweetTooth;
	
	public Player() {
		
	}
	
	public Player(String name, int smarts, String happiness, int sweetTooth) {
		this.name = name;
		this.smarts = smarts;
		this.happiness = happiness;
		this.sweetTooth = sweetTooth;
	}
	
	@Override
	public String toString() {
		return "You have chosen " + this.name + ". Character stats: "  + "\n" + "Smarts: " + this.smarts + "\n" + "Happiness: " 
	+ this.happiness + "\n" + "Sweet Tooth: " + this.sweetTooth;
	
	}
	public static void promptEnterKey(){
		   System.out.println("Press \"ENTER\" to continue...");
		   Scanner in = new Scanner(System.in);
		   in.nextLine();
	}
		  
		  
	

}
