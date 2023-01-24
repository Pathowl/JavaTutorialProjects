public class Main {
    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;
        for (int i = 10; i <= 1000 ; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                countOfMatches++;
                System.out.println(i + " is divided by 3 and 5 " + countOfMatches);
                if (countOfMatches == 3){
                    break;
                }
            }
        }

    }
}