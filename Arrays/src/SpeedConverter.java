public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            return -1;
        } else {
            long miles = Math.round(kilometersPerHour / 1.609);
            return miles;
        }
    }
    public static void printConversion(double kilometersPerHour) {
        double miles = kilometersPerHour / 1.609;
        System.out.println(kilometersPerHour + " km/h = " + Math.round(miles) + " mi/h");
    }
}
