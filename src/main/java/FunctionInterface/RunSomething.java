package FunctionInterface;// 인터페이스에서 추상 메소드(즉 메소드, 인터페이스에서는 앞에 abstract가 생략되어 추상메소드로 생성됨)가 하나인것을 함수형 인터페이스라고 함

//함수형 인터페이스를 생성해줄때는 아래 어노테이션 @FunctionalInterface 추가해줌
@FunctionalInterface
public interface RunSomething {

    //   doit하나만 있을때 함수형 인터페이스
    int doIt(int number);

//    doitAgain이 하나가 더 추가되어서 함수형 인터페이스가 아니게 돼버림
//    void doitAgain();
}
