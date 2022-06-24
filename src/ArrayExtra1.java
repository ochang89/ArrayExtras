import java.util.Scanner;

public class ArrayExtra1 {

    public static int getMax(int[] a){
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int getMin(int[] a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static int sumValues(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static double getAverage(int[] a){
        double sum = sumValues(a);
        double avg = sum / a.length;
        return avg;
    }
    // return (int) how many values greater than avg
    public static double greaterThanAverage(int[] a){
        int count = 0;
        double avg = getAverage(a);
        for(int i = 0; i < a.length; i++){
            if(a[i] > avg){
                count++;
            }
        }
        return count;
    }
    // find how many nums that next value is bigger
    public static int countInc(int[] a){
        int count = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i+1] > a[i]){
                count++;
            }
        }
        return count;
    }
    // count how many when next num is smaller
    public static int countDec(int[] a){
        int count = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void printArray3PerLn(int[] a){
        int lineCount = 0;
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
            lineCount++;
            if (lineCount == 3) {
                System.out.println();
                lineCount = 0;
            }
        }
    }

    // MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer n, greater than 0: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        int max = 500;
        int min = 1;
        int range = max - min + 1;

        // initialize array with random integers between 1-500
        for(int i = 0; i < arr.length; i++){
            int rand = (int) (Math.random() * range + min);
            arr[i] = rand;
        }
        System.out.println("Array on one line:\n");
        printArray(arr);
        System.out.println("Maximum: " + getMax(arr));
        System.out.println("Minimum: " + getMin(arr));
        System.out.println("Sum: " + sumValues(arr));
        System.out.println("Average: " + getAverage(arr));
        System.out.println("Number of integers greater than average: "+ greaterThanAverage(arr));
        System.out.println("Number of times subsequent value increases: " + countInc(arr));
        System.out.println("Number of times subsequent value decreases: " + countDec(arr));
        System.out.println("Array with 3 elements per line:");
        printArray3PerLn(arr);
    }
}
