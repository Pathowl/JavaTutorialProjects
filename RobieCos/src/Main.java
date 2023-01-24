import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Anime();
    }

    public static void Anime() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("""
                What's Your favourite anime series?
                (1) Bleach
                (2) Attack on Titans
                (3) Naruto
                (4) One Punch Man
                (5) Demon Slayer
                """);
        int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("TENSA ZANGETSU");
                    break;
                case 2:
                    System.out.println("RUMBLING");
                    break;
                case 3:
                    System.out.println("RASENGAN");
                    break;
                case 4:
                    System.out.println("SERIOUS PUNCH");
                    break;
                case 5:
                    System.out.println("SLASH");
                    break;
                default:
                    System.out.println("Wrong number");
            }
        }
        public static class car{
        private String Marka;
        privat
        }
    }




