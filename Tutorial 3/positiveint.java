import java.util.Scanner;

public class positiveint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		System.out.print("Output: ");
		int count = 0;
		while (count < num) {
			System.out.print(letter);
			count ++;
		}
	}
}