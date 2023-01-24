public class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            int lastDigit = number % 10;

        }
    }
    public static int getDigitCount (int number){
        if (number < 0){
            return -1;
        }else {
            int counter = 0;
            int number1 = number;
            while (number1 > 0){
                if (number < 10){
                    counter = 1;
                }
                if (number / 10 > 0){
                    number1 = number1 / 10;
                    counter++;
                } else {
                    break;
                }
            }return counter;
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        while (number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }return reverse;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(31441243));
        System.out.println(reverse(21341));
    }
}
