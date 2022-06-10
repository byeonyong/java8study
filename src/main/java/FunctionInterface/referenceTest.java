package FunctionInterface;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class referenceTest {

    public static void main(String[] args) {

//        static일때 "타입::스태틱메소드" 형태로
        UnaryOperator<String> hi = greeting::hi;
        System.out.println(hi.apply("by1"));

//        인스턴스메소드 일때는 "객체레퍼런스::인스턴스메소드" 형태로
        greeting greet = new greeting();
        UnaryOperator<String> hello = greet::hello;
        System.out.println(hello.apply("by2"));

//        입력값이 String이고 리턴값이 greeting인것 (greeting(String name) 를 가져옴)
        Function<String, greeting> bygreet = greeting::new;
        greeting gre = bygreet.apply("test");
        System.out.println(gre.getName());

//       입력값이 없고 리턴값은 greeting (greeting의 빈 생성자(greeting())를 가져오는것임)
        Supplier<greeting> newgreet = greeting::new;
        System.out.println(newgreet.get());
    }

}
