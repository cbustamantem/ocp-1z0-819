package training.streams;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FunctionalProgrammingConsumer1 {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie");
        c2.accept("Annie");
        c1.accept("printing");



    }
    public static void biConsumerTest(){
        //BiConsumer
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println("MAP");
        System.out.println(map);
    }

    public static void predicateTest() {

        // BiPRedicate
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 =
                (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));  // true
        System.out.println(b2.test("chicken", "chick"));  // true
    }
}
