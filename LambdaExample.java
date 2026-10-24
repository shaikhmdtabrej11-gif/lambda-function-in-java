import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {

        // 1. Addition using Lambda
        Calculator sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(10, 20));

        // 2. Even number using Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        // 3. Print list using Lambda
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        numbers.forEach(n -> System.out.println(n));
    }
}
