import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert your FirstName: ");
		String FirstName = input.next();
		System.out.println("Insert your SecondName: ");
		String SecondName = input.next();
		System.out.println(FirstName.substring(0,1) + SecondName.substring(0,1));
	}
}