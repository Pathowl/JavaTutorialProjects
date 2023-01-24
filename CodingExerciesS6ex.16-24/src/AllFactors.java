public class AllFactors {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int divider = 0;
            while (divider < number) {
                divider++;
                if (number % divider == 0) {
                    System.out.println(divider);
                } else {
                    continue;
                }
            }
        }
    }



    public static void main(String[] args) {
        printFactors(10);
    }
}
