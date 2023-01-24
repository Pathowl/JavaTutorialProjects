public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            return false;
        } else {
            int lastDigit1 = number1 % 10;
            int lastDigit2 = number2 % 10;
            int firstDigit1 = number1 / 10;
            int firstDigit2 = number2 / 10;
            if ((firstDigit1 == firstDigit2) || (lastDigit1 == lastDigit2)){
                return true;
            } else if ((lastDigit1 == firstDigit2) || (lastDigit1 == firstDigit1)) {
                return true;
            } else {
                return false;
            }

            }
        }



    public static void main(String[] args) {
        System.out.println(hasSharedDigit(25,15));
    }
}
