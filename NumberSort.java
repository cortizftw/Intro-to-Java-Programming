//Sorts three user input integers in descending order

import java.util.Scanner;
import java.util.*;

public class NumberSort {
	public static void main(String[] args) {
		Scanner firstNumObj = new Scanner(System.in);
		System.out.println("Please enter first integer: ");
		int firstNumber = firstNumObj.nextInt();
		Scanner secondNumObj = new Scanner(System.in);
		System.out.println("Please enter second integer: ");
		int secondNumber = secondNumObj.nextInt();
		Scanner thirdNumObj = new Scanner(System.in);
		System.out.println("Please enter third integer: ");
		int thirdNumber = thirdNumObj.nextInt();
		//Create arrayList from the 3 integers provided
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		numArray.add(firstNumber);
		numArray.add(secondNumber);
		numArray.add(thirdNumber);
		Collections.sort(numArray, Collections.reverseOrder());
		for (int i = 0; i < numArray.size(); i++) {
			System.out.print(numArray.get(i).toString() + ", ");
		}
	}
}
