package FunctionInterface;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);
    }
}
