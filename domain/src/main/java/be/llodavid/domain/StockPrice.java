package be.llodavid.domain;

import java.math.BigDecimal;

public class StockPrice {
    BigDecimal price;
    StockCurrency currency;

    public StockPrice(BigDecimal price, StockCurrency currency) {
        this.price = price;
        this.currency = currency;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public StockCurrency getCurrency() {
        return currency;
    }
}
