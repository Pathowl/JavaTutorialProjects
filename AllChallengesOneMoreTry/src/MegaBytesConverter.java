public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        System.out.println();
        int megabytes = 0;
        int reKilobytes = 0;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            megabytes = kiloBytes / 1024;
            reKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + reKilobytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }
}
