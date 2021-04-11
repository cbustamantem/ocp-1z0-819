package training.strings;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        new ExampleStringBuilder().practice2();
    }

    protected void practice1() {
        String tea="Tea";
        String c  = new String("Tea");
        String z = c.intern();
        System.out.println("----------------------");
        System.out.println(c.intern() == tea);
        System.out.println(c == z);
        System.out.println(tea == z);
        System.out.println("----------------------");
        c = "TEA TEA";
        System.out.println(c.lastIndexOf('T'));
        System.out.println(c.substring(c.lastIndexOf('T'), c.lastIndexOf('T') +2 ));

        String s1 = "Javatpoint";
        String s2 = s1.intern();
        String s3 = new String("Javatpoint");
        String s4 = s3.intern();
        System.out.println(s1==s2); // True
        System.out.println(s1==s3); // False
        System.out.println(s1==s4); // True
        System.out.println(s2==s3); // False
        System.out.println(s2==s4); // True
        System.out.println(s3==s4); // False


    }

    protected void practice2(){
        String c= "TEA TEA";
        String z= "What is the price of";
        StringBuilder txt = new StringBuilder();
        System.out.println(txt.capacity());
        StringBuilder txt2 = new StringBuilder(c);
        System.out.println(txt2.capacity());

        System.out.println(txt2.replace(0,3,"What is the price of"));
    }
}
