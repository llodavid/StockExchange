package be.llodavid.domain;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class StockRepository {
    private Map<String, Stock> stocks;


    public StockRepository() {
        stocks = new ImmutableMap.Builder<String,Stock>()
        .put("CM",new Stock("CM", "Christelijke Mutualiteit"))
        .put("KBC",new Stock("KBC", "KBC Bank"))
        .put("OP",new Stock("OP", "Omega Pharma"))
        .put("P&G",new Stock("P&G", "Proctor & Gamble"))
        .build();
    }

    public Stock getStockInformation(String stockId) {
        if (!stocks.containsKey(stockId.toUpperCase())) {
            throw new IllegalArgumentException("There is no stock corresponding to this ID");
        }
        return stocks.get(stockId);
    }
}
