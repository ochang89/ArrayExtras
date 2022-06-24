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

        // check if more than one digit, if true then math() again
        // m % 10 == 0 this means theres no digits left.
        // if m % 10 equals a single digit, it will equal 0 anyway after math()
        // therefore, run math() again for anything other than 0 (which means multiple digits)


        // do not need to increment sum again, just need to reset it to new value of math(m)
        // realized that after running math() twice, it will always be a single digit. don't need loop

        while(m % 10 != 0){
            sum = math(m);
            System.out.println(sum);
            if(sum > 9) {
                sum = math(sum);
            }
            break;
        }

        System.out.println("Single digit result: " + sum);
    }
    public static int math(int n){
        int sum = 0;
        int num;
        while(n > 0) {
            // n = 123456,
            // n % 10 = 123456 = 6,
            num = n % 10;
            //sum = 6,
            sum += num;
            // chop off decimal, now left with 12345,
            n = n / 10;
        }

        return sum;
    }
}
