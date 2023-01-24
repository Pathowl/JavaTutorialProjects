public class isEvenNumber {
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int even = 0;
        int odd = 0;

        while (number <=finishNumber) {
            number++;
            if (!isEvenNumber(number)){
                odd++;
                continue;
            }
            System.out.println("Even number " + number);
            even++;
            if (even >= 5){
                break;
            }
        }
        System.out.println("Total odd = " + odd);
        System.out.println("Total even = " + even);
    }
}

