package training.numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class ExampleNumbers {

    public static void main(String[] args) {

        new ExampleNumbers().test1();
    }
    protected void test1(){
        BigDecimal price =new BigDecimal(1.85);
        Locale locale = Locale.US;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        System.out.println(currencyFormat.format(price));
        System.out.println(percentFormat.format(price));
    }
}
