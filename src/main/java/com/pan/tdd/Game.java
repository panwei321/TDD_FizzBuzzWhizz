package com.pan.tdd;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/4
 */
public class Game {

	private static int MAX_NUMBER=100;

	public static void main(String[] args) {
		System.out.println("Game Start <---------------\n");
		SpecialNum specialNum = new SpecialNum(2, 3, 5);
		Student student = new Student(specialNum);
		for (int studentNum = 1; studentNum <=MAX_NUMBER ; studentNum++) {
			student.numberOff(studentNum);
		}
		System.out.println("\nGame End --------------->");

	}
}
