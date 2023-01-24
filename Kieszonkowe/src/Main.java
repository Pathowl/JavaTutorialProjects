import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store");
        int num = sc.nextInt();
        int[] array = new int[num];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("array = ");
        for (int i = 0; i < num; i++){
            System.out.print(array[i] + ", ");
        }

    }
}