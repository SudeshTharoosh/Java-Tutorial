import java.util.Scanner;

public class double_sum {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		Double num1 = input.nextDouble();
		System.out.print("Enter second number: ");
		Double num2 = input.nextDouble();
		Double total = num1 + num2;
		System.out.println("The total is " + total);
		
	}
}