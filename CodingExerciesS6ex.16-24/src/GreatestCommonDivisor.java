public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int result = 0;
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i==0){
                    result = i;
                }
            } return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10,25));
    }
}







