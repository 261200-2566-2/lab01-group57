import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int num = s.nextInt();
        int[] numbers = new int[num];
        System.out.println("Enter your number: ");
        for(int i = 0;i < num; i++){
            numbers[i] = s.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Finish: ");
        for (int i = 0; i < num; i++){
            System.out.println(numbers[i]);
        }
    }
}