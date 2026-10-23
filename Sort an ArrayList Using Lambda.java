
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(50, 10, 40, 20, 30));

        numbers.sort((a, b) -> a - b);

        System.out.println(numbers);
    }
}
