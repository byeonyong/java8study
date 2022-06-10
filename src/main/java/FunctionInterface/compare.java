package FunctionInterface;

import java.util.Arrays;

public class compare {
    public static void main(String[] args) {
        String [] names = {"by","ys","tj","cw"};

        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.asList());
    }
}
