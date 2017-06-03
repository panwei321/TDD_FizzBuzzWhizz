package com.pan.tdd;

/**
 * Hello world!
 */
public class Game {

	public static void main(String[] args) {

		System.out.println("Game Start <-----\n");
		SpecialNum specialNum = new SpecialNum(3, 4, 5);
		NumberSounder numberSounder = new NumberSounder(specialNum);

		for (int i = 1; i <=100 ; i++) {
			System.out.println(numberSounder.getNumber(i));
		}
		System.out.println("\nGame End ----->");
	}
}
