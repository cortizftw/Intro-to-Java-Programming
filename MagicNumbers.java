//This program performs a magic trick where the final answer ia always 1
public class MagicNumbers {
	public static void main(String[] args) {
		int startNumber;
		int magicNumber;
		startNumber = 7;
		magicNumber = startNumber + 2;
		magicNumber = magicNumber * 2;
		magicNumber = magicNumber - 2;
		magicNumber = magicNumber / 2;
		magicNumber = magicNumber - startNumber;
		System.out.println("The magic number is number: " + magicNumber);
	}
}
