import java.util.Scanner;

public class temp_check {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature in Celcius: ");
		Double temp = input.nextDouble();
		if (temp >= 25.0){
			System.out.println("Hot");
		}
		else{
			System.out.println("Cold");
		}
	}
}