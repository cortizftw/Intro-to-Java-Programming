/*
 * Displays the cost of a carpet given the area computed 
 * from the given length and width
 */

import java.util.Scanner;

public class Carpet {
	public static void main(String[] args) {
		System.out.println("Enter the length of a carpet in meters: ");
		Scanner lengthObj = new Scanner(System.in);
		System.out.println("Enter the width of a carpet in meters: ");
		Scanner widthObj = new Scanner(System.in);
		double length = lengthObj.nextDouble();
		double width = widthObj.nextDouble();
		double costPerMetre = 20;
		double carpetArea = length * width;
		double totalCost = carpetArea * costPerMetre;
		System.out.println("The area of the carpet is " + carpetArea + " sq. meters.");
		System.out.println("Based on the area, the total cost would be $" + totalCost);
	}
}
