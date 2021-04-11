package training.nestedclasses;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class LocalInnerClassExample {
    private Map<Integer, Item> items  = new HashMap<>();
    private void manageTax ( String saleLocation){
        class OrderTaxManager{
            private BigDecimal findRate(String  product){
                return new BigDecimal(1l);
            }
            BigDecimal calculateTax(){
                return new  BigDecimal(9);
            }

        }
    }
}
