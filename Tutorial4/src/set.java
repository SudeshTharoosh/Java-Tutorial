import java.util.Scanner;
public class set {
    public static void main(String[] args) {
        int[] set = {2,3,4,5,6,7,8,9};

        for (int num: set){
            if (num % 2 == 0){
                System.out.println(num + " is an even number");
            }
        }

        System.out.println("\nNumbers multiplied by 2 and also elements of set A");
        for (int i = 0; i < set.length; i++){
            int factor = set[i] * 2;
            for (int j = 0; j < set.length; j++){
                if (set[j] == factor){
                    System.out.print(set[i] + " ");
                    break;
                }
            }
        }

    }
}
