import java.util.Scanner;
public class arrayswap {
    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter index value of i to be swapped: ");
        int i = input.nextInt();
        System.out.print("Enter index value of j to be swapped: ");
        int j = input.nextInt();

        if (i > 0 && i < array.length && j > 0 && j < array.length){
            double temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }else{
            System.out.println("Invalid index");
        }

        System.out.println("After swapping");
        for (double num : array){
            System.out.println(num);
        }

    }
}
