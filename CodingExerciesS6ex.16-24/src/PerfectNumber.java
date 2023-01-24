public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int divider = 0;
            int result = 0;
            while (divider < number) {
                divider++;
                if (number % divider == 0) {
                    result += divider;
                } else {
                    continue;
                }
                if (number == result) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
}
