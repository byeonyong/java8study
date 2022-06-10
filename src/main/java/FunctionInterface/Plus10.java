package FunctionInterface;

import java.util.function.Function;

// 클래스에 인터페이스를 상속받아서 구현 후 이 클래스를 원하는데서 가져다 써도 인터페이스를 implements 해서 쓰는거랑 동일한 효과
public class Plus10 implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer+10;
    }

}
