import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String[] originalArray = new String[] {"First", "Second", "Third"};
        System.out.println(Arrays.toString(originalArray));
        var originalList = Arrays.asList(originalArray);
        System.out.println(originalList);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("fourth");
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
}