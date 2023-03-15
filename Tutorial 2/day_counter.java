import java.util.Scanner;

public class day_counter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month = input.nextInt();
		String month_name = "";
		int number_Of_DaysInMonth = 0;
		
		switch (month) {
            case 1:
                month_name = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                month_name = "February";
				number_Of_DaysInMonth = 28;
                break;
            case 3:
                month_name = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                month_name = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                month_name = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                month_name = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                month_name = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                month_name = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                month_name = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                month_name = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                month_name = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                month_name = "December";
                number_Of_DaysInMonth = 31;
				break;
			default:
				System.out.print("Invalid input");
		}
		System.out.print(month_name + " has " + number_Of_DaysInMonth + " days");
   
	}
}