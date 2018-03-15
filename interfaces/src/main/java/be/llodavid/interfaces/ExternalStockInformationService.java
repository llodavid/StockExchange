package be.llodavid.interfaces;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    public static BigDecimal getPriceInEuroForStock(String stockId) {
        return new BigDecimal(RandomUtils.nextDouble(10, 100));
    }
}
