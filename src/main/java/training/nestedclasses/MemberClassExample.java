package training.nestedclasses;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MemberClassExample {
    private Map<Integer, Item> items =new HashMap<>();

    private void manageTax(final String saleLocation) {
        new OrderTaxManagerMember().calculateTax();
    }

    class OrderTaxManagerMember {
        private BigDecimal findRate(String product) {
            return new BigDecimal(1l);
        }

        BigDecimal calculateTax() {
            return new BigDecimal(9);
        }


    }
}
