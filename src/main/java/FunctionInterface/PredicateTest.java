package FunctionInterface;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> startsWith = (s) -> s.startsWith("by");

    }
}
