import java.util.Scanner;

public class ArrayExtra4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int sum = 0;
        int num;

        while (n > 0) {
            // n = 5578
            // n % 10 = 557.8 = 8
            num = n % 10;
            sum += num;
            // chop off decimal, now left with 557
            n = n / 10;
        }
        System.out.println("Single digit result: " + sum);
    }
}
