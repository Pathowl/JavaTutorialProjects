import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int loopcount = 0;
        int sum = 0;
        int avg = 0;
        while (true) {
            try {
                System.out.println("Give a number: ");
                String firstNumber = scanner.nextLine();
                int number = Integer.parseInt(firstNumber);
                loopcount++;
                avg += number / loopcount;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}




    public static void main(String[] args) {
        System.out.println("first method");
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println("second method");
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println("third method");
        System.out.println(getBucketCount(3.4,1.5));
        System.out.println(getBucketCount(6.26,2.2));
        System.out.println(getBucketCount(3.26,0.75));

    }