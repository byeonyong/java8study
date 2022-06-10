package FunctionInterface;

import java.util.function.Function;

public class TEST01 {

    public static void main(String[] args) {
        Function<Integer,Integer> plus10 = (i) -> i + 10;
        Function<Integer,Integer> multiply = (i) -> i * 2;

//      뒤부터 연산
        System.out.println(plus10.compose(multiply).apply(3));
        
//        앞부터 연산
        System.out.println(plus10.andThen(multiply).apply(3));
    }
}
