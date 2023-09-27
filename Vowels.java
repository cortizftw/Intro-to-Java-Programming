/*
 * This program can be use to check is an input is a vowel
 */

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner vowelObj = new Scanner(System.in);
		System.out.println("Please enter a letter: ");
		String vowel = vowelObj.nextLine();
		if (vowel.contains("a") || vowel.contains("e") || vowel.contains("i") || vowel.contains("o") || vowel.contains("u")) {
			System.out.println(vowel + " is a vowel");
		} else {
			System.out.println(vowel + " is not a vowel");
		}

	}

}
