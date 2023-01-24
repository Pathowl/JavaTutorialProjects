import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array = {7,43,87,3,4,8,2,7,6457,5};
        int smallest = array[0];
        int largest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest) smallest = array[i];
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] > largest) largest = array[j];
        }
        System.out.println(largest + " largest");
        System.out.println(smallest + " smallest");

        String r = reverse("Wszystkiego najlepszego!");
        System.out.println(r);
        System.out.println(Arrays.toString(array));
        int[] reverse = sortArray(array);
        int biggest = reverse[reverse.length - 1];
        int secondBiggest = reverse[reverse.length-2];
        System.out.println(biggest + " biggest");
        System.out.println(secondBiggest + " secondBiggest");


    }
    public static String reverse(String s) {
        char[] letters = new char[s.length()];

        int letterIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }

        String reverse = "";
        for (int i = 0; i <s.length(); i++){
            reverse = reverse + letters[i];
        }

        return reverse;
    }
    public static int[] sortArray(int[] array){

        Arrays.sort(array);
        return array;
    }
}