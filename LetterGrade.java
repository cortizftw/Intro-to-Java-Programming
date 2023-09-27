//This program displays the letter equivalent to a numeric grade

import java.util.Scanner;

public class LetterGrade {
	public static void main(String[] args) {
		Scanner gradeObj = new Scanner(System.in);
		System.out.println("Please enter numeric grade: ");
		int grade = gradeObj.nextInt();
		if (grade > 80) {
			System.out.println(grade + "% = A");
		} else if (grade >= 70 && grade <= 79){
			System.out.println(grade + "% = B");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println(grade + "% = C");
		} else if (grade >= 50 && grade <= 59) {
			System.out.println(grade + "% = D");
		} else if (grade < 50) {
			System.out.println(grade + "% = F");
		}
	}
}
