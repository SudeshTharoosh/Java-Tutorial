import java.util.Scanner;

public class grading_system{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mark to obtain your grade: ");
		int mark = input.nextInt();
		if (mark > 80 && mark <= 100){
			System.out.println("A");
		}
		else if (mark > 60 && mark <= 80){
			System.out.println("B");
		}
		else if (mark > 50 && mark <= 60){
			System.out.println("C");
		}
		else if (mark > 45 && mark <= 50){
			System.out.println("D");
		}
		else if (mark > 25 && mark <= 45){
			System.out.println("E");
		}
		else{
			System.out.println("F");
		}
	}
}