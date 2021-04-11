package training.collections;

import java.util.*;

public class CollectionsTest2 {
    //Map<List<String>> box = new TreeMap<List<String>>();
    //LinkedList<String> box = new LinkedList<String>();
    //HashMap<?, List<String>> box = new HashMap<String, List<String>>();
    //HashMap<?, List<String>> box = new HashMap<?, List<String>>();

    public static void main(String[] args) {
        //Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>(); //will work if lines //2 and //3 are commented out.
        Map m = new HashMap();
        //Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>();// will work if lines //1 and //3 are commented out.
        new CollectionsTest2().dumpStuff();
        m.put("1", new ArrayList());    //1
        m.put(1, new Object());    //2
        m.put(1.0, "Hello");     //3
        System.out.println(m);
        List<String> list = new ArrayList<>(10);
    }

    public void dumpStuff(){
        /*for (List<String> l : box.values){
            System.out.println(l);
        }*/
    }
}
