import java.util.Scanner;

public class ArrayExtra4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // return sum to m. if more than 1 digit,
        int sum = 0;
        int m = math(n);
        System.out.println(m);

        // check if more than one digit, math again
        if(m % 10 != 0) {
            // set new sum as m passed in math
            sum = math(m);
        }
        System.out.println("Single digit result: " + sum);
    }
    public static int math(int n){
        int sum = 0;
        int num;
        while(n > 0) {
            // n = 12345, 1234
            // n % 10 = 1234.5 = 5,
            num = n % 10;
            //num = 5,
            sum += num;
            // chop off decimal, now left with 1234,
            n = n / 10;
        }
        return sum;
    }
}
