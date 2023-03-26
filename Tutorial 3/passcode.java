import java.util.Scanner;

public class passcode {
	public static void main(String[] args) {
		int key = 486251;
		int count = 1;
		Scanner input = new Scanner(System.in);
		while (count < 5) {
			System.out.print("Enter passcode: ");
			int userinput = input.nextInt();
			if (userinput == key) {
				break;
			}
			else {
				System.out.println("Try again");
				count += 1;
			}
		}

	} 
}