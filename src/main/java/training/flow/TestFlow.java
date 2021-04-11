package training.flow;

public class TestFlow {
    static int var1;
    static String val2;
    public static void main(String[] args) {

        System.out.println("MAX1:" + max(300, 500));
        System.out.println("MAX2:" + max(400, 300));
        var k = 9;
        var s = 5;
        switch (k) {
            default:
                if (k == 10) {
                    s = s * 2;
                } else {
                    s = s + 4;
                    break;
                }
            case 9:
                s = s + 3;
        }
        System.out.println(s);
        var x = "fe";
        char f = 'e';
        switch (x) {
            case "e": {

            }
        }
        new TestFlow().printThem();
        System.out.println("-------------------");
        String arg[] = {"Good", "bye", "friend!."};
        for (int i = 0; i < args.length; i++) System.out.print(i == 0 ? arg[i] : " " + arg[i]);

        System.out.println("-------------------");
        int i;
        int j;
        for (i = 0, j = 0; j < 1; ++j, i++) {
            System.out.println(i + " " + j);
        }
        for (var s1 : args) {
            System.out.println("S:" + s1);
        }
        if (false) ;
        else ;

        var i2 = 10;
        example();
    }

    static void example() {
        switch (1) {
            default:
                break;
        }
        do {
            break;
        } while (true);
        int x = 0;
        //while (false) { x=3; }
        if (false) {
            x = 3;
        }
        for (var i = 0; i < 0; i++) x = 3;
        int[] arr = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        ricardofor:
        for (var value : arr) {
            if (counter >= 5) {
                break;
            } else {
                continue;
            }
        }
        System.out.println(arr[counter]);
        calculate(2);
        System.out.println("/////////////////////");
        System.out.println("val1:"+ var1);
        System.out.println("val1:"+ var1);
        
    }

    static int max(int x, int y) {
        var m = x > y ? x : y;
        return m;
    }


    int k = 5;

    public boolean checkIt(int k) {
        return k-- > 0 ? true : false;
    }
    public static void calculate(int x){
        String val= null;
        switch(x){
            case 2: break;
            default:
                val = "def";
        }
        System.out.println(val);
    }
    public void printThem() {
        while (checkIt(k)) {
            System.out.print(k--);
        }
    }


}
