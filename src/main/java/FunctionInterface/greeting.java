package FunctionInterface;

public class greeting {

 private String name;

 public greeting(){}

 public greeting(String name){
     this.name=name;
 }

 public String hello(String name){
    return "hello " +name;
 }

 public static String hi(String name){
     return  "hi "+name;
 }

 public String getName(){
     return name;
 }
}
