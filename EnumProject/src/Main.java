import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek weekday = DayOfTheWeek.TUES;
        System.out.println(weekday);


        for (int i = 0; i < 10; i++) {
            weekday = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n", weekday.name(), weekday.ordinal());
            if (weekday == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }
        }
        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
    }

    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];

    }
}