package training.collections;

import java.util.*;

public class CollectionsTest4 {
    public static void main(String[] args) {
        HashSet<String> keys = new HashSet<>(List.of("a", "b", "c"));
        List lista = List.of("a", "b", "c");
        ArrayList<String> values = new ArrayList<>(Set.of("1", "2", "3"));
        Map<String, String> m;
        m = new HashMap<>();
        Float f = 2.0f;



        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
        int i = 0;
        for (var key : keys) {
            m.put(key, values.get(i++));
        }
        keys.clear();   //2
        values.clear();

        System.out.println(m.keySet().size()+" "+m.values().size());
    }
}
