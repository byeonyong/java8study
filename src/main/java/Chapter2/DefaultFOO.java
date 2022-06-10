package Chapter2;

public class DefaultFOO implements FOO{

    String name;

    public DefaultFOO(String name){
        this.name = name;
    }

    public void test(){
        System.out.println("test");
    }


    @Override
    public void printName() {
        System.out.println(this.name);
    }



    @Override
    public String getName() {
        return this.name;
    }
}
