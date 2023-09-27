/*
 * This program can be use to check is an input is a vowel
 */

import java.util.Scanner;

public class VowelsPartDeux {
	public static void main(String[] args) {
		Scanner vowelObj = new Scanner(System.in);
		System.out.println("Please enter a letter: ");
		String vowel = vowelObj.nextLine();
		switch (vowel) {
		case "a":
			System.out.println(vowel + " is a vowel");
			break;
		case "e":
			System.out.println(vowel + " is a vowel");
			break;
		case "i":
			System.out.println(vowel + " is a vowel");
			break;
		case "o":
			System.out.println(vowel + " is a vowel");
			break;
		case "u":
			System.out.println(vowel + " is a vowel");
			break;
		default:
			System.out.println(vowel + " is not a vowel");
			break;
		}
	}
}
