package training.collections;

import java.util.ArrayList;

public class CollectionTest3 {

//    What will happen when the following code is compiled and run?


    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        //al.add(111);                //INSERT CODE HERE
        System.out.println(al.indexOf(1.0));
        System.out.println(al.contains("string"));
    }
}

class AX {
    static int[] x = new int[1];

    static {
        x[0] = 10;
    }

    public static void main(String[] args) {
        var ax = new AX();
        var index = 1;
        try {
            getArray()[index = 2]++;
        } catch (Exception e) {}//empty catch
          System.out.println("index = " + index);
    }

    public static int[] getArray() {
        return null;
    }
}

