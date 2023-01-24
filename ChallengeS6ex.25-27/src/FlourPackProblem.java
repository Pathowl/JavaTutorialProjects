public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
        while (bigCount > 0 && goal >=5){
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal;
        }

    }

    public static void main(String[] args) {
        System.out.println(canPack(2,2,13));
    }
}
