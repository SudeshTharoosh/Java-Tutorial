import java.util.Scanner;

public class company{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int manual, skilled, management;
		double wage, tax;

		while(true){
			System.out.print("Enter number of manual employees: ");
			manual = input.nextInt();
			if (manual >= 0)break;{
				System.out.println("Invalid input, try again");
			}
		}
		
		while(true){
			System.out.print("Enter number of skilled employees: ");
			skilled = input.nextInt();
			if (skilled > 0)break;{
				System.out.println("Invalid input, try again");
			}
		}
		
		while(true){
			System.out.print("Enter number of skilled employees: ");
			management = input.nextInt();
			if (management > 0)break;{
				System.out.println("Invalid input, try again");
			}
		}
		
		wage = (manual * 500) + (skilled * 700) + (management * 800);
		tax = wage * 0.2;
		
		System.out.println("Wage Bill is: " + wage);
		System.out.println("The approximate tax is: " + tax);
		
	}
}