import java.util.Scanner;
import java.util.Random;

public class secretnum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(1, 21); // 1 t0 20
		System.out.print("Guess the number between 1 to 20: ");
		int guess = input.nextInt();
		int count = 0;
		while (guess != num) {
			System.out.println("Try again.......");
			count += 1;
			System.out.print("Guess the number between 1 to 20: ");
			guess = input.nextInt();
		}
		System.out.println("The secret number is: " + num + " and it took you " + count + " guesses to guess.");
	}
}