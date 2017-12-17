package pl.com.zpi;

import java.util.Random;

public class Calc {

	public static Integer[] comboBox1NumbersArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
			19, 20 };

	public static Integer[] generateRandomNumbers(Integer quantity) {
		Integer tab[] = new Integer[quantity];
		Random randomNumber = new Random();
		for (int i = 0; i < tab.length; i++) {
			tab[i] = randomNumber.nextInt(100);
		}
		return tab;
	}
	
	public static Integer calculate(Integer a, Integer b) {
		return a * b;
	}
}
