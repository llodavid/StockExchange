package be.llodavid.service;

import be.llodavid.domain.Stock;
import be.llodavid.domain.StockCurrency;
import be.llodavid.domain.StockPrice;
import be.llodavid.domain.StockRepository;
import be.llodavid.interfaces.ExternalStockInformationService;

import javax.inject.Named;

@Named
public class StockService {
    public Stock getStock(String stockId) {
        StockRepository stockRepository = new StockRepository();
        Stock stock = stockRepository.getStockInformation(stockId);
        StockPrice price = new StockPrice(ExternalStockInformationService.getPriceInEuroForStock(stockId), StockCurrency.EUR);
        stock.setPrice(price);
        return stock;
    }
}
