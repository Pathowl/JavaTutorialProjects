public class PositiveNegativeZero {
    public static void main(String[] args) {
        checknumber(1);
        checknumber(2);
        checknumber(0);
        checknumber(-1);
    }

    public static void checknumber(int number) {

        if (number > 0) {
            System.out.println("positive");
        } else if (number< 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}