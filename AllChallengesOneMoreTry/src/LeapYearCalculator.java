public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 && year > 0 && year < 9999){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }
}
