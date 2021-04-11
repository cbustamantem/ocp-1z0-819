package training.collections;

import java.util.List;

public class CollectionsTest5 {
    public static void main(String[] args) {
        List<? super Booby> bV = null;
        List<? extends Tooby> tV = null;
        bV.add( tV.get(0) );

    }
}
class Booby{ }
class Dooby extends Booby{ }
class Tooby extends Dooby{ }
