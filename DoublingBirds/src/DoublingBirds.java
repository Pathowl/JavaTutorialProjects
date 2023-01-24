import java.util.Scanner;

public class DoublingBirds {
    public void getBirds(){

        int years;
        long finalbirds;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of years after birds came to the Park: ");
        String num = scanner.nextLine();
        years = Integer.parseInt(num);
        finalbirds = 1L << years;
        System.out.printf("%d - number of birds after coming to the Beka nad Zatoką Pucką park %d years ago.", finalbirds, years);
    }
}
