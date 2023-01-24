public class printMegaBytesAndKiloBytes {
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int megabytes = 0;
        int reKilobytes = 0;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else{
            megabytes = kiloBytes / 1024;
            reKilobytes = kiloBytes % 1024;
            System.out.println(megabytes + "  " + reKilobytes);
        }
    }
}
