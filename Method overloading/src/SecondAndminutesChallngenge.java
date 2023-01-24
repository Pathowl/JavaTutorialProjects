public class SecondAndminutesChallngenge {
    public static String getDurationString(int seconds){
        if (seconds >= 0) {

            int minutes = seconds / 60;
            return getDurationString(minutes, seconds);

        }
        return "chuj ci w dupe";
    }
    public static String getDurationString(int seconds, int minutes){
        if (minutes >= 0 && seconds >=0 && seconds <= 59) {

            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return hours + "h " + remainingSeconds + "m " + remainingSeconds + "s";
        }
        return "chuj ci w dupe";
    }
}
