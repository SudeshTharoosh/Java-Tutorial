import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int[] marks = new int[10];
        int failcount = 0;
        int totalmark = 0;
        double average = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.print("Enter mark " + (i+1) + ": ");
            marks[i] = input.nextInt();
        }

        for (int mark: marks){
            if (mark < 40){
                failcount += 1;
            }
            totalmark += mark;
        }

        average = totalmark / marks.length;

        System.out.println("\nThe number of students failed: " + failcount);
        System.out.println("The average is: " + average);

    }
}
