
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThan20 = n -> n > 20;

        System.out.println("Even numbers:");
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);

        System.out.println("Numbers greater than 20:");
        numbers.stream()
               .filter(isGreaterThan20)
               .forEach(System.out::println);

        System.out.println("Even and greater than 20:");
        numbers.stream()
               .filter(isEven.and(isGreaterThan20))
               .forEach(System.out::println);
    }
}
