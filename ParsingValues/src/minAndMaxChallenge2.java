import java.util.Scanner;

public class minAndMaxChallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopCount = 0;
        double sum = 0;

        while (true){
            System.out.println("Enter a number: ");
            String entry = scanner.nextLine();
            try {

                double number = Double.parseDouble(entry);
                if (loopCount == 0 || number < min){
                    min = number;
                }
                if (loopCount == 0 || number > max){
                    max = number;
                }
                loopCount++;

            } catch (NumberFormatException nfe){
                break;
            }
        }
        sum = min + max;
        System.out.println("Your min number was: " + min + " and Your max number was: " + max + ", sum of these numbers is: " + sum);

    }
}
