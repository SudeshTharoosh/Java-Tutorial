import java.util.Scanner;

public class m_cm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter meters: ");
		float meters = input.nextFloat();
		float centi = meters * 100;
		System.out.println(meters + " meters is equal to " + centi + " centimeters");
	}
}