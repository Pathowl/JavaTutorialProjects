public class Main {

    public static void main(String[] args) {


        FizzBuzz(45);


    }
    public static void FizzBuzz(int num) {
        if (num > 100 || num < 1) {
            System.out.println("wrong number");
        } else {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println("not fizz not buzz");
            }
        }
    }

    
}