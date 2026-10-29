
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class LambdaAddition {
    public static void main(String[] args) {

        Calculator calc = (a, b) -> a + b;

        System.out.println("Sum: " + calc.add(10, 20));
        System.out.println("Sum: " + calc.add(50, 30));
    }
}
