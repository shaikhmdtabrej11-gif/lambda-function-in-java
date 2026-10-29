
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class LambdaHello {
    public static void main(String[] args) {

        Greeting greeting = () -> System.out.println("Hello, World!");

        greeting.sayHello();
    }
}
