package be.llodavid.api;

import be.llodavid.domain.Stock;
import be.llodavid.domain.StockCurrency;
import org.springframework.context.annotation.Primary;

import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class StockMapper {

    public StockDTO createStockDTO (Stock stock) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.name = stock.getName();
        stockDTO.id = stock.getId();
        stockDTO.currency = stock.getStockPrice() != null ? stock.getCurrency() : StockCurrency.EUR;
        stockDTO.price = stock.getStockPrice() != null ? stock.getStockPrice() : new BigDecimal(0);
        return stockDTO;
    }
}
