package training.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExampleQuestions {
    public static void main(String[] args) {
        String a= "String".replace('g','G');
        String b= "String".replace('g','G');

        System.out.println("String".replace('g','G')=="String".replace('g','G') );
        System.out.println(a==b);

        double tax = .2;
        var condition = new Integer(1);
        switch (condition){
            case 1:
                System.out.println(1);
                var b7 = false;
                break;
            case 2:
                System.out.println(2); break;
        }

        for(var x : System.getProperties().entrySet()){
            Map<String,String> map = new HashMap<>();
            var _FEO = "fe";
        }
        String fullPhone= "123-456-7890";
        System.out.println(
                new StringBuilder("xxx-xxx-"+fullPhone.substring(8) )
        );
        System.out.println(
                new StringBuilder(fullPhone).replace(0,8,"xxx-xxx-" )
        );
        short s = 12;
        long g = 012;
        float f = -123;
        float df = (float) (0 * 1.5);
        System.out.println("String".replace('g','G')=="StrinG");
        System.out.println("String".replace('g','g')=="String");

    }
}
