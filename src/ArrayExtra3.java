import java.util.Scanner;

public class ArrayExtra3 {

    public static void boxWithMinorDiagonal(int n) {
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if(i == 0 || i == n || j == 0 || j == n)
                {
                    System.out.print("*");
                }
                else
                {
                    // if not at index 0 or n, fill with white space
                    if(i == 1 || j == (n-i))
                    {
                        System.out.print("+");
                    }
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void rightTriangle(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = input.nextInt();

        //boxWithMinorDiagonal(n);
        rightTriangle(n);
    }
}
