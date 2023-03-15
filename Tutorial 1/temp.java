import java.util.Scanner;

public class temp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Centigrade temperature: ");
		float centi = input.nextFloat();
		double fahren = (9.0/5) * centi + 32;
		System.out.println(centi + " Centigrade is equal to " + fahren + " Fahrenheit");
	}
}