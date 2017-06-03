package com.pan.tdd;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Game Start ----->");
		SpecialNum specialNum = new SpecialNum(3, 5, 7);
		NumberSounder numberSounder = new NumberSounder(specialNum);

		for (int i = 1; i <=100 ; i++) {
			System.out.println(numberSounder.getNumber(i));
		}

	}
}
