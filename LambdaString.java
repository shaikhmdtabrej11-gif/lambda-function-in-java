import java.util.function.Consumer;

public class LambdaString {
    public static void main(String[] args) {

        Consumer<String> message =
                name -> System.out.println("Hello, " + name);

        message.accept("Tabrej");
        message.accept("Java Developer");
    }
}
