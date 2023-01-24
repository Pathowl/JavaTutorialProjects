public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(true, 10000, 8 , 200);
        System.out.println("the highscore is: " + highscore);

        calculateScore(true, 800, 5, 100);


    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelComplete * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }
}