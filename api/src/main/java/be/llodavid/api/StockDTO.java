package be.llodavid.api;

import be.llodavid.domain.StockCurrency;

import java.math.BigDecimal;

public class StockDTO {
    public String id, name;
    public BigDecimal price;
    public StockCurrency currency;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(StockCurrency currency) {
        this.currency = currency;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StockDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                " " + currency +
                '}';
    }
}
