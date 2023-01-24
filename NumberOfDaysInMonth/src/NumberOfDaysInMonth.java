public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year){
        if (year >= 1 && year < 9999) {

        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        return false;
    }
public static void getDaysInMonth(int month, int year){
        if ((month > 1 && month < 12) && (year > 1 && year < 9999));
    }
}
