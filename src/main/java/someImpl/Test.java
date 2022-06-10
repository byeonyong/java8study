package someImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class Test  {
    public static void main(String[] args) {

/**
 * iterator
 */
        List<String> name = new ArrayList<>();
        name.add("by");
        name.add("ys");
        name.add("tj");
        name.add("cw");

        name.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("################");
        name.forEach(System.out::println);
        System.out.println("################");

        /**
         *  spliterator
         */

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        while(spliterator.tryAdvance(System.out::println));
        System.out.println("###############");
        while(spliterator1.tryAdvance(System.out::println));


        /**
         * removeIf
         * to remove data that contains input data in String
         */

//        name.removeIf(s -> s.contains("t"));

//       문자열 순서대로 정렬되는거 (compareToIgnoreCase) , .reversed 역순 정렬
        Comparator<String> compareator = String::compareToIgnoreCase;
        name.sort(compareator.reversed());
        System.out.println(name);

        name.sort(String::compareToIgnoreCase);

        long cnt =  name.stream().map(String::toUpperCase)
                                .filter(s -> s.length() == 2)
                                .count();

        System.out.println(cnt);
    }
}
