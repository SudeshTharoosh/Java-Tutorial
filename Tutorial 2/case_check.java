import java.util.Scanner;

public class case_check{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char letter = input.next().charAt(0);
		if (letter >= 'A' && letter <= 'Z'){
			System.out.println(letter + " is an upper case");
		}
		else if (letter >= 'a' && letter <= 'z'){
			System.out.println(letter + " is a lower case");
		}
		else{
			System.out.println(letter + " is not an ALPHABET");
		}
	}
}