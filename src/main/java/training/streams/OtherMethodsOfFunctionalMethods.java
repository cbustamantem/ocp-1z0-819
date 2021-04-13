package training.streams;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class OtherMethodsOfFunctionalMethods {

    public static void print(Integer p){
        System.out.println(p);
    }
    public static void main(String[] args) {
        predicateSample();
        infiniteStream();
        findMinimum();
        findOptional();
    }

    private static void predicateSample() {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());
        System.out.println(egg.test("egg"));
    }

    private static void infiniteStream() {
        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                    1,                // seed
                    n -> n < 100,     // Predicate to specify when done
                    n -> n + 2);
    }

    private static void findMinimum() {
        //comparator
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
        min.ifPresent(System.out::println); // ape
    }

    public static void findOptional(){
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);        // monkey (usually)
        infinite.findAny().ifPresent(System.out::println); // chimp
    }
}
