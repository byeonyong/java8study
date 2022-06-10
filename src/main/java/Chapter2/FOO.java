package Chapter2;

import java.util.Locale;

public interface FOO {

    void printName();

    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔줌
     */
    default void printNameUppercase(){
        System.out.println(getName().toUpperCase());
    }

    String getName();
}
