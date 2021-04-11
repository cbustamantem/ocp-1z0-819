package training.collections;

public class CollectionsTest1 {
    public static void main(String[] args) {
        MyGenericClass gc = new MyGenericClass();
        System.out.println(gc.transform(1)); //1
        System.out.println(gc.transform("hello")); //2
        MyGenericClass<String> gcStr = new MyGenericClass<String>();
        System.out.println(gcStr.transform(1.1)); //3
    }
}

class MyGenericClass<T> {
    public <T> String transform(T t) {
        return t.toString() + "-" + t.hashCode();
    }
}
