public class shouldWakeUp {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay > 23 || hourOfDay < 0) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay == 23)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }
}