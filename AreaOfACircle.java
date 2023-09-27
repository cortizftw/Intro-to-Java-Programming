//This program asks the user for a radius value and utilize it to find the area of a circle

import java.util.Scanner;

public class AreaOfACircle {
	public static void main(String[] args) {
		//initialize the Scanner class to get input from user
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter radius of a circle: ");
		//Assign user input as radius value
		double radius = myObj.nextDouble();
		double pi = 3.14;
		double area = pi * Math.pow(radius, 2);
		System.out.println("The area of a circle with radius " + radius + " is " + area + " sq. units.");
	}

}
