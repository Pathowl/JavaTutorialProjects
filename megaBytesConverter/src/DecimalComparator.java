public class DecimalComparator {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes >= 0){
            int megabytes = kiloBytes / 1024;
            int myRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + myRemainder + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1060);
    }
}
