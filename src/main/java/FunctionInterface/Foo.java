package FunctionInterface;

public class Foo {
    public static void main(String[] args) {

//      클래스가 아닌 인터페이스를 선언한거임
//      이런걸 익명 내부 class라고 함
        RunSomething notRamda = new RunSomething() {

//          인터페이스를 사용해줄때에는 그 안에 있는 추상메소드를 OVERRIDE해서 사용해줘야 되니깐. 인터페이스를 생성한곳에서 바꿔주는것
//          이게(추상메소드) 인터페이스에 하나만 있을때는 람다식으로 표현을 할수가 있다는 말씀
            @Override
            public int doIt(int number) {
                return number+10;
            }
        };

        RunSomething Ramda = number -> number+11;

        System.out.println("not Rambda : "+notRamda.doIt(10));
        System.out.println("Rambda : "+Ramda.doIt(10));
    }
}
