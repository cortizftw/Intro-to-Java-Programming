
/*A simple program that takes an integer as 
 * an input then tells if a number is positive or 
 * negative and it is divible by 7
 */
import java.util.Scanner;

public class AmIPositive {
	public static void main(String[] args) {
		Scanner intObj = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = intObj.nextInt();
		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else {
			System.out.println(number + " is a negative number");
		}
		if (number % 7 == 0) {
			System.out.println(number + " is divisible by 7");
		} else {
			System.out.println(number + " is not divisible by 7");
		}
	}

}
