package be.llodavid.domain;

import java.math.BigDecimal;

public class Stock {
    String id, name;
    StockPrice price;

    public Stock(String id, String name, StockPrice price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Stock(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public BigDecimal getStockPrice() {
        return price.getPrice();
    }
    public StockCurrency getCurrency() {
        return price.getCurrency();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setPrice(StockPrice price) {
        this.price = price;
    }
}
