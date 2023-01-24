public class NumberInWord {
    public static void printNumberInWord(int number1) {
        switch (number1) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("Other");
        }
        ;
    }


    public static void main(String[] args) {
        printNumberInWord(721);
        printNumber(31234);
    }

    public static void printNumber(int number2) {
        if (number2 == 0) {
            System.out.println("Zero");
        } else if (number2 == 1) {
            System.out.println("One");
        } else if (number2 == 2) {
            System.out.println("Two");
        } else if (number2 == 3) {
            System.out.println("Three");
        } else if (number2 == 4) {
            System.out.println("Four");
        } else if (number2 == 5) {
            System.out.println("Five");
        } else if (number2 == 6) {
            System.out.println("Six");
        } else if (number2 == 7) {
            System.out.println("Seven");
        } else if (number2 == 8) {
            System.out.println("Eight");
        } else if (number2 == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }
    }
}