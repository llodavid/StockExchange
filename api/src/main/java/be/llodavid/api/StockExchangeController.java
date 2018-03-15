package be.llodavid.api;

import be.llodavid.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.inject.Named;

@Named
@ResponseBody
@RequestMapping("/stocks")
public class StockExchangeController {

    private StockService stockService;
    private StockMapper stockMapper;

    @Inject
    public StockExchangeController(StockService stockService, StockMapper stockMapper) {
        this.stockMapper = stockMapper;
        this.stockService=stockService;
    }

    @GetMapping("/{stockId}")
    public StockDTO getStock(@PathVariable String stockId) {
        return stockMapper.createStockDTO(stockService.getStock(stockId));
    }
}
