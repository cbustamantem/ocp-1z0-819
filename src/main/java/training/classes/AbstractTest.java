package training.classes;

 public abstract class AbstractTest {
     abstract public void feo() throws Exception;
 }
 abstract class AbstractTest2  extends AbstractTest {
     @Override
    abstract public void feo() throws RuntimeException;
}
 class Test2 extends AbstractTest2{

    @Override
    public void feo() {
        System.out.println("feo");
    }

    public static void main(String[] args) {
        new Test2().feo();
    }
}
