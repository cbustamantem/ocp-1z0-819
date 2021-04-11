package training.classes;

import java.util.Observable;
import java.util.Observer;

interface I1{
    int i = 10;
    public static final int UNIT=100;
    void m1();
}
interface I2 extends I1 {
    int i = 20;
    public static int getBreadth(){ return 0; }
    void m1();
    private void m2() {
        System.out.println(i);
    }
}

class A1 implements I1,I2, Runnable{
    int x=11111;
    protected void testOver() throws Exception{
        System.out.println();
        System.out.println("test");

    }

    @Override
    public void run() {

    }

    @Override
    public void m1() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        A1 a1 = new A1();
        ((I1)a1).m1();
    }
}
class B1 extends A1 implements Observer {
    @Override
    protected void testOver() {
        System.out.println("test2");
        throw new IllegalArgumentException("test Ilegal");
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
class C1 extends B1{

}
public class TestObjClass {
    public static void main(String[] args) throws Exception {
        System.out.printf("works!");
        A1 a = new A1();
        B1 b = new B1();
        System.out.println(a.x);
        //a= (B)(I) b;
        //b= (B)(I) a;
        //a= (B1)(I1) b;
        System.out.println("it works ");
        I1 i = (I1) b;
        a.testOver();
        // Object o = a;
        Object o = b;
        Runnable r = (Runnable) b;
        //System.out.println(A1.i);
        System.out.println(x);
        final var av=2;

    }
    static double x;
}
