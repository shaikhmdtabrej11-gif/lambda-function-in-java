
@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Addition sum = (a, b) -> a + b;

        System.out.println(sum.add(10, 20));
        System.out.println(sum.add(50, 30));
    }
}
